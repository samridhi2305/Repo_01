package com.company.jan07;

public class StudentExceptionMain2WithFunctions {
    public static void main(String[] args) {
        Student student1 = new Student(1,"Sahil",true);
        Student student2 = new Student(10,"Samridhi",false);
        Student student3 = new Student(200,"Manu",true);
        checkStudent(student1);
        checkStudent(student2);
        checkStudent(student3);

    }

    static void checkStudent(Student s){
        boolean n;
        try{
            n = s.getBlocked();
            if(n){
                throw new BlockedStudentException("Student "+s.getName()+" is blocked");
            }
            System.out.println("Student "+s.getName()+" not blocked");
        }
        catch(BlockedStudentException e){
            System.out.println(e);
        }
    }

}
