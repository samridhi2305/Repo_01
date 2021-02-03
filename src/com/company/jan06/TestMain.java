package com.company.jan06;

public class TestMain {
    public static void main(String[] args) {
        Samridhi samridhi = new Samridhi(1,"Sahil",10000);
        int empid = samridhi.printId();
        System.out.println("person id is "+empid);
      String d = samridhi.printName();
        System.out.println("person name is "+d);
        int personSalary = samridhi.printSalary();
        System.out.println("person salary is "+personSalary);



    }
}
