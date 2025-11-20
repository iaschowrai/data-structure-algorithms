package string;

import java.util.HashMap;
import java.util.Map;

public class LongestSubstringWithoutRepeatingCharacters {
    public static void main(String[] args) {
//        String s = "abcabcbb";
        String s = "bbbb";
//        String s = "pwwkew";
        System.out.println(findUsingArray(s));  // TimeComplexity O(N) and space O(1)
        System.out.println(findUsingHashMap(s));
    }

    private static int findUsingHashMap(String s) {
        int left = 0, right = 0, maxCount = 0;
        Map<Character, Integer> map = new HashMap<>();

        while(right < s.length()){
           char ch = s.charAt(right);
           if(map.containsKey(ch)){
               left = Math.max(left, map.get(ch) + 1);
           }
           map.put(ch,right);
           maxCount = Math.max(maxCount, right - left + 1);
           right++;
        }


        return maxCount;
    }

    private static int findUsingArray(String s) {

        int[] array = new int[128];
        int maxLen = 0, left = 0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            left = Math.max(left, array[ch]);
            maxLen = Math.max(maxLen, i - left + 1);
            array[ch] = i + 1;
            
        }
        return maxLen;
    }
}
