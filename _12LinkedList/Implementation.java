package _12LinkedList;
class SinglyLinkedList{
    private Node head,tail;
    private int size;
    void insertAtHead(int data){
        Node temp = new Node(data);
        if (head == null)   head = tail = temp;
        else {
            temp.next = head;
            head = temp;
        }
        size++;
    }
    void insertAtTail(int data){    // TC & SC = O(1)
        Node temp = new Node(data);
        if (head == null)   head = tail = temp; // if LL is empty
        else {  // if LL is not empty
            tail.next = temp;
            tail = temp;
        }
        size++;
    }

//    void insertAtIndex(int index,int data){
//        if (index>size || index<0){
//            System.out.println("Invalid Index");
//            return;
//        }
//        Node temp = new Node(data);
//        if (head == null) {
//            if (index == 0) head = tail = temp;
//            else {
//                System.out.println("Invalid Index");
//                return;
//            }
//        }
//        else if (index == 0){
//            temp.next = head;
//            head = temp;
//        }
//        else {
//            Node current = head;
//            while (index-1>0){
//                current = current.next;
//                index--;
//            }
//            temp.next = current.next;
//            current.next = temp;
//
////          using previous variable
////            Node previous = head;
////            Node current = head;
////            while (index>0){
////                previous = current;
////                current = current.next;
////                index--;
////            }
////            temp.next = current;
////            previous.next = temp;
//        }
//    }

    void insertAtIndex(int index,int data){ // TC = O(n) ; SC = O(1)
        if (index == 0){
            insertAtHead(data);
            return;
        }
        if (index == size){
            insertAtTail(data);
            return;
        }
        if (index<0 || index>size){
            System.out.println("Invalid Index");
            return;
        }
        Node temp = new Node(data);
        Node t = head;
        for (int i = 1; i < index; i++) {
            t = t.next;
        }
//        insertion
        temp.next = t.next;
        t.next = temp;
        size++;
    }

    int getDataAtIndex(int index) throws Error{ // TC = O(n) , in array it is O(1)
        if (index == size-1)    return tail.data;
        if (index>=size || index<0){
//            System.out.println("Invalid Index");
//            return 404;
            throw new Error("Invalid Index");
        }
        Node temp = head;
        for (int i = 1;i<=index;i++){
            temp = temp.next;
        }
        return temp.data;
    }
    void setDataAtIndex(int index,int data) throws Error{ // TC = O(n) ; TC = O(1) for arrays
        if (index == size-1)    tail.data = data;
        if (index>=size || index<0){
            throw new Error("Invalid Index");
        }
        Node temp = head;
        for (int i = 1;i<=index;i++){
            temp = temp.next;
        }
        temp.data = data;
    }

    void deleteAtHead() throws Error{
        if (head == null)   throw new Error("List is empty");
        head = head.next;
        size--;
    }
    void deleteAtIndex(int index) throws Error{
        if (index == 0){
            deleteAtHead();
            return;
        }
        if (head == null)   throw new Error("List is empty");
        if (index<0 || index>=size) throw new Error("Invalid Index");
        Node temp = head;
        for (int i = 1;i<=index-1;i++){
            temp = temp.next;
        }
        if (temp.next == tail)  tail = temp;
        temp.next = temp.next.next;
        size--;
    }
    void display() {
        Node temp = head;
        while (temp != null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
        System.out.println();
    }
    void size(){
        System.out.println("Size of Linked List is : "+size);
    }
}
public class Implementation {
    public static void main(String[] args) {
        SinglyLinkedList sll = new SinglyLinkedList();
        sll.insertAtTail(10);
        sll.insertAtTail(20);
        sll.insertAtTail(30);
        sll.insertAtTail(40);
        sll.insertAtHead(0);
        sll.insertAtHead(-10);
        sll.insertAtHead(-20);
//        sll.display();
//        System.out.println(sll.size);
        sll.size();
//        System.out.println(sll.head.data);    // cannot head as it is declared as private data

//        inserting node at given position/index
        sll.insertAtIndex(7,-30);
//        sll.display();

//        System.out.println(sll.getDataAtIndex(-3));
        sll.setDataAtIndex(6,50);
//        sll.display();

        sll.deleteAtHead();
        sll.display();

//        to delete the node at ith index we need (i-1)th index
        sll.deleteAtIndex(2);
        sll.display();
    }
}
//find the left moddle of s linked list
//find the nth node from end of the linkedlist