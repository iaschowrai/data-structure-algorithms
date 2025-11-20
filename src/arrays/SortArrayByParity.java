package arrays;

import java.util.Arrays;

public class SortArrayByParity {
    public static void main(String[] args) {
//        int[] arr = {0,1,2};
        int[] arr = {3,1,2,4};
//        int[] arr = {3,0,1};
        System.out.println(Arrays.toString(sortArrayByParityWithExtraSpace(arr)));
        System.out.println(Arrays.toString(sortArrayByParityWithoutExtraSpace(arr)));
    }
    private static int[] sortArrayByParityWithoutExtraSpace(int[] nums) {

        int left = 0 ,right = nums.length - 1;
        while(left < right){
            if(nums[left] % 2 == 0 ) {
                left++;
            }else if(nums[right] % 2 != 0 ){
                right--;
            }else if(nums[left] %2 != 0 && nums[right] %2 == 0) {
                int curr = nums[right];
                nums[right] = nums[left];
                nums[left] = curr;
                left++;
                right--;
            }
        }
        return nums;
    }


    private static int[] sortArrayByParityWithExtraSpace(int[] nums) {

        int k = 0 ;
        int n = nums.length - 1;
        int[] arr = new int[n+1];

        for (int i = 0; i < nums.length; i++) {
            if(nums[i] % 2 != 0){
                arr[n--] = nums[i];
            }else{
                arr[k++] = nums[i];
            }
        }
        return arr;
    }
}
