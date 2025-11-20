package org.example.strings.easy;

import java.util.HashMap;
import java.util.Map;

public class CountCharacterFrequency {
    public static void main(String[] args) {
        String input = "success";
        countCharacter(input);
    }

    private static void countCharacter(String input) {
        Map<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < input.length(); i++) {
            map.put(input.charAt(i), map.getOrDefault(input.charAt(i),0)+ 1);
        }

        System.out.println(map);

    }
}
