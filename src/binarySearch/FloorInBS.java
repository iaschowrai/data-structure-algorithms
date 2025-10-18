package binarySearch;

public class FloorInBS {
    public static void main(String[] args) {
        int[] arr = {2,3,5,9,14,16,18};
        int tgt = 15;
        System.out.println(searchFloor(arr, tgt));
    }

    private static long searchFloor(int[] arr, int tgt) {

        int start = 0, end = arr.length -1;

        if(tgt > arr[end]){
            return -1;
        }

        while(start <= end){
            int mid = start + (end - start) / 2;
            if(arr[mid] == tgt){
                return arr[mid];
            } else if (tgt < arr[mid]) {
                end = mid - 1;
            }else{
                start = mid + 1;
            }
        }

        return arr[end];
    }
}
