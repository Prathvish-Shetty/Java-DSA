package _12LinkedList;
class Node{
    int data;
    Node next;
    Node(int data){
        this.data = data;
        this.next = null;   // no need as it is null by default
    }
}
public class Basic {
    public static void Print(Node head) {
        Node temp = head;
        while (temp != null){
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
    public static void printRecursively(Node head){
        if (head == null)   return;
//        printRecursively(head.next);
        System.out.println(head.data);
        printRecursively(head.next);
    }
    public static void main(String[] args) {
        Node a = new Node(10);
//        System.out.println(a);    // address of Node a
//        System.out.println(a.data);    // data of Node a
//        System.out.println(a.next);    // null when the nodes are not connected
        Node b = new Node(20);
        a.next = b; // linking a->b
//        System.out.println(b);
//        System.out.println(a.next);
        Node c = new Node(30);
        b.next = c; // 10->20->30
//        System.out.println(a.next.data); // b
//        System.out.println(a.next.next.data);   // c

        Node temp = a;  // shallow copy
//        System.out.println(temp);
        temp.data = 12;
//        System.out.println(temp);
//        System.out.println(temp.data);
        temp = temp.next;
//        System.out.println(temp.data);
        temp = temp.next;
//        System.out.println(temp.data);
        Node t = new Node(10);  // deep copy
//        System.out.println(t);

//        temp = a;
//        while (temp != null){
//            System.out.println(temp.data);
//            temp = temp.next;
//        }
//        for (int i = 0;i<3;i++){
//            System.out.println(temp.data);
//            temp = temp.next;
//        }
//        Print(a);
        printRecursively(a);
    }
}
// shallow copy of node(temp) is used to traverse the linked list
// we can access a class throughout the package
//we can print LL recursively