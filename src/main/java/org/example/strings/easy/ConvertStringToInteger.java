package org.example.strings.easy;

public class ConvertStringToInteger {
    public static void main(String[] args) {
        String input = "123";
        int num = Integer.parseInt(input);
        System.out.println(num);
        stringToInteger(input);
    }

    private static void stringToInteger(String input) {
        int num = 0;
        for (char c : input.toCharArray()){
            num = num * 10 + (c - '0');
        }
        System.out.println(num);
    }
}
