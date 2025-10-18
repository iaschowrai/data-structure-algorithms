package binarySearch;

import java.util.Arrays;

public class FirstAndLastBS {
    public static void main(String[] args) {
        int[] arr = {5,7,7,8,8,10};
        int tgt = 8  ;

        System.out.println(Arrays.toString(findfirstNLast(arr,tgt)));
        System.out.println(Arrays.toString(searchRange(arr, tgt)));

    }

    private static int[] findfirstNLast(int[] arr, int tgt) {
        int start = 0 , end = arr.length - 1;

        int firstIndex = findFirstIndex(arr, tgt, start, end);
        int lastIndex = findLastIndex(arr, tgt, start, end);

        return new int[] {firstIndex, lastIndex};
    }

    private static int findFirstIndex(int[] arr, int tgt, int start, int end) {

        int ans = -1;
        while(start <= end){
            int mid = start + (end - start) / 2;

            if(tgt == arr[mid]){
                ans = mid;
                end = mid -1;
            }

            else if(tgt < arr[mid]){
                end = mid - 1;
            }else {
                start = mid + 1;
            }
        }
        return ans;

    }

    private static int findLastIndex(int[] arr, int tgt, int start, int end) {

        int ans = -1;
        while(start <= end){
            int mid = start + (end - start) / 2;

            if(tgt == arr[mid]){
                ans = mid;
                start = mid + 1;
            }

            else if(tgt < arr[mid]){
                end = mid - 1;
            }else {
                start = mid + 1;
            }
        }
        return  ans;
    }

    public static int[] searchRange(int[] arr, int target) {
        int[] result = {-1, -1};

        // Find first occurrence
        result[0] = search(arr, target, true);

        // If the first occurrence is not found, no need to find the last
        if (result[0] != -1) {
            result[1] = search(arr, target, false);
        }

        return result;
    }

    private static int search(int[] arr, int target, boolean findStartIndex) {
        int start = 0, end = arr.length - 1, ans = -1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                ans = mid;
                if (findStartIndex) {
                    end = mid - 1; // search left half
                } else {
                    start = mid + 1; // search right half
                }
            }
        }
        return ans;
    }
}
