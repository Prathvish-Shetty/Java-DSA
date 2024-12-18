package _13Stack;

import java.util.Stack;

public class Basic {
    public static void displayReverse(Stack<Integer> st){    // display reverse stack
        if (st.isEmpty())   return;
        int top = st.pop();
        System.out.print(top+" ");
        displayReverse(st);
        st.push(top);
        System.out.println();
    }
    public static void display(Stack<Integer> st){    // display reverse stack
        if (st.isEmpty())   return;
        int top = st.pop();
        display(st);
        System.out.print(top+" ");
        st.push(top);
    }
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(10);
        st.push(20);
        st.push(30);
        System.out.println(st);
//        System.out.println(st.peek());
//        System.out.println(st.pop());
//        access first element inserted in stack
//        while (st.size()>1){
//            st.pop();
//        }
//        System.out.println(st.peek());
//        System.out.println(st.isEmpty());

/*      reversing a stack
        Stack<Integer> st_reversed = new Stack<>();
        while(!st.isEmpty()){
            st_reversed.push(st.pop());
        }
        System.out.println(st_reversed);
*/

/*      Copying elements of a stack
        Stack<Integer> temp = new Stack<>();
        while (!st.isEmpty()){
            temp.push(st.pop());
        }
        Stack<Integer> newSt = new Stack<>();
        while (!temp.isEmpty()){
            newSt.push(temp.pop());
        }
        System.out.println(newSt);
*/

/*
//        Display a stack
        while(!st.isEmpty()){
            System.out.println(st.pop());
        }
*/

//        Adding a new element to a stack at bottom
/*
        int newElement = 50;
        Stack<Integer> temp = new Stack<>();
        while (st.size()>0){
            temp.push(st.pop());
        }
        st.push(newElement);
        while(!temp.isEmpty()){
            st.push(temp.pop());
        }
        System.out.println(st);
*/

//        adding a new element at index
    /*
        int newElement = 50,pos = 2;
        Stack<Integer> temp = new Stack<>();
        while (st.size()>=pos){
            temp.push(st.pop());
        }
        st.push(newElement);
        while(!temp.isEmpty()){
            st.push(temp.pop());
        }
        System.out.println(st);
    */
//        displayReverse(st);
        display(st);
    }
}
/*
    access
    first element O(N)
    last element O(1)

    get         TC      SC
    Array       O(1)    O(1)
    LinkedList  O(n)    O(1)
    Stack       O(n)    O(n)

    TC = O(n) ; SC = O(n) auxillary space  to reverse a stack

    copy stack into another stack,pushing an element to bottom or any position : TC = O(n)   SC = O(n)
*/