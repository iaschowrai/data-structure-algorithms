package org.example.strings.easy;

public class ReverseAString {
    public static void main(String[] args) {
        String input = "Hello";
        System.out.println("Before reverse: "+ input);

        reverseString(input);
    }

    private static void reverseString(String s) {

        StringBuilder sb = new StringBuilder(s);
        System.out.println("Using StringBuilder: "+ sb.reverse());

        String rev = "";
        for (int i = s.length() - 1; i >= 0 ; i--) {
            rev = rev + s.charAt(i);
        }
        System.out.println("After Reverse the String: " +rev );
        // correct approach
        StringBuilder reversed = new StringBuilder();
        for (int i = s.length() - 1; i >= 0 ; i--) {
            reversed.append(s.charAt(i));
        }
        System.out.println("After Reverse the String: " +reversed );

    }
}
