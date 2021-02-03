package com.company.jan19Collections;

import java.util.ArrayList;
//Generics are defined within < > .With generics you can pass type to a class.
//They are mostly used with collections.They define the type of objects that would be stored in collections.
//They help in type checking of the objects that we try to store in collection.
//They help in compile time type safety.
//Diamond operator<>- It helps in defining the type same as that of generic type with <>(angular brackets)
//before java7 you had to define type of collection in both side of declaration
// but after java7,with diamond operator you have to define type only on left side.
//Diamond operator will automatically pick the type from left side.
public class TestArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<>();
        //Classname type_of_object name = new Classname type_of_object();
        a.add(1);
        a.add(2);
        a.add(3);
        System.out.println(a);
    }
}
