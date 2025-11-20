package org.example.strings.medium;

import java.util.HashMap;
import java.util.Map;

/*
Sliding Window Problem 3 — Longest Substring with At Most K Distinct Characters
Problem Statement
Given a string s and integer k, find the length of the longest substring that contains at most k distinct characters.
 Time & Space Complexity
    Time: O(n)
    Space: O(k)
 */
public class LongestSubstringWithAtMostKDistintCharacters {
    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstringKDistinct("eceba", 4)); // Output: 5 eceba
        System.out.println(lengthOfLongestSubstringKDistinct("eceba", 2)); // Output: 3 ece
    }

    private static int lengthOfLongestSubstringKDistinct(String s, int k) {

        int left = 0, right =0;
        int maxLen = 0;
        Map<Character,Integer> map = new HashMap<>();

        if (k == 0) return 0;
        while (right < s.length()) {
            // Add character at 'right' to the map
            char rightChar = s.charAt(right);
            map.put(rightChar, map.getOrDefault(rightChar, 0) + 1);

            // If we have more than 'k' distinct characters, move the 'left' pointer
            while (map.size() > k) {
                char leftChar = s.charAt(left);
                map.put(leftChar, map.get(leftChar) - 1);
                if (map.get(leftChar) == 0) {
                    map.remove(leftChar);
                }
                left++;  // Move the 'left' pointer
            }

            // Update the maxLen if we found a longer valid substring
            maxLen = Math.max(maxLen, right - left + 1);
            right++;  // Move the 'right' pointer
        }

        return maxLen;
    }

}
