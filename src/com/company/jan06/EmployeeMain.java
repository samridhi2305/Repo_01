package com.company.jan06;

public class EmployeeMain {
    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.setSahilKiId(1);
        System.out.println("Id is "+ employee.getSahilKiId());
        employee.setName("Sahil Mahajan");
        String j = employee.getName();
        System.out.println("Name of person is "+j);
        employee.setSalary(5000);
        int k = employee.getSalary();
        //System.out.println("Salary of "+j+" is "+k);
        System.out.println("Salary of "+ employee.getName() +" is "+employee.getSalary());
      //  Employee employee2 = new Employee();
        //employee2.id = 2;
        //System.out.println("Id is "+ employee2.id);


        Integer i = new Integer(1);//i can hold data of type integer
        String s = new String();//s can hold data of type String
        Employee e = new Employee();//e can hold data of type Employee
    }
}
