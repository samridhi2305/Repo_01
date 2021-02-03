package com.company.jan18;

class Student{
    int rollno;
    String name;
    static String college;
    //static method to change the value of static variable
    /*static void change(){
        college = "BBDIT";
    }*/
    //constructor to initialize the variable
    Student(int r, String n,String coll){
        rollno = r;
        name = n;
        college = coll;
    }
    //method to display values
    void display(){System.out.println(rollno+" "+name+" "+college);}
}
