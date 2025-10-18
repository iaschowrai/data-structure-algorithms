package binarySearch;

public class CeilingInBS {
    public static void main(String[] args) {
        int[] arr = {2,3,5,9,14,16,18};
        int tgt = 15;
        System.out.println(searchCeiling(arr, tgt));
    }

    private static long searchCeiling(int[] arr, int tgt) {

        int start = 0, end = arr.length -1;

        while(start <= end){
            int mid = start + (end - start) / 2;
            if(arr[mid] == tgt){
                return mid;
            } else if (tgt < arr[mid]) {
                end = mid - 1;
            }else{
                start = mid + 1;
            }
        }

        return start;
    }
}
