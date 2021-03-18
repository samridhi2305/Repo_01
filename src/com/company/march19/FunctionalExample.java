package com.company.march19;

public interface FunctionalExample {
    void myMethod(); //abstract method

    default void sayHello() {
        System.out.println("Hello");
    }

    static void printMessage() {
        System.out.println("This is my interface");
    }

}
