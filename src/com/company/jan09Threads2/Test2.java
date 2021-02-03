package com.company.jan09Threads2;
//Every program runs in a single process.Second loop is started only when the first loop is finished.
//But if we have to execute all the loops simultaneously,we have to keep them in threads.
public class Test2 {
    public static void main(String[] args) {
        PrintValueThread2 p1 = new PrintValueThread2();//Class implementing runnable interface.
                                                     //Till this point it is a plain object.
        Thread t = new Thread(p1);//It becomes a thread at this point.
        PrintValueThread2 p2 = new PrintValueThread2();
        Thread t1 = new Thread(p2);
        PrintValueThread2 p3 = new PrintValueThread2();
        Thread t2 = new Thread(p3);


        t.start();//starts the thread,Puts it in thread pool for execution.
        t1.start();
        t2.start();
        t.setPriority(10);
        
    }
}
//5 states of thread(Lifecycle of thread)
//Thread pool-where Threads are kept
//Thread Scheduler picks the Thread from Thread pool and execute them,and sends back to pool when done.
//Thread Scheduler constantly polls thread pool to search for available threads to run them.

//Thread (created) - PrintValueThread p1 = new PrintValueThread();Thread is created when its instance is created.
//Thread (runnable) ready to run - Thread enters the Thread pool. - p1.start();
//Thread (running) actually running - Picked by thread scheduler for running.
//Thread (waiting) waiting or not running - Threads waiting in the pool to be picked for execution  by Thread Scheduler.
//Thread (terminated) terminated - When the Thread is done with execution.