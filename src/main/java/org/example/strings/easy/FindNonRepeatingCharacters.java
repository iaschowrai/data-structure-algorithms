package org.example.strings.easy;

import java.util.HashMap;
import java.util.Map;

public class FindNonRepeatingCharacters {
    public static void main(String[] args) {
        String input = "swiss";
        Map<Character, Integer> map = new HashMap<>();

        for (char c : input.toCharArray()){
            map.put(c, map.getOrDefault(c,0) + 1);
        }

        for (Map.Entry<Character, Integer> entry : map.entrySet()){
            if(!(entry.getValue() > 1)){
                System.out.println("NonRepeating Character: " + entry.getKey());
            }
        }

        for (char c : map.keySet()){
            if(map.get(c) == 1){
                System.out.println("First Non Repeating Character: " + c);
                break;
            }
        }
    }
}
