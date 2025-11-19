package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindAllNumbersDisappearedArray {
    public static void main(String[] args) {
        int[] nums = {4,3,2,7,8,2,3,1};
        System.out.println(Arrays.toString(findAllNumbersDisappearedInArray(nums)));
        System.out.println((findAllNumbersDisappearedInArrayOptimize(nums)));
    }

    private static List<Integer> findAllNumbersDisappearedInArrayOptimize(int[] nums) {

        int n = nums.length;

        for(int num : nums){
            int index = Math.abs(num) - 1;
            if(nums[index] > 0){
                nums[index] = - nums[index];
            }
        }

        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if(nums[i] > 0 ){
                list.add(i+1);
            }
        }

        return list;
    }

    private static int[] findAllNumbersDisappearedInArray(int[] nums) {
        //with Extra Space

        int n = nums.length;
        boolean[] seen = new boolean[n+1];

        for(int num : nums){
            seen[num] = true;
        }

        int count = 0;
        for (int i = 1; i <=n; i++) {
            if(!seen[i]){
                count++;
            }
        }
        int idx = 0;
        int[] x = new int[count];

        for (int i = 1; i <= n; i++) {
            if(!seen[i]){
                x[idx] = i;
                idx++;

            }
        }

        return x;
    }
}
