package arrays;

import java.util.Arrays;

public class RemoveNumber {
    public static void main(String[] args) {
        int[] arr = {3,2,2,3};
        int val = 3;
        System.out.println(removeElement(arr,val));
    }


    static int removeElement(int[] nums, int val) {

        int k = 0;
        for(int i = 0 ; i < nums.length; i++){
            if(val != nums[i]){
                nums[k] = nums[i];
                k++;
            }
        }
        return k;
    }
}
