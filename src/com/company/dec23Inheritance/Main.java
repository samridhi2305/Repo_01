package com.company.dec23Inheritance;

public class Main {
    public static void main(String[] args) {
        Fruit fruit = new Fruit();
        fruit.waterContent();
        fruit.healthy();
        Orange orange=new Orange();
        orange.healthy();
        System.out.println(orange.a);
        orange.waterContent();
        Apple apple=new Apple();
        apple.waterContent();
        apple.healthy();
        Banana banana=new Banana();
        banana.peel();
        banana.healthy();
    }
}
