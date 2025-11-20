package org.example.strings.easy;

import java.util.Arrays;
import java.util.stream.Collectors;

public class ReverseWordsInASentence {
    public static void main(String[] args) {
        reverseAWordAndSentence("Java is fun program"); // margorp nuf si avaJ
        reverseASentence("Java is fun program"); // program is fun Java
        reverseAWordInSentence("Java is fun program"); // avaj si nuf margorp
    }

    private static void reverseAWordAndSentence(String s) {
        StringBuilder sb = new StringBuilder(s);
        System.out.println(sb.reverse());
    }

    private static void reverseASentence(String s) {
        String [] words = s.trim().split("\\s+");

        StringBuilder sb = new StringBuilder();

        for (int word = words.length -1; word >=0; word--){
            sb.append(words[word]);
            if(word != 0 ) sb.append(" ");
        }

        System.out.println("Reverse A Sentence: " + sb);
    }

    private static void reverseAWordInSentence(String s) {

        String [] words = s.trim().split("\\s+");

        StringBuilder sb = new StringBuilder();

        for (String word : words){
            char[] chars = word.toCharArray();
            int left = 0, right = chars.length - 1;
            while(left < right){
                char temp = chars[left];
                chars[left] = chars[right];
                chars[right] = temp;
                left++;
                right--;
            }
            sb.append(chars).append(" ");
        }
        System.out.println(sb.toString().trim());

        String result = Arrays.stream(s.trim().split("\\s+"))
                .map(word -> new StringBuilder(word).reverse().toString())
                .collect(Collectors.joining(" "));

        System.out.println("result: " + result);
    }
}
