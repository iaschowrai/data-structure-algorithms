package arrays;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class HeightChecker {

    public static void main(String[] args) {
        int[] arr = {1,1,4,2,1,3};
//        int[] arr = {5,1,2,3,4};
        System.out.println((happyPath(arr)));

      }

    private static int happyPath(int[] arr) {

        int[] expected = Arrays.copyOf(arr, arr.length);
        Arrays.sort(expected);

        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != expected[i]) {
                count++;
            }
        }
        return count;
    }
}
