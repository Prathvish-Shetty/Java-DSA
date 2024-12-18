package _12LinkedList;
class CSLL{
    Node head,tail;
    int size;
    void display() {
        if (head==null){
            System.out.println("List is empty");
            return;
        }
        Node temp = head;
        while (true){
            System.out.print(temp.data+" ");
            if (temp.next==head) break;
            temp = temp.next;
        }
        System.out.println();
    }
    void insertAtHead(int data){
        Node temp = new Node(data);
        if (head == null){
            head = tail = temp;
            tail.next = head;
        }
        else {
            temp.next = head;
            head = temp;
            tail.next = head;
        }
        size++;
    }
    void insertAtTail(int data){    // TC & SC = O(1)
        Node temp = new Node(data);
        if (head == null){
            head = tail = temp; // if LL is empty
            tail.next = head;
        }
        else {  // if LL is not empty
            tail.next = temp;
            tail = temp;
            tail.next = head;
        }
        size++;
    }
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
        tail.next = head;
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
        tail.next = head;
        size--;
    }
}
public class CircularSinglyLinkedLIst {
    public static void main(String[] args) {
        CSLL list = new CSLL();
        list.insertAtHead(10);
        list.insertAtHead(20);
        list.insertAtTail(30);
        list.display();
        list.insertAtIndex(3,10);
        list.display();
        list.deleteAtIndex(3);
        list.display();
    }
}
// create singly & doubly circular linked list