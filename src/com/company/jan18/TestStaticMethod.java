package com.company.jan18;


//Test class to create and display the values of object
public class TestStaticMethod{
    public static void main(String args[]){
       // Student.change();//calling change method
        //creating objects
        Student s1 = new Student(111,"Karan","College1");

        s1.display();

        Student s2 = new Student(222,"Aryan","College2");

        Student s3 = new Student(333,"Sonoo","College3");
        //calling display method
        s1.display();
        s2.display();
        s3.display();
    }
}
