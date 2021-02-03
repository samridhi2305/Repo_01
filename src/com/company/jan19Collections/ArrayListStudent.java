package com.company.jan19Collections;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListStudent {
    public static void main(String[] args) {
        Student student = new Student(1,"Sahil","CSE");
        Student student2 = new Student(2,"Samridhi","ECE");
        Student student3 = new Student(3,"Manu bhaiya","Computer");
        ArrayList<Student> arr = new ArrayList<>();
        arr.add(student);
        arr.add(student2);
        arr.add(student3);
       Student b = arr.get(1);
        System.out.println(b);
      /* for(Student k:arr){
           System.out.println(k);
       }
*/
        Iterator itr = arr.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
        System.out.println(arr.get(2).getName());
    }
}
