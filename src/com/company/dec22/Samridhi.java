package com.company.dec22;

public class Samridhi {
    int a;
    Samridhi(int a){
        this.a=a;
    }
    void printDay(){
       switch(a)//value check
       {
           case 1:
               System.out.println("monday");
               break;
           case 2:
               System.out.println("tuesday");
               break;
           case 3:
               System.out.println("wednesday");
               break;
           case 4:
               System.out.println("thursday");
               break;
           case 5:
               System.out.println("friday");
               break;
           case 6:
               System.out.println("saturday");
               break;
           case 7:
               System.out.println("sunday");
               break;
           default:
               System.out.println("no day");
       }


    }
}
