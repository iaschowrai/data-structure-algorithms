package binarySearch;

import java.util.ArrayList;
import java.util.Arrays;

public class searchInfiniteNumberBS {
    public static void main(String[] args) {
        int[] arr = {11,22,30,32, 33,44,45};
        int tgt = 32;
        System.out.println(searchInfinite(arr, tgt));
    }

    private static int searchInfinite(int[] arr, int tgt) {

        int start = 0, end = 1;

        while(arr[end] <= tgt){

            int newStart = end + 1;
            end = end +(end - start + 1) *2;
            start = newStart;
        }
        System.out.println(end);

        return searchBS(arr, tgt, start, end);
    }

    static int searchBS(int[] arr, int tgt, int start, int end){

        while(start<= end){
            int mid = start +( end- start) /2;

            if(arr[mid] == tgt){
                return mid;
            }else if(tgt > arr[mid]){
                start = mid + 1;
            }else{
                end = mid - 1;
            }
        }
        return -1;
    }
}
