package _14Queue;

public class ImplementationByArray {
    public static class Queue {
        int f = -1;
        int r = -1;
        int size = 0;
        int[] arr = new int[5];

        public void add(int val){
            if (r==arr.length-1){   // check overflow
                System.out.println("Queue is full");
                return;
            }
            if (f==-1 && r==-1){
                f = r = 0;
                arr[r] = val;
            }
            else    arr[++r] = val;
            size++;
        }

        public int remove(){
            // check overflow
            if (size==0){
                System.out.println("Queue empty");
                return -1;
            }
            int val = arr[f++];
            size--;
            return val;
        }

        public int peek(){
            if (size==0){
                System.out.println("Queue is empty");
                return -1;
            }
            return arr[f];
        }

        public boolean isEmpty(){
            return size==0;
        }

        public void display(){
            if (size==0){
                System.out.println("Queue is empty");
            }
            else {
                for (int i = f;i<=r;i++){
                    System.out.print(arr[i]+" ");
                }
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
