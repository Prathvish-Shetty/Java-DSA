package _14Queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Operations {
    static Queue<Integer> queue;
    static Queue<Integer> newQueue;

    static void reverseQueue(){
//        reversing the queue using stack
        Stack<Integer> stack = new Stack<>();
        while (!queue.isEmpty()){
            stack.push(queue.remove());
        }
        while (!stack.isEmpty()){
            queue.add(stack.pop());
        }
    }

    static void print(){
//        while (!queue.isEmpty()){
//            System.out.print(queue.peek()+" ");
//            queue.remove();
//        }
        System.out.println(queue);
    }

    static void removeEven(){
        newQueue = new LinkedList<>();
        while (!queue.isEmpty()){
            queue.remove();
            if (!queue.isEmpty()){
                newQueue.add(queue.remove());
            }
        }
        queue = newQueue;
    }

    public static void main(String[] args) {
        queue = new LinkedList<>();
        queue.add(10);
        queue.add(20);
        queue.add(30);
        queue.add(40);
        print();
        reverseQueue();
        print();
        removeEven();
        print();
    }
}
