package com.company.jan09Threads;

public class PrintValueThread extends Thread {
        public void run(){

            for(int i=1;i<=10;i++) {

                System.out.println("Value of i - " + i);

                //System.out.println("1");
                //System.out.println("2");
                //System.out.println("3");
            }
        }

}

