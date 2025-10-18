package binarySearch;

public class FindMountainArray {
    // it's a bitonic array
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,3,1};
        int tgt = 3;
        System.out.println(findPeakInBitonic(arr, tgt));

    }

    public static int findPeakInBitonic(int[] arr, int tgt) {

        int start = 0, end = arr.length - 1;
        int peak = findPeak(arr, start, end);
        int firstTry = bs(arr, tgt, start, peak , true);
        if(firstTry != -1) return firstTry;
        else return bs(arr, tgt, peak + 1, end , false);
    }

    private static int bs(int[] arr, int tgt, int start, int end, boolean asc) {

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if(arr[mid] == tgt){
                return mid;
            }
            if(asc){
                if(arr[mid] < tgt){
                    start = mid + 1;
                }else{
                    end = mid - 1;
                }
            }else{
                if(arr[mid] > tgt){
                    end = mid - 1;
                }else{
                    start = mid + 1;
                }
            }
        }
        return -1;
    }

    private static int findPeak(int[] arr, int start, int end) {
        while(start < end){
            int mid = start + (end - start) / 2;
            if(arr[mid] > arr[mid + 1]){
                end = mid;
            }else{
                start = mid + 1;
            }
        }
        return start;
    }
}
