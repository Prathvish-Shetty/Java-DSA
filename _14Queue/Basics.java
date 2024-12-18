package _14Queue;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Basics {

    public static void main(String[] args) {
/*
        queue is abstract datatype
        Queue<Integer> q = new Queue<>();
        Queue<Integer> q = new ArrayDeque<>();
*/
        Queue<Integer> que = new LinkedList<>();
        que.add(1);
        que.add(2);
        que.add(3);
        que.add(4);

        /*
        System.out.println(que);
        que.remove();
        System.out.println(que);
        que.poll();
        System.out.println(que);
        System.out.println(que.peek());
        System.out.println(que.size());
        System.out.println(que.isEmpty());
        */

//        printing the queue
        Queue<Integer> helper = new LinkedList<>();
        while (!que.isEmpty()){
            System.out.print(que.peek()+" ");
            helper.add(que.remove());
        }
        while (!helper.isEmpty()){
            que.add(helper.remove());
        }

//      remove elements at even index in queue,0 based indexing
    }
}
