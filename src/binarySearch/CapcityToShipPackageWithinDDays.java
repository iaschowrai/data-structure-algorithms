package binarySearch;

public class CapcityToShipPackageWithinDDays {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        int days = 5 ;

        int[] arr1 = {3,2,2,4,1,4};
        int days1 = 3;

        System.out.println(findTheDay(arr,days));
        System.out.println(findTheDay(arr1,days1));
    }

    private static int findTheDay(int[] arr, int days) {
        int low = 0 , high = 0;

        for(int array : arr){
            low = Math.max(low, array);
            high += array;
        }

        while(low < high){
            int mid = low + (high - low) / 2;

            if(findDays(arr, days, mid)){
                high = mid;
            }else{
                low = mid + 1;
            }
        }
        return low;

    }

    private static boolean findDays(int[] arr, int days, int mid) {
        int subArray = 1, sum = 0;

        for(int array : arr){
            sum+=array;
            if(sum > mid){
                subArray++;
                sum = array;
                if(subArray > days) return false;
            }
        }
        return true;
    }
}
