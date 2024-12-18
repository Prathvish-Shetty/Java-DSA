package _18HeapsAndPriorityQueue;

import java.util.Collections;
import java.util.PriorityQueue;

public class Basics {
    public static void main(String[] args) {
//        min heap
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(2);
        System.out.println(pq+" "+pq.peek());
        pq.add(10);
        System.out.println(pq+" "+pq.peek());
        pq.add(1);
        System.out.println(pq+" "+pq.peek());
        pq.remove();    // remove min element
        pq.add(0);
        System.out.println(pq+" "+pq.peek());
//        max heap
        PriorityQueue<Integer> pqr = new PriorityQueue<>(Collections.reverseOrder());
        pqr.add(2);
        System.out.println(pqr +" "+ pqr.peek());
        pqr.add(10);
        System.out.println(pqr +" "+ pqr.peek());
        pqr.add(1);
        System.out.println(pqr +" "+ pqr.peek());
        pqr.remove();    // remove min element
        pqr.add(0);
        System.out.println(pqr +" "+ pqr.peek());
    }
}
/*
    heaps are implemented by priority queue

    MinHeap :
    add : the element is added to the heap and the minimum element is at the top O(logn) - adding + rearrangement
    remove : the top(min) element is removed and the min element is brought to top O(logn)
    peek : returns the top(min) element O(1)
    size : returns the size O(1)

    if we are adding n elements one by one in a heap then
    no of operations = log(1) + log(2) + log(3)... log(n) = log(n!) = nlog(n)

    if we create min heap from arraylist then add+sort = O(nlogn)
    delete O(1)

    in priority queue we can access one element at a time
 */

/*
    Problem identification
    kth smallest/largest/closest/frequent/k sorted array
    out of n if we are working on k elements
    O(n)<O(nlogk)<O(nlogn)
    minimize, maximize, continuous sorting O(logn)
 */