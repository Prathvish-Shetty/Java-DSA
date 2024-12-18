package _14Queue;

public class Dequeue {

//    public static class Node{
//        int data;
//        Node next,prev;
//
//        Node(int data){
//            this.data = data;
//            this.next = this.prev = null;
//        }
//    }
//
//    static class Deque{
//        Node front,rear;
//        int size;
//
//        Deque(){
//            front=rear=null;
//            size=0;
//        }
//
//        boolean isEmpty(){
//            return size==0;
//        }
//
//        int size(){
//            return size;
//        }
//
//        void insertFront(int data){
//            Node newNode = new Node(data);
//            if (front==null){
//                front = rear = newNode;
//            }
//            else {
//                newNode.next = front;
//                front.prev = newNode;
//                front = newNode;
//            }
//            size++;
//        }
//
//        void insertRear(int data){
//            Node newNode = new Node(data);
//            if (rear==null){
//                front = rear = newNode;
//            }
//            else {
//                rear.next = newNode;
//                newNode.prev = rear;
//                rear = newNode;
//            }
//            size++;
//        }
//
//        void deleteFront(){
//            if (front==null)    System.out.println("Queue is empty");
//            else {
//                front = front.next;
//                if (front==null)    rear=null;
//                else    front.prev = null;
//                size--;
//            }
//        }
//
//        void deleteRear(){
//            if (rear==null) System.out.println("Queue is empty");
//            else{
//                rear = rear.prev;
//                if (rear==null) front=null;
//                else rear.next = null;
//                size--;
//            }
//        }
//
//        int getFront(){
//            if (size==0){
//                System.out.println("Queue is empty");
//                return -1;
//            }
//            return front.data;
//        }
//
//        int getRear(){
//            if (size==0){
//                System.out.println("Queue is empty");
//                return -1;
//            }
//            return rear.data;
//        }
//
//        void display(){
//            Node temp = front;
//            while (temp!=null){
//                System.out.print(temp.data+" ");
//                temp = temp.next;
//            }
//            System.out.println();
//        }
//    }
//    public static void main(String[] args) {
//        Deque dq = new Deque();
//        dq.insertFront(1);
//        dq.insertFront(2);
//        dq.insertFront(3);
//        dq.insertRear(4);
//        dq.insertRear(5);
//        dq.insertRear(6);
//        dq.display();
//        System.out.println("Front: " + dq.getFront());
//        System.out.println("Rear: " + dq.getRear());
//        System.out.println("Size: " + dq.size());
//    }
}
// using doubly LL
/*
insertFront - adds element at front
insertRear - adds element at rear
deleteFront - deletes element from front
deleteRear - deletes element from rear
getFront - gets the front item
getRear - gets the rear item
isEmpty - checks whether deque is empty or not
size - returns size
erase - delete all elements from dequeue
 */

//public class Dequeue {
//    public static class Node {
//        int data;
//        Node next, prev;
//
//        Node(int data) {
//            this.data = data;
//            this.next = this.prev = null;
//        }
//    }
//
//    private Node front, rear;
//    private int size;
//
//    public Dequeue() {
//        front = rear = null;
//        size = 0;
//    }
//
//    public boolean isEmpty() {
//        return size == 0;
//    }
//
//    public int size() {
//        return size;
//    }
//
//    public void insertFront(int data) {
//        Node newNode = new Node(data);
//        if (isEmpty()) {
//            front = rear = newNode;
//        } else {
//            newNode.next = front;
//            front.prev = newNode;
//            front = newNode;
//        }
//        size++;
//    }
//
//    public void insertRear(int data) {
//        Node newNode = new Node(data);
//        if (isEmpty()) {
//            front = rear = newNode;
//        } else {
//            rear.next = newNode;
//            newNode.prev = rear;
//            rear = newNode;
//        }
//        size++;
//    }
//
//    public void deleteFront() {
//        if (isEmpty()) {
//            throw new IllegalStateException("Deque is empty");
//        }
//        front = front.next;
//        if (front == null) {
//            rear = null;
//        } else {
//            front.prev = null;
//        }
//        size--;
//    }
//
//    public void deleteRear() {
//        if (isEmpty()) {
//            throw new IllegalStateException("Deque is empty");
//        }
//        rear = rear.prev;
//        if (rear == null) {
//            front = null;
//        } else {
//            rear.next = null;
//        }
//        size--;
//    }
//
//    public int getFront() {
//        if (isEmpty()) {
//            throw new IllegalStateException("Deque is empty");
//        }
//        return front.data;
//    }
//
//    public int getRear() {
//        if (isEmpty()) {
//            throw new IllegalStateException("Deque is empty");
//        }
//        return rear.data;
//    }
//
//    public void display() {
//        if (isEmpty()) {
//            System.out.println("Deque is empty");
//            return;
//        }
//        Node temp = front;
//        System.out.print("Deque: ");
//        while (temp != null) {
//            System.out.print(temp.data + " ");
//            temp = temp.next;
//        }
//        System.out.println();
//    }
//
//    public static void main(String[] args) {
//        Dequeue dq = new Dequeue();
//        dq.insertFront(1);
//        dq.insertFront(2);
//        dq.insertFront(3);
//        dq.insertRear(4);
//        dq.insertRear(5);
//        dq.insertRear(6);
//        dq.display();
//        System.out.println("Front: " + dq.getFront());
//        System.out.println("Rear: " + dq.getRear());
//        System.out.println("Size: " + dq.size());
//    }
//}
