package org.example.strings.medium;

import java.util.HashSet;
import java.util.Set;

public class LongestSubstringWithoutRepeatingCharacters {
    public static void main(String[] args) {
        System.out.println("1st : " + lengthOfLongestSubstring("pwwkew")); // 3

        System.out.println("2nd : " + secondApproach("abcabcab"));
    }
    /*
    Use a sliding window with HashSet.
    Expand right pointer until duplicate found.
    Remove from left until valid.
    Track max length.

    Time & Space Complexity
        Time: O(n)
        Space: O(min(n, charset))
     */

    private static int lengthOfLongestSubstring(String s) {

        Set<Character> set = new HashSet<>();
        int left = 0, maxLen = 0;

        for (int right = 0; right < s.length(); right++) {

            while(set.contains(s.charAt(right))){
                set.remove(s.charAt(left));
                left++;
            }

            set.add(s.charAt(right));
            maxLen = Math.max(maxLen, right - left + 1);
        }
        return maxLen;
    }


    private static  int secondApproach(String s){

        Set<Character> set = new HashSet<>();
        int left = 0, right = 0;
        int maxLen = 0;

        while(right < s.length()){

            if(!set.contains(s.charAt(right))){
                set.add(s.charAt(right));
                maxLen = Math.max(maxLen,right - left + 1);
                right++;
            }else{
                set.remove(s.charAt(left));
                left++;
            }


        }

        return maxLen;
    }
}
