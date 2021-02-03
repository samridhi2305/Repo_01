package com.company.dec21Static;

public class HelloWorld {
    //Default constructor
    HelloWorld() {
    }

        int a;
        int b;


        HelloWorld( int a){
            this.a = a;
        }
        HelloWorld( int a, int b){
            this.a = a;
            this.b = b;
        }
        void hello () {
            System.out.println("hello" + a);
        }
        void hello2 () {
            System.out.println("print a " + a);
            System.out.println("print b " + b);
        }
        void sayHello () {
            System.out.println("hello sahil samridhi");

        }
    }
