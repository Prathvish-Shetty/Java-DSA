package _14Queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ReverseFirstKElementsOfQueue {
    public Queue<Integer> modifyQueue(Queue<Integer> q,int k){
//        use an auxillary stack
        Stack<Integer> st = new Stack<>();
        int n = q.size();
//        we pop first k elements in queue and push it in stack
        for(int i = 0;i<k;i++){
            int a = q.peek();
            q.poll();
            st.push(a);
        }
//        while stack is not empty we push the elements back into the queue
        while (!st.isEmpty()){
            q.add(st.pop());
        }
        for (int i = 0;i<n-k;i++){
            int a = q.peek();
            q.remove();
            q.add(a);
        }
        return q;
    }
    public static void main(String[] args) {
        ReverseFirstKElementsOfQueue r = new ReverseFirstKElementsOfQueue();
        Queue<Integer> que = new LinkedList<>();
        que.add(1);
        que.add(2);
        que.add(3);
        que.add(4);
        que.add(5);
        Queue<Integer> newq = r.modifyQueue(que,3);
        System.out.println(newq);
    }
}
