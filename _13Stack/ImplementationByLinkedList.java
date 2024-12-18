package _13Stack;
class Node{
    int val;
    Node next;
    Node(int val){
        this.val = val;
    }
}
class StackL{
    Node head;
    int size;
    void push(int val){
        Node temp = new Node(val);
        temp.next = head;
        head = temp;
        size++;
    }
    int pop(){
        if (isEmpty()){
            System.out.println("Stack Underflow");
            return -1;
        }
        int top = head.val;
        head = head.next;
        size--;
        return top;
    }
    int peek(){
        if (isEmpty()){
            System.out.println("Stack Underflow");
            return -1;
        }
        return head.val;
    }
    boolean isEmpty(){
        return head == null;
    }
    int size(){
        return size;
    }
    void display(){
        Node t = head;
        while (t!=null){
            System.out.print(t.val+" ");
            t = t.next;
        }
        System.out.println();
    }
    void disp(){
        displayrec(head);
    }
    void displayrec(Node h){
        if (h==null)    return;
        displayrec(h.next);
        System.out.print(h.val+" ");
    }
}
public class ImplementationByLinkedList {
    public static void main(String[] args) {
        StackL st = new StackL();
        System.out.println(st.size());
        st.push(10);
        st.push(20);
        st.push(30);
        System.out.println(st.peek());
//        System.out.println(st.pop());
        st.display();
        st.disp();
    }
}
/*
    LL stack takes more space than array stack
    array stack can overflow due to constant size
    time complexity for display is O(n) for both
    push/pop = SC = O(1)
    array SC = O(1)
    LL SC = O(n)
*/