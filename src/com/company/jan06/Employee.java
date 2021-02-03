package com.company.jan06;
//It is a data class that has some variables which can store data and we have methods to get and set that data.
/*This is called data hiding as we are hiding our data members and they can only be accessed via their getter and setter methods
This process is called Encapsulation.
 Encapsulation is the way of wrapping data members and their methods in a single class so that the data members can only be accessed via
  their methods.
  Encapsulation is achieved using two things
  1) Data members are always private
  2) Data members have getter and setter methods
  Employee is a custom data type as we have stored variables and methods in this data type.
  */
public class Employee {
    private int id;
    private String name;
    private int salary;
    public void setSahilKiId(int id){
        this.id = id;

    }
    public int getSahilKiId(){
        return(id);

    }
    public void setName(String name)
    {
        this.name = name;

    }
    public String getName(){
        return(name);
    }
    public void setSalary(int salary){
        this.salary = salary;
    }
    public int getSalary(){
        return(salary);
    }
}
