package string;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class CountTheNumberOfWord {
    public static void main(String[] args) {
        String s = "The Life is Not aLie and live the lifE";

        Map<String, Long> wordsCount = Arrays.stream(s.split("\\s+"))
                .map(word -> word.toLowerCase())
                .collect(Collectors.groupingBy(words -> words , Collectors.counting()));

        wordsCount.forEach((word,count) -> System.out.println("Word: " + word +"  " + "Counts: " + count ));


        int charCount = s.length();
        System.out.println(charCount);
        long charCountChar = s.chars().count();
        System.out.println(charCountChar);
    }
}
