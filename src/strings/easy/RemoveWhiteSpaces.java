package org.example.strings.easy;

public class RemoveWhiteSpaces {
    public static void main(String[] args) {
        String input = "a b c d e f";

        System.out.println("Removed white spaces: " + input.replaceAll(" ", ""));
        System.out.println("First Letter into Capital letter: " + Character.toUpperCase(input.charAt(0)) + input.substring(1));
    }
}
