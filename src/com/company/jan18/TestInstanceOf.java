package com.company.jan18;
//Instance of is a keyword  used to check whether object is  instance of class
//to check type of object
public class TestInstanceOf {
    public static void main(String[] args) {
        Student student = new Student(12,"Sahil","abcde");
        boolean b = student instanceof Student;
        System.out.println(b);
    }
}
