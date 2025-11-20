package org.example.strings.easy;

public class CountVowels {
    public static void main(String[] args) {
        String input = "interview";
        countVowels(input);
    }

    private static void countVowels(String s) {
        s = s.toLowerCase();
        int vowelCounts = 0;
        int nonVowelCount = 0;
        for (char c : s.toCharArray()){
            if("aeiou".indexOf(c) != -1){
                vowelCounts++;
            }else if(Character.isLetter(c)){
                nonVowelCount++;
            }
        }
        System.out.println("total vowelCounts " + vowelCounts +  " nonVowelCount "+nonVowelCount);
    }
}
