package _18HeapsAndPriorityQueue;
class MinHeap{
    private int[] arr;
    private int size;
    MinHeap(int capacity){
        arr = new int[capacity];
        size = 0;
    }
    public void add(int num) throws Exception{
        if (size==arr.length)   throw new Exception("Heap is full");
        arr[size++] = num;
        upheapify(size-1);
    }
    public void upheapify(int ci){ // child index
        if (ci==0)  return; // base case
        int pi = (ci-1)/2;  // parent index
        if (arr[pi]>arr[ci]){
            swap(ci,pi);
            upheapify(pi);
        }
    }
    public void swap(int i, int j){
        int t = arr[i];
        arr[i] = arr[j];
        arr[j] = t;
    }
    public int size(){
        return size;
    }
    public int peek() throws Exception{
        if (size==0){
            throw new Exception("Heap is Empty");
//            System.out.println("Empty Heap");
//            return -1;
        }
        return arr[0];
    }
    public int remove() throws Exception{
        if (size==0) throw new Exception("Heap is empty");
        int peek = arr[0];
        swap(0,size-1);
        downHeapify(0);
        return peek;
    }
    private void downHeapify(int i){    // index of root
        if (i>=size-1)    return;
        int lc = 2*i+1,rc = 2*i+2;  // left & right child
        int minIdx = i;
        if (lc<size && arr[lc]<arr[minIdx]) minIdx = lc;
        if (rc<size && arr[rc]<arr[minIdx]) minIdx = rc;
        if (i==minIdx)  return;;
        swap(i,minIdx);
        downHeapify(minIdx);
    }
}
public class MinHeapImplementationByArray {
    public static void main(String[] args) throws Exception {
        MinHeap pq = new MinHeap(10);
//        System.out.println(pq.peek());
        pq.add(1);
        pq.add(6);
        pq.add(3);
        System.out.println(pq.size());
        System.out.println(pq.peek());
        pq.add(0);
        System.out.println(pq.peek());
    }
}


/*
    heapify algorithm is used to correct heap order property
 */