package _14Queue;

public class implementationByLinkedList {
    public static class Node{
        int val;
        Node next;
        Node(int val){
            this.val = val;
            this.next = null;
        }
    }

    public static class Queue{
        Node head = null,tail = null;
        int size = 0;

        public void add(int val){
            Node temp = new Node(val);
            if (size==0)    head=tail=temp;
            else {
                tail.next = temp;
                tail = temp;
            }
            size++;
        }

        public int peek(){
            if(size==0){
                System.out.println("Queue is empty");
                return -1;
            }
            return head.val;
        }

        public int remove(){
            if (size==0){
                System.out.println("Queue is empty");
                return -1;
            }
            int x = head.val;
            head = head.next;
            size--;
            return x;
        }

        public boolean isEmpty(){
            return size==0;
        }

        public void display(){
            Node temp = head;
            while (temp!=null){
                System.out.print(temp.val+" ");
                temp = temp.next;
            }
            System.out.println();
        }

        public int size(){
            return size;
        }

    }

    public static void main(String[] args) {
        Queue q = new Queue();
        System.out.println(q.isEmpty());
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.display();
        System.out.println(q.remove());
        System.out.println(q.size());
        System.out.println(q.peek());
    }
}

/*
    advantages and disadvantages of ll implementation - overflow condition absent, takes more space
    advantages and disadvantages of array implementation - overflow condition present, takes less space


*/