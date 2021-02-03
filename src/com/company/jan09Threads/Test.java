package com.company.jan09Threads;
//Every program runs in a single process.Second loop is started only when the first loop is finished.
//But if we have to execute all the loops simultaneously,we have to keep them in threads.
public class Test {
    public static void main(String[] args) {
        PrintValueThread p1 = new PrintValueThread();
        PrintValueThread p2 = new PrintValueThread();
        PrintValueThread p3 = new PrintValueThread();


        p1.start();
        p2.start();
        p3.start();
        p1.setPriority(10);
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