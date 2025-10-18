package binarySearch;

import jdk.jfr.DataAmount;
import org.graalvm.nativeimage.c.struct.UniqueLocationIdentity;

import javax.annotation.processing.Generated;

public class RotationCountRotatedSortedArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        System.out.println(findRotationCount(arr));
    }

    private static int findRotationCount(int[] arr) {

        int start = 0, end = arr.length - 1;

        while(start < end){
            int mid = start + (end - start) / 2;
            if(arr[mid] > arr[end]){
                start = mid + 1;
            }else{
                end = mid;
            }
        }

        return start;
    }
}
