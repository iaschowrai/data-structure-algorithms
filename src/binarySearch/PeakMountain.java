package binarySearch;

public class PeakMountain {
    public static void main(String[] args) {
        int[] arr = {1,2,1,3,5,6,4}; // {1,3,6,4,2,1}
        System.out.println(findPeakMountain(arr));
    }

    private static int findPeakMountain(int[] arr) {

        int start = 0, end = arr.length - 1;
        while(start < end){
            int mid = start + (end - start ) /2;

            if(arr[mid] > arr[mid+1]){
                end = mid;
            }else{
                start = mid + 1;
            }
        }
        return end;
    }

}
