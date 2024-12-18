package _12LinkedList;
class dNode{
    int val;
    dNode prev;
    dNode next;
    dNode(int val){
        this.val = val;
    }
}
class DLL{
    dNode head,tail;
    int size;
    void display(){
        dNode temp = head;
        while (temp!=null){
            System.out.print(temp.val+" ");
            temp = temp.next;
        }
        System.out.println();
    }
    void insertAtTail(int val){
        dNode temp = new dNode(val);
        if (size == 0)  head = tail = temp;
        else {
            tail.next = temp;
            temp.prev = tail;
            tail = temp;
        }
        size++;
    }
    void insertAtHead(int val){
        dNode temp = new dNode(val);
        if (size == 0)  head = tail = temp;
        else {
            temp.next = head;
            head.prev = temp;
            head = temp;
        }
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
        t.next.prev = temp;
        temp.prev = t;
        t.next = temp;
        size++;
    }
    void deleteAtHead() throws Error{
        if (head == null)   throw new Error("List is empty");
        head = head.next;
        head.prev = null;
        size--;
    }
    void deleteAtTail() throws Error{   // O(1)
        if (head == null)   throw new Error("List is empty");
        tail = tail.prev;
        tail.next = null;
        size--;
    }
    void deleteAtIndex(int index) throws Error{
        if (index == 0){
            deleteAtHead();
            return;
        }
        if (index == size-1){
            deleteAtTail();
            return;
        }
        if (head == null)   throw new Error("List is empty");
        if (index<0 || index>=size) throw new Error("Invalid Index");
        dNode temp = head;
        for (int i = 1;i<=index-1;i++){
            temp = temp.next;
        }
        temp.next = temp.next.next;
        temp.next.prev = temp;
        size--;
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
}
public class DoublyLinkedList {
//    public static void print(dNode head) {
//        dNode temp = head;
//        while (temp != null){
//            System.out.print(temp.val+" ");
//            temp = temp.next;
//        }
//        System.out.println();
//    }
//    public static void printr(dNode tail) {
//        dNode temp = tail;
//        while (temp != null){
//            System.out.print(temp.val+" ");
//            temp = temp.prev;
//        }
//        System.out.println();
//    }
//    public static void display(dNode node) {
//        dNode temp = node;
//        while (temp.prev != null){
//            temp = temp.prev;
//        }
//        print(temp);
//    }
//    public static boolean checkPalindrome(dNode h,dNode t){
//        dNode t1 = h,t2 = t;
//        while (t1!=null){
//            if (t1.val!=t2.val) return false;
//            t1 = t1.next;
//            t2 = t2.prev;
//        }
//        return true;
//    }
    public static void main(String[] args) {
        /*
            dNode a = new dNode(10);
            dNode b = new dNode(20);
            dNode c = new dNode(30);
            dNode d = new dNode(40);
            a.next = b;b.prev = a;
            b.next = c;c.prev = b;
            c.next = d;d.prev = c;
            print(a);
            printr(d);
            display(b);
            if(checkPalindrome(a,d)) System.out.println("Palindrome List");
            else System.out.println("Not Palindrome List");
        */

        DLL list = new DLL();
        list.display();;
        list.insertAtTail(10);
        list.insertAtTail(20);
        list.insertAtTail(30);
        list.insertAtTail(40);
        list.display();
        System.out.println(list.size);
        list.insertAtHead(-10);
        list.insertAtIndex(1,0);
        list.display();
        list.deleteAtHead();
        list.display();
        list.deleteAtIndex(2);
        list.display();
        System.out.println(list.getDataAtIndex(1));
        list.setDataAtIndex(0,20);
        list.display();
    }
}
/*
    Limitations of Singly linked List;
    get : O(n)
    set : O(n)
    we cannot go back and we always need head to traverse entire list
    insertion at any index O(n),at head or tail O(1)
    deletion at head O(1),tail O(n)
*/