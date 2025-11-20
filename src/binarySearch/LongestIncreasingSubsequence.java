package binarySearch;

import java.util.ArrayList;
import java.util.Collections;

public class LongestIncreasingSubsequence {
    public static void main(String[] args) {
        int[] nums = {10,9,2,5,3,7,101,18} ;
        System.out.println(findLongestIncreasingSubseq(nums));
    }

    private static int findLongestIncreasingSubseq(int[] nums) {

        ArrayList<Integer> list = new ArrayList<>();

        for (int num : nums){
            int index = Collections.binarySearch(list,num);
            if(index < 0){
                index =  - (index + 1);
            }
            if(index == list.size()){
                list.add(num);
            }else{
                list.set(index,num);
            }
        }
        return list.size();

    }
}
