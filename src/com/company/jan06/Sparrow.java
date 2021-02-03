package com.company.jan06;

public class Sparrow implements Animal, Bird {
    public void sleep(){
        System.out.println("sparrows sleep only at night");
    }
    public void eat(){
        System.out.println("sparrows eat very less food");
    }


    public void fly() {
        System.out.println("Sparrow can fly");
    }


    public void nest() {
        System.out.println("sparrows make nest ");
    }
    public void breathe(){
        System.out.println("Sparrow breathe");
    }
}
