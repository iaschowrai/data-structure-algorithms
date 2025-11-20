package org.example.strings.easy;

import java.util.HashMap;
import java.util.Map;

public class FindDuplicateCharacters {
    public static void main(String[] args) {
        String s = "programming";
        duplicateChar(s);
    }

    private static void duplicateChar(String s) {

        Map<Character,Integer> mapDupChar = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            mapDupChar.put(s.charAt(i), mapDupChar.getOrDefault(s.charAt(i),0) + 1);
        }
        for (Map.Entry<Character, Integer> entry : mapDupChar.entrySet()){
            if(entry.getValue()> 1){
                System.out.println("Duplicate Character : " + entry.getKey() +" Count "+ entry.getValue());

            }
        }
    }
}
