package com.company.jan06;
//A class contains methods with their definiton.
//An Interface is just like a class which has methods without definition.They only have method declaration
//All the methods of the interface must be overridden in child class which is implementing/inheriting this interface.
//Interface helps to achieve multiple inheritance which is not possible with classes in java.
//Interface just provide method declaration .Their definition MUST be provided by the class implementing the interface.
//Interfaces provide a standardised way of doing things.
//overriding means changing method definition of parent class in child class.
//Implementation means implementing/providing method definition of parent interface in child class.
//Interface is a collection of abstract methods.
//How multiple inheritance is possible with interfaces-because in interfaces we dont have any method definition,so the ambiguity
//of overriding/implementing parent class methods is removed.
public interface Animal {
    public void sleep();
    public void eat();
    public void breathe();


}
