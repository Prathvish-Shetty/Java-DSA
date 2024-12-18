package _28Multithreading;

public class Stack {
    private int[] array;
    private int stackTop;
    final Object lock;

    public Stack(int capacity){
        array = new int[capacity];
        stackTop = -1;
        lock = new Object();
    }

    public synchronized boolean push(int element){
//        synchronized (this) { behind the scenes
            if(isFull())    return false;
            ++stackTop;
            try {
                Thread.sleep(1000);
            } catch (Exception e) {}
            array[stackTop] = element;
            return true;
//        }
    }

    public int pop(){
//        synchronized lock : only one thread can access the block at a time, any object can be used as lock
        synchronized(lock) {
            if (isEmpty()) return Integer.MIN_VALUE;
            int obj = array[stackTop];
            array[stackTop] = Integer.MIN_VALUE;
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
            }
            stackTop--;
            return obj;
        }
    }

    public boolean isEmpty(){
        return stackTop < 0;
    }

    public boolean isFull(){
        return stackTop >= array.length-1;
    }
}
// lock is same for multiple synchronized methods in the class
// in static synchronized methods Stack.class is used as lock
// volatile keyword