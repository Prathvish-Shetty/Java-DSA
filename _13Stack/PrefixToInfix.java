package _13Stack;

import java.util.Stack;

public class PrefixToInfix {
    public static void main(String[] args) {
        String str = "-9/*+5346";
        Stack<String> val = new Stack<>();
        for (int i = str.length() - 1; i >= 0; i--) {
            char ch = str.charAt(i);
            if (Character.isDigit(ch))
                val.push(ch + "");
            else {
                String v1 = val.pop();
                String v2 = val.pop();
                val.push('('+v1+ch+v2+')');
            }
        }
        System.out.println(val.peek());
    }
}
