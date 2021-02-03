package com.company.jan15;
//DATA CLASS
//POJO-Plain old java object is an achronym to data class(which has variables and getter setters and they are used to
//capture some kind of data)
public class Student {
    String name;
    int id;
    Address address;//Address is a datatype now

    Student(String name,int id,Address address){
      this.name = name;
      this.id = id;
      this.address = address;
      Address adr = new Address("123","Abcde","amritsar");
        System.out.println(adr);
    }

    public String toString(){
        String s = "Student name is "+name+"\n"+"Id is "+id+"\n"+"Address of student is "+address;
        return s;
    }



}
