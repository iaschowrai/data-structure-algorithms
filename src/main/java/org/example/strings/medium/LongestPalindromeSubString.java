package org.example.strings.medium;

public class LongestPalindromeSubString {
    public static void main(String[] args) {
        System.out.println(longestPalindrome("babad")); // bab

    }

    private static String longestPalindrome(String s) {

        if(s.length() < 2 ) return s;

        String res = "";

        for (int i = 0; i < s.length(); i++) {
            String p1 = extend(s, i , i); // check for odd length
            String p2 = extend(s, i , i + 1); // check for even length
            if(p1.length() > res.length()) res = p1;
            if(p2.length() > res.length()) res = p2;
        }
        System.out.println(res.length());
        return res;
    }

    static String extend(String s , int l , int r){
        while(l >= 0 && r < s.length() &&
                s.charAt(l) == s.charAt(r)){
            l--;
            r++;
        }
        return s.substring(l + 1 , r);
    }
}
