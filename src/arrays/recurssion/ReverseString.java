package arrays.recurssion;

public class ReverseString {
    public static void main(String[] args) {

     String s = "Hello";
     System.out.println(printReverse(s));

     char[] string = {'h','e','l','l','o'};
        reverseString(string, 0,string.length - 1);

    }

    private static void reverseString(char[] string, int left, int right) {
        if(left >= right){
            return;
        }
        char temp = string[left];
        string[left] = string[right];
        string[right] = temp;

         reverseString(string, left+ 1, right -1);
    }

    private static String printReverse(String s) {
        if(s == null || s.isEmpty()){
            return "";
        }
        return printReverse(s.substring(1))+ s.charAt(0);
    }
}
