package _28Multithreading;

public class ThreadTester {
    public static void main(String[] args) {
        System.out.println("Main is starting");

        /*

        Thread thread1 = new Thread1("thread1");
//        thread1.setDaemon(true);
        thread1.start();    // async func

//        Thread thread2 = new Thread(new Thread2(), "thread2");
//        thread2.start();

//        using lambda functions
        Thread thread2 = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                System.out.println(Thread.currentThread() + ", " + i);
            }
        }, "thread2");

         */

        /*
        Stack stack = new Stack(5);
        new Thread(() -> {
            int counter = 0;
            while(++counter < 10)
                System.out.println("Pushed: "+stack.push(100));
        }, "Pusher").start();

        new Thread(() -> {
            int counter = 0;
            while(++counter < 10)
                System.out.println("Popped: "+stack.pop());
        }, "Popper").start();

         */

        /*
        Thread thread3 = new Thread(()->{
            try {
                Thread.sleep(1);
                for(int i = 10000; i > 0; i--);
            }
            catch (InterruptedException e){
                e.printStackTrace();
            }
        }, "States");

        thread3.start();

        while(true){
            Thread.State state = thread3.getState();
            System.out.println(state);
            if (state == Thread.State.TERMINATED)   break;
        }

         */

        /*
        Thread thread = new Thread(()->{
            System.out.println(Thread.currentThread());
        }, "Our Thread");
        thread.start();

        try {
            thread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

         */

//        deadlock situation : reverse the order of locks
        String lock1 = "riddhi";
        String lock2 = "dutta";
        Thread thread1 = new Thread(()->{
            synchronized (lock1){
                try {
                    Thread.sleep(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                synchronized (lock2){
                    System.out.println("lock acquired");
                }
            }
        }, "thread1");
        Thread thread2 = new Thread(()->{
            synchronized (lock2) {
                try {
                    Thread.sleep(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                synchronized (lock1) {
                    System.out.println("lock acquired");
                }
            }
        }, "thread2");

        thread1.start();
        thread2.start();

//        main thread execution is blocked
        System.out.println("Main is exiting");

//        System.out.println(thread.getPriority());
//        thread.setPriority(1); // 1-10, default 5, min to max
    }
}
// no sequence
// main thread is user thread
// thread name, parity, parent
// two ways to create thread : by implementing runnable(better) o extending Thread