package com.company.jan09;

public class PrintHelloMain {
    public static void main(String[] args) {
        PrintHello printHello = new PrintHello();//hashCode calculated and stored in memory
        System.out.println(printHello.hashCode());
        PrintHello printHello2 = new PrintHello();
        printHello.equals(printHello2);
        System.out.println(printHello2.hashCode());
    }
}
