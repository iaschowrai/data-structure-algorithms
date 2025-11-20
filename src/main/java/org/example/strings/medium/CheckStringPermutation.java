package org.example.strings.medium;

public class CheckStringPermutation {
    public static void main(String[] args) {
        System.out.println(isPermutation("abc", "bcz")); // true

    }

    private static boolean isPermutation(String s1, String s2) {
        if (s1.length() != s2.length()) return false;

        int[] count = new int[256];

        for (char c : s1.toCharArray()){
            count[c]++;
        }
        for (char c : s2.toCharArray()){
            if(--count[c] < 0) return false;
        }

        return true;
    }
}
