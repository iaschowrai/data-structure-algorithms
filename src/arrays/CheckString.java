package arrays;

public class CheckString {
    public static void main(String[] args) {
        String s = "aaabbb";
        String s1 = "abab";
        String s2= "bbb";
        System.out.println(checkString(s));
        System.out.println(checkString(s1));
        System.out.println(checkString(s2));
    }

    public static boolean checkString(String s) {

        for (int i = 0; i < s.length() -1; i++) {
            if(s.charAt(i) == 'b' && s.charAt(i + 1) == 'a'){
                return false;
            }
        }
        return true;
    }
}
