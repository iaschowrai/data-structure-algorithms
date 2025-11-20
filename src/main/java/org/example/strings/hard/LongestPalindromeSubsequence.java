package org.example.strings.hard;

public class LongestPalindromeSubsequence {
    public static void main(String[] args) {
        // 🔹 Test Case 1: Regular input
        System.out.println("Longest Palindromic Subsequence Length: " + longestPalindromicSubseq("bbbab")); // Expected: 4 ("bbbb")

        // 🔹 Edge Case 1: Empty string
        System.out.println("Longest Palindromic Subsequence Length: " + longestPalindromicSubseq("")); // Expected: 0

        // 🔹 Edge Case 2: All characters unique
        System.out.println("Longest Palindromic Subsequence Length: " + longestPalindromicSubseq("abcde")); // Expected: 1 (any single char)
        System.out.println("Longest Palindromic Subsequence Length: " + longestPalindromicSubseq("character")); // Expected: 5 (any single char)
    }

    // Dynamic Programming
    private static int longestPalindromicSubseq(String s) {
        int n = s.length();
        if (n == 0) return 0;  // handle empty string case

        int[][] dp = new int[n][n];
        for (int i = n - 1; i >=0 ; i--) {
            dp[i][i] = 1; // base case: 1 char is always a palindrome
            for (int j = i + 1; j < n; j++) {
                if(s.charAt(i) == s.charAt(j)){
                    dp[i][j] = dp[i + 1][j - 1]+ 2;
                }else {
                    dp[i][j] = Math.max(dp[i + 1][j], dp[i][j - 1]);
                }

            }
        }

        return dp[0][n-1];

    }
}
