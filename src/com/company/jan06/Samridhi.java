package com.company.jan06;

public class Samridhi {
    int id;
    String name;
    int salary;
    Samridhi(){

    }
    Samridhi(int id, String name, int salary) {
    this.id = id;
    this.name = name;
    this.salary = salary;

    }
    public int printId(){
        int a=id;
        return(a);
    }
    public String printName(){
        String personname = name;
        return(personname);
    }
    public int printSalary(){
        int sal = salary;
        return(sal);
    }



}
