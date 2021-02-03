package com.company.dec18_howToInitializeClassVariable;

public class NameMain3 {
    public static void main(String args[]) {
        Name name=new Name();
        name.firstName="Sahil";
        name.lastName="Mahajan";
        System.out.println("Full name is "+name.concatination());

    }
}
