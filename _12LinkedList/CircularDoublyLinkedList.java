package _12LinkedList;
class CDLL{
    dNode head,tail;
    int size;
    void display() {
        if (head==null){
            System.out.println("List is empty");
            return;
        }
        dNode temp = head;
        while (true){
            System.out.print(temp.val+" ");
            if (temp.next==head) break;
            temp = temp.next;
        }
        System.out.println();
    }
    void insertAtHead(int val){
        dNode temp = new dNode(val);
        if (head == null){
            head = tail = temp;
        }
        else {
            temp.next = head;
            head.prev = temp;
            head = temp;
        }
        tail.next = head;
        head.prev = tail;
        size++;
    }
    void insertAtTail(int val){    // TC & SC = O(1)
        dNode temp = new dNode(val);
        if (head == null){
            head = tail = temp; // if LL is empty
        }
        else {  // if LL is not empty
            tail.next = temp;
            temp.prev = tail;
            tail = temp;
        }
        tail.next = head;
        head.prev = tail;
        size++;
    }
    void insertAtIndex(int index,int val){ // TC = O(n) ; SC = O(1)
        if (index == 0){
            insertAtHead(val);
            return;
        }
        if (index == size){
            insertAtTail(val);
            return;
        }
        if (index<0 || index>size){
            System.out.println("Invalid Index");
            return;
        }
        dNode temp = new dNode(val);
        dNode t = head;
        for (int i = 1; i < index; i++) {
            t = t.next;
        }
//        insertion
        temp.next = t.next;
        temp.prev = t;
        t.next.prev = temp;
        t.next = temp;
        tail.next = head;
        head.prev = tail;
        size++;
    }

    int getDataAtIndex(int index) throws Error{ // TC = O(n) , in array it is O(1)
        if (index == size-1)    return tail.val;
        if (index>=size || index<0){
//            System.out.println("Invalid Index");
//            return 404;
            throw new Error("Invalid Index");
        }
        dNode temp = head;
        for (int i = 1;i<=index;i++){
            temp = temp.next;
        }
        return temp.val;
    }
    void setDataAtIndex(int index,int val) throws Error{ // TC = O(n) ; TC = O(1) for arrays
        if (index == size-1)    tail.val = val;
        if (index>=size || index<0){
            throw new Error("Invalid Index");
        }
        dNode temp = head;
        for (int i = 1;i<=index;i++){
            temp = temp.next;
        }
        temp.val = val;
    }
    void deleteAtHead() throws Error{
        if (head == null)   throw new Error("List is empty");
        head = head.next;
        head.prev = tail;
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
        dNode temp = head;
        for (int i = 1;i<=index-1;i++){
            temp = temp.next;
        }
        if (temp.next == tail)  tail = temp;
        temp.next = temp.next.next;
        tail.next = head;
        head.prev = tail;
        size--;
    }
}
public class CircularDoublyLinkedList {
    public static void main(String[] args) {
        CDLL list = new CDLL();
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