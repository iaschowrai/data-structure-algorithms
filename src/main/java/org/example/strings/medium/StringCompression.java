package org.example.strings.medium;

public class StringCompression {
    public static void main(String[] args) {
        System.out.println(compression("aabcccccaaal"));
    }

    private static String compression(String s) {

        StringBuilder sb = new StringBuilder();

        int count = 1;
        for (int i = 1; i <= s.length(); i++) {
            if (i < s.length() && s.charAt(i) == s.charAt(i - 1)) {
                count++;
            } else {
                sb.append(s.charAt(i - 1)).append(count);
                count = 1;
            }
        }
        return sb.length() < s.length() ? sb.toString() : s;
    }
}
