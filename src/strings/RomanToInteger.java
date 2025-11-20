package string;

import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {
    public static void main(String[] args) {
        String s = "MCMXCIV";
        System.out.println(romanToInteger(s));
    }
/*
Input: s = "MCMXCIV"
Output: 1994
Explanation: M = 1000, CM = 900, XC = 90 and IV = 4.

 */
    private static int romanToInteger(String s) {
        int number = 0;

        Map<Character, Integer> map = new HashMap<>();
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);

        for (int i = 0; i < s.length(); i++) {
            int current = map.get(s.charAt(i));
            if(i + 1 < s.length() && current< map.get(s.charAt(i + 1)) ){
                number-=current;
            }else{
                number+=current;
            }
        }
        return number;
    }
}
