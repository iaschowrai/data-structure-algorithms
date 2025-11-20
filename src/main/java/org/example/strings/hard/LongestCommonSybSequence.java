package org.example.strings.hard;

import java.util.Arrays;

public class LongestCommonSybSequence {
    public static void main(String[] args) {
        String input1 = "mops";
        String input2 = "lmnopqrs";

        System.out.println(longestCommonSubSequence(input1, input2));
        System.out.println(isLongestCommonSubSequence(input1, input2));
        System.out.println(isLongestCommonSubSequenceString("abcde", "ace"));
    }
    private static int longestCommonSubSequence(String input1, String input2) {

        int s1 = input1.length();
        int s2 = input2.length();
        if (input2.isBlank()) return 0;

        int[][] dp = new int[s1 + 1][s2 + 1];


        for (int i = 1; i <= s1; i++) {
            for (int j = 1; j <= s2; j++) {

                if(input1.charAt(i - 1) == input2.charAt(j - 1)){

                    dp[i][j] = 1 + dp[i - 1][j - 1];

                }else {

                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][ j - 1]);

                }
            }
        }

        return dp[s1][s2];
    }

    private static boolean isLongestCommonSubSequence(String input1, String input2) {

        int s1 = input1.length();
        int s2 = input2.length();
        if (input2.isBlank()) return false;

        int[][] dp = new int[s1 + 1][s2 + 1];


        for (int i = 1; i <= s1; i++) {
            for (int j = 1; j <= s2; j++) {

                if(input1.charAt(i - 1) == input2.charAt(j - 1)){

                    dp[i][j] = 1 + dp[i - 1][j - 1];

                }else {

                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][ j - 1]);

                }
            }
        }

        return true;
    }
    private static String isLongestCommonSubSequenceString(String input1, String input2) {

        int s1 = input1.length();
        int s2 = input2.length();
        if (input2.isBlank()) return null;

        int[][] dp = new int[s1 + 1][s2 + 1];

        for (int i = 1; i <= s1; i++) {
            for (int j = 1; j <= s2; j++) {
                if(input1.charAt(i - 1) == input2.charAt(j - 1)){
                    dp[i][j] = 1 + dp[i - 1][j - 1];
                }else {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][ j - 1]);
                }
            }
        }

        // backtracking

        StringBuilder sb = new StringBuilder();

        int i = s1, j = s2;

        while( i > 0 && j  > 0){
            if(input1.charAt(i - 1) == input2.charAt(j - 1)){
                sb.append(input1.charAt(i - 1));
                i--;
                j--;
            }else if (dp[i - 1][j] > dp[i][j - 1]){
                i--;
            }else{
                j--;
            }
        }

        return sb.reverse().toString();
    }
}
