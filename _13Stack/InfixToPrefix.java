package _13Stack;
import java.util.Stack;

public class InfixToPrefix {
    public static void main(String[] args) {
        String str = "8-(5+3)*(4/6)";
        System.out.println(str);
        Stack<String> val = new Stack<>();
        Stack<Character> op = new Stack<>();
        for (char ch : str.toCharArray()){
            if (Character.isDigit(ch)){
                String s = ""+ch;
                val.push(s);
            }
            else if (op.isEmpty() || ch=='(' || op.peek()=='(') op.push(ch);
            else if (ch==')') {
                while (op.peek()!='('){
//                    do the operation
                    String v2 = val.pop();
                    String v1 = val.pop();
                    char o = op.pop();
                    val.push(o+v1+v2);
                }
                op.pop();   // remove the opening bracket
            }
            else {
                if (ch=='+' || ch=='-'){
//                    always do the operation
                    String v2 = val.pop();
                    String v1 = val.pop();
                    char o = op.pop();
                    val.push(o+v1+v2);
                    op.push(ch);
                } else if (ch=='*' || ch=='/') {
                    if (op.peek()=='*' || op.peek()=='/'){
                        String v2 = val.pop();
                        String v1 = val.pop();
                        char o = op.pop();
                        val.push(o+v1+v2);
                        op.push(ch);
                    }
                    else op.push(ch);
                }
            }
        }
        while (!op.isEmpty()){
            String v2 = val.pop();
            String v1 = val.pop();
            char o = op.pop();
            val.push(o+v1+v2);
        }
        System.out.println(val.peek());
    }
}
