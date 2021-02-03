package com.company.jan15;

import java.lang.System;

import java.lang.*;
//student object has a address object-Aggregation(where one object has HAS-A relationship with other object)

//o String is a method of object class which is parent class of every class.
//An object just represent class reference/a memory location/hash code.
//If we have to print an object value in a readable form we have to override toString method in that class.

public class StudentAddressMain {
    public static void main(String[] args) {
        String hello = "Hello World";
        int id = 10;
        Address address = new Address("20","luxotica today","Gurugram");
        Student student = new Student("Sahil",id,address);

        System.out.println(hello);
        System.out.println(address);//when we print CLASS OBJECT it internally calls toString method of that class.If toString method
        //is not found in that class then it will print hash code of that object.
        System.out.println(student);

        Student s2 = student;//one object with 2 references student and s2
        System.out.println(s2);

        //Student s3 = student.clone();


    }
}
