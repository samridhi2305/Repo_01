package com.company.jan09Threads2;

public class PrintValueThread2 implements Runnable {
    public void run() {

        for (int i = 1; i <= 10; i++) {

            System.out.println("Value of i - " + i);
            if (i == 5) {
                try {
                    Thread.sleep(5);
                } catch (InterruptedException e) {
                    System.out.println(e);
                }
            }

        }

    }
}
            //After 5 seconds I interrupt this thread


            //System.out.println("1");
            //System.out.println("2");
            //System.out.println("3");






//if any thread has iterrupted the current thread.The interrupted status</i> of the current thread is cleared when this exception
// is thrown


//sleep-interrupt()
//wait-notify() and notifyAll()