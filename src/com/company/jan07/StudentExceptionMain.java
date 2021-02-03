package com.company.jan07;

public class StudentExceptionMain {
    public static void main(String[] args) {
        Student student1 = new Student(1,"Sahil",true);
        Student student2 = new Student(10,"Samridhi",false);
        Student student3 = new Student(200,"Manu",true);
        boolean n;
        try{
             n = student1.getBlocked();
            if(n==true){
              throw new BlockedStudentException("Student "+student1.getName()+" is blocked");
            }
            System.out.println("Student "+student1.getName()+" not blocked");
        }
        catch(BlockedStudentException e){
            System.out.println(e);
        }

        try{
            n = student2.getBlocked();
            if(n==true){
                throw new BlockedStudentException("Student "+student2.getName()+" is blocked");
            }
            System.out.println("Student "+student2.getName()+" not blocked");

        }
        catch(BlockedStudentException e){
            System.out.println(e);
        }

        try{
            n = student3.getBlocked();
            if(n==true){
                throw new BlockedStudentException("Student "+student3.getName()+" is blocked");
            }
            System.out.println("Student "+student3.getName()+" not blocked");
        }
        catch(BlockedStudentException e){
            System.out.println(e);
        }
    }

}
