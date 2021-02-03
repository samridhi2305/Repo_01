package com.company;

public class StringFunctions8 {
    public static void main(String args[]) {
        String name1 = "Sahil";
        String name2 = "Mahajan";
        String a = "Samridhi";
        String b = "Mehra";
        name(name1, name2);
        name(a, b);
        name("manu", "saalajimere");
        concatinate(name1, name2);
        String value = returnConcatinate(a, b);
        System.out.println("Your full name is " + value);
    }

    static void name(String firstName, String lastName) {
        System.out.println("first name is " + firstName);
        System.out.println("last name is " + lastName);

    }

    static void concatinate(String m, String n) {
        System.out.println("your full name is " + m + " " + n);

    }

    static String returnConcatinate(String m, String n) {
        String c = m + " " + n;
        return c;
    }
}
