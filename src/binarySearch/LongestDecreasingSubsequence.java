package binarySearch;

import java.util.ArrayList;
import java.util.Collections;

public class LongestDecreasingSubsequence {
    public static void main(String[] args) {
        int[] nums = {10,9,2,5,3,7,101,18} ;
        System.out.println(findLongestDecreasingSubseq(nums));
    }

    private static int findLongestDecreasingSubseq(int[] nums) {

        ArrayList<Integer> list = new ArrayList<>();

        for (int num : nums){
            int val = -num;
            int index = Collections.binarySearch(list,val);
            if(index < 0 ){
                index = -(index + 1);
            }
            if(index == list.size()){
                list.add(val);
            }else{
                list.set(index,val);
            }
        }
        return list.size();
    }
}
