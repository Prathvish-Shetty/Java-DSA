package _13Stack;
import java.util.Stack;

public class InfixToPostFix {
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
                    val.push(v1+v2+o);
                }
                op.pop();   // remove the opening bracket
            }
            else {
                if (ch=='+' || ch=='-'){
//                    always do the operation
                    String v2 = val.pop();
                    String v1 = val.pop();
                    char o = op.pop();
                    val.push(v1+v2+o);
                    op.push(ch);
                } else if (ch=='*' || ch=='/') {
                    if (op.peek()=='*' || op.peek()=='/'){
                        String v2 = val.pop();
                        String v1 = val.pop();
                        char o = op.pop();
                        val.push(v1+v2+o);
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
            val.push(v1+v2+o);
        }
        System.out.println(val.peek());
    }
}
// infix to prefix and postfix have same logic just change the order of v1,v2,o