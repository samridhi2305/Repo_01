package com.company.dec19Constructor;
//constructor overloading.ek constructor diff diff kaam kr rha h
public class  ConstructorConcatination4 {
    String firstName;
    String middleName;
    String lastName;

    ConstructorConcatination4(String a, String b) {
        firstName=a;
        lastName=b;
    }

    void concatination() {
        String name=firstName+" "+lastName;
        System.out.println("Full name is "+name);

    }
    ConstructorConcatination4(String a, String b, String c) {
        firstName=a;
        middleName=b;
        lastName=c;
    }
    void newConcatinate() {
        String abc=firstName+" "+middleName+" "+lastName;
        System.out.println(abc);

    }

}
