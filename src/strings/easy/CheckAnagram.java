package org.example.strings.easy;

import java.util.Arrays;

public class CheckAnagram {
    public static void main(String[] args) {
        isAnagram("listen", "silena");
    }

    private static void isAnagram(String s1, String s2) {

        if(s1.length() != s2.length()){
            System.out.println("Its not Anagram");
            return;
        }

        char[] a1 = s1.toCharArray();
        char[] a2 = s2.toCharArray();

        Arrays.sort(a1);
        Arrays.sort(a2);

        boolean c = Arrays.equals(a1,a2);
        if(c) System.out.println("Its Anagram");
        else System.out.println("Its not Anagram");
    }
}
