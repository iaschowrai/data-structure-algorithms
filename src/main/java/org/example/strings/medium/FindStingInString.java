package org.example.strings.medium;

public class FindStingInString {
    public static void main(String[] args) {
        System.out.println(strStr("hello", "ll")); // 2
    }
    /*
    Returns the index of the first occurrence of the needle string in the haystack string, or -1 if needle is not part of haystack.
    Because "ll" starts at index 2 in "hello".
     */

    private static int strStr(String haystack, String needle) {

        if(needle.isEmpty()) return 0;

        //Why <= instead of <? Because needle can start at the last valid index (e.g., if haystack="abc" and needle="c").
        for (int i = 0; i <= haystack.length() - needle.length(); i++) {
            int j = 0;
            while( j < needle.length() && haystack.charAt(i + j) == needle.charAt(j)){
                j++;
            }
            if(j == needle.length()) return i;
        }
        return -1;
    }
}
