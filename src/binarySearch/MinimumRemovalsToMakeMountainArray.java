package binarySearch;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MinimumRemovalsToMakeMountainArray {
    public static void main(String[] args) {
        int[] nums = {2,1,1,5,6,2,3,1};
//        int[] nums1 = {4,3,2,1,1,2,3,1};

        System.out.println(mountainArray(nums));
    }

    private static int mountainArray(int[] nums) {

        int n = nums.length;
        int[] left = new int[n];
        int[] right = new int[n];

        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0; i < n ; i++){
           left[i] =  indexBS(list,nums[i]);
        }

        list.clear();

        for (int i = n - 1;  i >= 0 ; i--) {
            right[i] =   indexBS(list,nums[i]);
        }

        int mountainCount = 0; // 3,3

        for(int i = 1; i < n - 1; i++){

            if(left[i] > 1 && right[i] > 1){
                mountainCount = Math.max(mountainCount, left[i] + right[i] - 1);
            }
        }
        return (n - mountainCount);
    }

    static int indexBS(List<Integer> list, int num ){
        int index  = Collections.binarySearch(list, num);
        if(index < 0 ) {
            index = -(index + 1);
        }
        if(index == list.size()){
            list.add(num);
        }else{
            list.set(index, num);
        }
        return index + 1;
    }
}
