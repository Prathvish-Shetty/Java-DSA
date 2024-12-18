package _13Stack;

import java.util.Stack;

public class Infix {
    public static void main(String[] args) {
        String str = "9-(5*3+4)/6";
        System.out.println(str);
        Stack<Integer> val = new Stack<>();
        Stack<Character> op = new Stack<>();
        for (char ch : str.toCharArray()) {
            if (ch>='0' && ch<='9') val.push(ch-'0');
            else if (op.isEmpty() || ch=='(' || op.peek()=='(')  op.push(ch);
            else if (ch==')') {
                while (op.peek()!='('){
//                    do the operation
                    int v2 = val.pop();
                    int v1 = val.pop();
                    if (op.peek()=='+') val.push(v1+v2);
                    if (op.peek()=='-') val.push(v1-v2);
                    if (op.peek()=='*') val.push(v1*v2);
                    if (op.peek()=='/') val.push(v1/v2);
                    op.pop();
                }
                op.pop();
            } else {
                if (ch=='+' || ch=='-'){
//                   we will always have to do the operation
                    int v2 = val.pop();
                    int v1 = val.pop();
                    if (op.peek()=='+') val.push(v1+v2);
                    if (op.peek()=='-') val.push(v1-v2);
                    if (op.peek()=='*') val.push(v1*v2);
                    if (op.peek()=='/') val.push(v1/v2);
                    op.pop();
                    op.push(ch);
                } else if (ch=='*' || ch=='/') {
                    if (op.peek()=='*' || op.peek()=='/'){
                        int v2 = val.pop();
                        int v1 = val.pop();
                        if (op.peek()=='*') val.push(v1*v2);
                        if (op.peek()=='/') val.push(v1/v2);
                        op.pop();
                        op.push(ch);
                    }
                    else op.push(ch);
                }
            }
        }
        while(!op.isEmpty()){
            int v2 = val.pop();
            int v1 = val.pop();
            if (op.peek()=='+') val.push(v1+v2);
            if (op.peek()=='-') val.push(v1-v2);
            if (op.peek()=='*') val.push(v1*v2);
            if (op.peek()=='/') val.push(v1/v2);
            op.pop();
        }
        System.out.println(val.peek());
    }
}
/*
    We need 2 stacks - Number(single digit number),operator
    if character is number then push it into number stack
    if character is operator :
        if operator stack is empty then push it into stack
        else we see operator on top of stack,if its precedence is >= current operator,we first complete operation for
        operator on top of stack and then push the current operator
    if(op.size()==0 || ch=='(') push
    if(ch=='(') do operation by popping
*/

//package Stack;

//import java.util.Stack;

//public class Infix {
//    public static void main(String[] args) {
//        String str = "9-(5+3)*(4/6)";
//        System.out.println(evaluateInfix(str));
//    }
//
//    public static int evaluateInfix(String expression) {
//        Stack<Integer> val = new Stack<>();
//        Stack<Character> op = new Stack<>();
//        for (char ch : expression.toCharArray()) {
//            if (Character.isDigit(ch)) {
//                val.push(ch - '0');
//            } else if (ch == '(') {
//                op.push(ch);
//            } else if (ch == ')') {
//                while (!op.isEmpty() && op.peek() != '(') {
//                    int v2 = val.pop();
//                    int v1 = val.pop();
//                    val.push(applyOp(op.pop(), v1, v2));
//                }
//                // Discard the opening bracket '('
//                op.pop();
//            } else {
//                // Operator encountered
//                while (!op.isEmpty() && precedence(op.peek()) >= precedence(ch)) {
//                    int v2 = val.pop();
//                    int v1 = val.pop();
//                    val.push(applyOp(op.pop(), v1, v2));
//                }
//                op.push(ch);
//            }
//        }
//        // Perform remaining operations
//        while (!op.isEmpty()) {
//            int v2 = val.pop();
//            int v1 = val.pop();
//            val.push(applyOp(op.pop(), v1, v2));
//        }
//        return val.peek();
//    }
//
//    // Function to return precedence of operators
//    public static int precedence(char op) {
//        if (op == '+' || op == '-')
//            return 1;
//        if (op == '*' || op == '/')
//            return 2;
//        return 0; // Default precedence for '('
//    }
//
//    // Function to perform operation
//    public static int applyOp(char op, int a, int b) {
//        return switch (op) {
//            case '+' -> a + b;
//            case '-' -> a - b;
//            case '*' -> a * b;
//            case '/' -> {
//                if (b == 0) throw new
//                        UnsupportedOperationException("Cannot divide by zero");
//                yield a / b;
//            }
//            default -> 0;
//        };
//    }
//}
