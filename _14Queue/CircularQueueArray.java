package _14Queue;

public class CircularQueueArray {
    public static class Cqa {
        int front = -1;
        int rear = -1;
        int size = 0;
        int[] arr = new int[5];

        public void add(int val) {
            if (size == arr.length) {
                System.out.println("Queue is full");
                return;
            } else if (size==0){
                front=rear=0;
                arr[rear] = val;
            } else if (rear < arr.length-1) {   // normal case
                arr[++rear] = val;
            } else if (rear== arr.length-1) {
                rear = 0;
                arr[rear] = val;
            }
            size++;
        }
        public int remove(){
            if (size==0){
                System.out.println("Queue is empty");
                return -1;
            } else{
                size--;
                int val = arr[front];
                if (front==arr.length-1)    front = 0;
                else front++;
                return val;
            }
        }
        public int peek(){
            if (size==0){
                System.out.println("Queue is empty");
                return -1;
            }
            return arr[front];
        }
        public void display(){
            if (size==0){
                System.out.println("Queue is empty");
                return;
            } else if (front<=rear) {
                for (int i = 0; i <= rear ; i++) {
                    System.out.print(arr[i]+" ");
                }
            } else{ // rear<=front
                for (int i = front; i < arr.length ; i++) {
                    System.out.print(arr[i]+" ");
                }
                for (int i = 0; i <= rear ; i++) {
                    System.out.print(arr[i]+" ");
                }
            }
            System.out.println();
        }
        public boolean isEmpty(){
            return size==0;
        }
        public int size(){
            return size;
        }
    }
    public static void main(String[] args) {
        Cqa q = new Cqa();
        System.out.println(q.isEmpty());
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.display();
        System.out.println(q.remove());
        System.out.println(q.size());
    }
}
/*
class MyCircularQueue {
    int[] arr;
    int front,rear,size,n;
    public MyCircularQueue(int k) {
        arr = new int[k];
        front = rear = -1;
        n = k;
    }

    public boolean enQueue(int value) {
        if(isFull()) return false;
        if(isEmpty()) front = 0;
        rear = (rear + 1) % n;
        arr[rear] = value;
        size++;
        return true;
    }

    public boolean deQueue() {
        if(isEmpty()) return false;
        if(front == rear) {
            front = rear = -1;
        } else {
            front = (front + 1) % n;
        }
        size--;
        return true;
    }

    public int Front() {
        if(isEmpty()) return -1;
        return arr[front];
    }

    public int Rear() {
        if(isEmpty()) return -1;
        return arr[rear];
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == n;
    }
}

 */