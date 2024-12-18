package _18HeapsAndPriorityQueue;

import java.util.PriorityQueue;

public class SortKSortedArray {
    public static void main(String[] args) {
        int[] arr = {6,5,3,2,8,10,9};
        int k = 3;
        PriorityQueue<Integer> pq = new PriorityQueue<>();
//        for(int ele : arr)  pq.add(ele);
//        int i = 0;
//        while (!pq.isEmpty()){
//            arr[i++] = pq.remove();
//        }
//        for(int ele : arr)  System.out.print(ele+" ");

        int i = 0;
        for(int ele : arr){
            pq.add(ele);
            if(pq.size()>k)  arr[i++] = pq.remove();
        }
        while(!pq.isEmpty())  arr[i++] = pq.remove();
        for(int ele : arr)  System.out.print(ele+" ");

//        TC = O(nlogk)
//        we can use arraylist
    }
}
/*
 sort a k sorted array/sort a nearly sorted array
    use heaps
 */

// if we are inserting an object into pq, use comparable/custom comparator, on what basis should pq rearrange