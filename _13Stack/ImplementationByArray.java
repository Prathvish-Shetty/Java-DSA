package _13Stack;
class Stack{
    private final int cap = 5;
    private final int[] arr = new int[cap];
    private int idx = -1;
    void push(int x){
        if (isFull()){
            System.out.println("Stack Overflow");
            return;
        }
        arr[++idx] = x;
    }
    int pop(){
        if (isEmpty()){
            System.out.println("Stack Underflow");
            return 404;
        }
        return  arr[idx--];
    }
    int peek(){
        return arr[idx];
    }
    int size(){
        return idx+1;
    }
    boolean isEmpty(){
        return idx == -1;
    }
    boolean isFull(){
        return idx == cap - 1;
    }
    void display(){
        for (int i = 0; i <= idx; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}

public class ImplementationByArray {
    public static void main(String[] args) {
        Stack st = new Stack();
        System.out.println((st.isEmpty())?"Stack is empty":"Stack is not empty");
        st.push(50);
        st.push(40);
        st.push(30);
        st.push(20);
        st.push(10);
        System.out.println((st.isFull())?"Stack is full":"Stack is not full");
        System.out.println(st.peek());
        System.out.println(st.pop());
        System.out.println(st.peek());
        System.out.println(st.size());
        st.display();
    }
}
