package com.company.dec22Math;

public class Main {
    public static void main(String[] args) {

     Integer integer=new Integer(10,20);
       integer.addition();
       integer.subtraction();
       integer.multiply();
       integer.division();
       Integer integer2 = new Integer(1,2);
       integer2.addition();


     Double db = new Double(1.5,2.5);
     db.addition();
     db.subtraction();
     db.multiply();
     db.division();
    }
}

/*
class Person{
    int id;
    String name;
    Person(int id,String name){
        this.id=id;
        this.name=name;
    }
}
class Emp extends Person{
    float salary;
    Emp(int id,String name,float salary){
        super(id,name);//reusing parent constructor
        this.salary=salary;
    }
    void display(){System.out.println(id+" "+name+" "+salary);}
}
class TestSuper5{
    public static void main(String[] args){
        Emp e1=new Emp(1,"ankit",45000f);
        e1.display();
    }}
    */