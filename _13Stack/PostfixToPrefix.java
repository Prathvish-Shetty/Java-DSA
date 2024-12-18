package _13Stack;

import java.util.Stack;

public class PostfixToPrefix {
    public static void main(String[] args) {
        String str = "953+4*6/-";
        Stack<String> val = new Stack<>();
        for (char ch : str.toCharArray()){
            if (Character.isDigit(ch))  val.push(ch+"");
            else{
                String v2 = val.pop();
                String v1 = val.pop();
                val.push(ch+v1+v2);
            }
        }
        System.out.println(val.peek());
    }
}
