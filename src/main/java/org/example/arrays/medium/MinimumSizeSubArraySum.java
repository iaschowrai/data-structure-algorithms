package org.example.arrays.medium;

import java.util.Arrays;

public class MinimumSizeSubArraySum {
    public static void main(String[] args) {
        int[] arr = {2,3,1,2,4,3};
//        int[] arr = {1,1,1,1,1,1,1};
        int target = 7;
//        int[] arr = {0,0,0,0,0,0,1};
//        int target = 1;

        System.out.println(Arrays.toString(minimumSubArraySum(arr, target)));
    }

    private static int[] minimumSubArraySum(int[] arr, int target) {
        int sum = 0;
        int minLen = Integer.MAX_VALUE;
        int start = 0 , end = 0;
        int[] result = {-1, -1};

        while(end < arr.length){
            sum = sum + arr[end];
            while(sum >= target){
                if (minLen > end - start + 1) {
                    minLen = end - start + 1;
                    result[0] = start;
                    result[1] = end;
                }
                sum = sum - arr[start];
                start++;
            }
            end++;
        }
        return result;
    }
}
