package _18HeapsAndPriorityQueue;

import java.util.Collections;
import java.util.PriorityQueue;

public class KthSmallestElement {
    public static void main(String[] args) {
        int[] arr = {10,2,8,3,-6,-2,9,-12};
        int k = 4;
//        min heap
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int ele : arr)  pq.add(ele);
        for(int i = 1;i<=k-1;i++) pq.remove();
        System.out.println(pq.peek());

//        max heap
        PriorityQueue<Integer> pqr = new PriorityQueue<>(Collections.reverseOrder());
        k = 3;
        for (int ele : arr){
            pqr.add(ele);
            if(pqr.size()>k) pqr.remove();
        }
        System.out.println(pqr.peek());
    }
}
/*
    find the kth smallest element in an array

    bruteforce :
    1. selection sort k passes - O(nk)

    2. builtin sort = quick/merge sort
       TC = O(n*logn)  SC = O(logn)/O(n)

    3. Using heaps/priority queue
       min heao
       adding elements one by one O(n*logn)
       remove top elements k-1 times O(k*logn)
       Total TC = O(n*logn)
       SC = O(n)

       max heap
       add TC = nlogk, k is the size of the heap
       remove TC = (n-k)*logk
       total TC = O(2n-k)*logk = O(nlogk)
 */

/*
use min heap for largest, farthest, biggest, highest
 */