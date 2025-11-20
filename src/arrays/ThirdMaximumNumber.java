package arrays;

import java.util.TreeSet;

public class ThirdMaximumNumber {
    public static void main(String[] args) {
//        int[] nums = {3,2,1};
        int[] nums = {1,2,2,5,3,5};

        System.out.println(findThirdDistinctMaximum(nums));
    }

    private static int findThirdDistinctMaximum(int[] nums) {
        TreeSet<Integer> treeSet = new TreeSet<>();

        for (int num : nums){
            treeSet.add(num);
            if(treeSet.size() > 3){
                treeSet.pollFirst();
            }
        }

        if(treeSet.size() == 3){
            return treeSet.first();
        }else{
            return treeSet.last();
        }

    }
}
