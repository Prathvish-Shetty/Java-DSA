package _18HeapsAndPriorityQueue;

public class Visualisation {
    public static void main(String[] args) {

    }
}

/*
    Heap visualisation

    minHeap :
    Heap order property(HOP) : It is a binary tree where each node has smaller value than it children
    It us a continuous binary tree
    one minHeap can be represented by many binary trees
    complete binary tree is a balanced binary tree(lst & rst will have difference of only one level)

    CBT : where n-1 levels are completely filled & the last level may or may not be completely filled,
     but is filled from left to right
    thus cbt is unique for a heap

    addition, deletion logn
    peek O(1)

    cbt is always balanced so height of cbt is always logn

    a sorted array is also a heap

    addition/insertion :
    1. add the element at last O(1)
    2. upheapify O(logn) swap with parent untill parent is greater than it
*/

/*
    Heap is implemented by array & visualised as a CBT with HOP

    left child index = lca
    right child index = rca
    parent index = p
    lca  = 2*p+1
    rca = 2*p+2
    p = (c-1)/2
    c = left or right child
*/