package _13Stack;

import java.util.Stack;

public class PostfixEvaluation {
    public static void main(String[] args) {
        String str = "953+4*6/-";
        Stack<Integer> val = new Stack<>();
        for (char ch : str.toCharArray()){
            if (Character.isDigit(ch)){
                val.push(ch-'0');
            } else {
                int v2 = val.pop();
                int v1 = val.pop();
                if (ch=='+') val.push(v1+v2);
                if (ch=='-') val.push(v1-v2);
                if (ch=='*') val.push(v1*v2);
                if (ch=='/') val.push(v1/v2);
            }
        }
        System.out.println(val.peek());
    }
}
