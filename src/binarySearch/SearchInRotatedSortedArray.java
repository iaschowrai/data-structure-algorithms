package binarySearch;


// Important question understand the concept
// check distinct value means no duplicate
public class SearchInRotatedSortedArray {

    public static void main(String[] args) {
        int[] arr = {3,4,5,6,7,0,1,2};
        int tgt = 0;
        System.out.println(findRotatedArrayIndex(arr, tgt));
        System.out.println(searchRotatedArrayOptimizedSolution(arr, tgt));
    }

    public static int searchRotatedArrayOptimizedSolution(int[] nums, int target) {
        int start = 0, end = nums.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (nums[mid] == target) return mid;

            // Left half is sorted
            if (nums[start] <= nums[mid]) {

                if (target >= nums[start] && target < nums[mid]) {
                    end = mid - 1; // target in left half

                } else {
                    start = mid + 1; // target in right half
                }
            }
            // Right half is sorted
            else {
                if (target > nums[mid] && target <= nums[end]) {
                    start = mid + 1; // target in right half
                } else {
                    end = mid - 1; // target in left half
                }
            }
        }

        return -1; // not found
    }

    private static int findRotatedArrayIndex(int[] arr, int tgt) {
        int start = 0 , end = arr.length - 1;
        findPivotAnotherApproach(arr,start,end);
        int pivot = findPivot(arr, start, end);
        if (pivot == 0) {
            return bs(arr, tgt, 0, end ); // array not rotated
        }
        if(tgt >= arr[pivot] && tgt <= arr[end]){
            return bs(arr,tgt,pivot,end);    // If target is in right side of pivot
        }else {
            return bs(arr,tgt,start,pivot -1);        // Otherwise, target is in left side
        }
    }

    private static int findPivot(int[] arr, int start, int end) {
        // Find index of smallest element (pivot) in this it found 0

        while(start < end){
            int mid = start + (end - start) / 2;

            if(arr[mid] > arr[end]) {
                start = mid + 1; // pivot is in right half
            }
            else {
                end = mid; // pivot is mid or left half
            }
        }
        return start;
    }

    static int findPivotAnotherApproach(int[] arr, int start, int end){
        // {3,4,5,6,7,0,1};
        // Find index of largest element (pivot) in this it found -1
        while(start <= end){
            int mid = start + (end - start) / 2;

            if( mid < end && arr[mid] > arr[mid + 1]){  // scenario when mid -> 7 and (mid + 1) -> 0
                return mid;
            }
            if(mid > start && arr[mid] < arr[mid - 1]){  // scenario when mid is 0 and mid - 1 is 7
                return mid - 1;
            }
            // Case 3: Pivot in right half
            if (arr[mid] >= arr[start]) {   //  need to figure out is the asc sorted to move right side of mid
                start = mid + 1;
            } else {
                // Pivot in left half
                end = mid - 1;  // and this one asc sorted to move left side of mid
            }
        }

        return -1;
    }
    private static int bs(int[] arr, int tgt, int start, int end) {

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == tgt) return mid;
            else if (arr[mid] < tgt) start = mid + 1;
            else end = mid - 1;
        }
        return -1;
    }

}
