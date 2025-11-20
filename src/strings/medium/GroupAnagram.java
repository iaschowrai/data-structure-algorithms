package org.example.strings.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class GroupAnagram {
    public static void main(String[] args) {
        String[] words = {"eat","tea","tan","ate","nat","bat"};
        System.out.println(groupAnagrams(words));
    }

    private static List<List<String>> groupAnagrams(String[] words) {

        HashMap<String, List<String>> map = new HashMap<>();

        for (String word : words){
            char[] arr = word.toCharArray();
            Arrays.sort(arr);
            String key = new String(arr); // e.g., "eat" -> "aet"
            // Add the word to the correct anagram group
            // If the key is not present, create a new list for it
            map.computeIfAbsent(key, k-> new ArrayList<>()).add(word) ;
        }

        return new ArrayList<>(map.values());

    }
}
