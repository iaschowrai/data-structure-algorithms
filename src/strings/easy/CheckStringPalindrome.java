package org.example.strings.easy;

public class CheckStringPalindrome {
    public static void main(String[] args) {
        String arrays[] = {"madam", "NON", "lOl", "maam" , "NOPE"};

        for (String arr : arrays){
            checkPalindrome(arr);
        }
    }

    private static void checkPalindrome(String s) {

        int left = 0, right = s.length() - 1;
        s = s.toLowerCase();

        while(left < right){
            if(s.charAt(left) != s.charAt(right)){
                System.out.println("Not palindrome");
                return;
            }
            left++;
            right--;
        }
        System.out.println("Palindorme");
    }
}
