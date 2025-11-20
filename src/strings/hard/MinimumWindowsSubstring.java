package org.example.strings.hard;

/*
Time & Space Complexity

Time: O(n + m)
(n = length of s, m = length of t)

Space: O(1)
(fixed size ASCII array)
 */
public class MinimumWindowsSubstring {
    public static void main(String[] args) {
        String input = "ADOBECODEBANC";
        String target = "ABC";
        System.out.println(minimumWindowSubstring(input, target));
    }

    private static String minimumWindowSubstring(String s, String target) {
        int left = 0, right = 0;
        int minLen = Integer.MAX_VALUE;
        int startIndex = 0;
        int count = target.length();

        int[] hash = new int [128];

        for (char ch : target.toCharArray()){
            hash[ch]++;
        }

        while(right < s.length()){
            char ch = s.charAt(right);
            if(hash[ch] > 0) count--;
            hash[ch]--;
            right++;

            while(count == 0) {
                if(right - left  < minLen ){
                    minLen = right - left;
                    startIndex = left;
                }
                char cl = s.charAt(left);
                hash[cl]++;
                if (hash[cl] > 0){
                    count++;
                }
                left++;
            }
        }

       return s.substring(startIndex, startIndex + minLen);
    }
}
