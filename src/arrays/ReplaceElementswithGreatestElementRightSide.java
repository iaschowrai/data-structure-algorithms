package arrays;

import java.util.Arrays;
import java.util.List;

public class ReplaceElementswithGreatestElementRightSide {
    public static void main(String[] args) {
        int[] arr = {17, 18, 5, 4, 6, 1};

//        System.out.println(Arrays.toString(firstApproach(arr)));
        System.out.println(Arrays.toString(optimizeApproach(arr)));

    }

    private static int[] optimizeApproach(int[] arr) {
        int maxElement = -1;

        for (int i = arr.length - 1; i >= 0 ; i--) {
            int curr = arr[i];
            arr[i] = maxElement;
            maxElement = Math.max(maxElement,curr);
        }
        return arr;
    }

    static int[] firstApproach(int[] arr){
        int maxElement = -1;

        for(int i = 0; i < arr.length ; i++){
            for (int j = i+1; j < arr.length ; j++) {
                maxElement = Math.max(maxElement, arr[j]);
            }
            arr[i] = maxElement;
            maxElement = -1;
        }
        return arr;
    }
}
