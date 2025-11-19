package string;

import java.util.Stack;

public class ValidParenthisis {
    public static void main(String[] args) {
        String str = "{()}";

        System.out.println(validParanthesisUsingStack(str));
        System.out.println(validParanthesis(str));

    }

    private static boolean validParanthesis(String str) {
        int sqrBracket = 0, curlyBracket = 0, parenthesis = 0;

        for(char ch : str.toCharArray()){
            if(ch == '('){
                parenthesis++;
            }else if(ch == ')'){
                parenthesis--;
            }else if(ch == '{'){
                curlyBracket++;
            }else if(ch == '}'){
                curlyBracket--;
            }else if(ch == '['){
                sqrBracket++;
            }else if(ch == ']'){
                sqrBracket--;
            }
        }

        return parenthesis== 0 && sqrBracket == 0 && curlyBracket == 0;
    }

    private static boolean validParanthesisUsingStack(String str) {

        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i)=='(' || str.charAt(i)=='{' || str.charAt(i)=='[') {
                stack.push(str.charAt(i));
            }
            if(str.charAt(i)==')' || str.charAt(i)=='}' || str.charAt(i)==']') {
                if(stack.isEmpty()) return false;
                char top = stack.pop();
                if((str.charAt(i) == ')' && top != '(') ||
                        (str.charAt(i) == ']' && top != '[') ||
                        (str.charAt(i) == '}' && top != '{'))  {
                    return false;
                }
            }

        }
        return stack.isEmpty();
    }
}
