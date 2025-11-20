package org.example.strings.medium;

import java.util.Arrays;

public class StringRotationCheck {
    public static void main(String[] args) {
        System.out.println(isRotation("waterbottle", "erbottlewat")); // true

    }

    private static boolean isRotation(String s1, String s2) {

       if(s1.length() != s2.length()){
           return false;
       } else if ((s1 + s1).contains(s2)) {
           return true;
       }
    return false;
    }
}
