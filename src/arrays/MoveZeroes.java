package arrays;

import java.util.Arrays;

public class MoveZeroes {
    public static void main(String[] args) {
        int[] arr = {0,1,0,3,12};
        System.out.println(Arrays.toString(moveZeros(arr)));
    }

    private static int[] moveZeros(int[] arr) {

        int count = 0, idx = 0;

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] != 0){
                arr[idx] = arr[i];
                idx++;
            }else{
                count++;
            }
        }

        System.out.println(count);
        System.out.println(idx);

        while(count > 0){
            count--;
            arr[idx] = 0;
            idx++;
        }
        return arr;
    }
}
