package arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class RemoveDuplicateNumbers {
    public static void main(String[] args) {
        int[] arr = {0,0,1,1,1,2,2,3,3,4};
//        int[] arr = {1,1,2};
//        System.out.println(removeDupElement(arr));
        System.out.println(findHowManyDuplicates(arr));


        int[] arr1 = {0,1,1,1,2,3};
        int key = 1;
//        System.out.println(Arrays.toString(findTheIndexOfDuplicateWithKey(arr1, key))); // output 1,3
//        System.out.println(Arrays.toString(findTheIndexOfDuplicateWithoutKey(arr1)));
    }

    private static int removeDupElement(int[] nums) {

        int k = 1;
        for(int i = 1 ; i < nums.length; i++){
            if(nums[i] != nums[i - 1]){
                nums[k] = nums[i];
                k++;
            }
        }
        return k;
    }
    private static long findHowManyDuplicates(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }
        System.out.println(map);
        long k =  map.values().stream().filter(v -> v > 1).count();
        return k;
    }

    private static int[] findTheIndexOfDuplicateWithoutKey(int[] arr) {
        int start = -1, end = -1;
        for (int i = 0; i < arr.length - 1; i++) {
            if(arr[i] == arr[i + 1]){
                if(start == -1){
                    start = i;
                }
                end = i + 1;

            }
        }
        return new int[] {start, end};
    }

    private static int[] findTheIndexOfDuplicateWithKey(int[] arr, int key) {
        int start = -1, end = -1;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == key){
                if(start == -1){
                    start = i;
                }
            }
            end = i;

        }
        return new int[] {start, end};
    }
}
