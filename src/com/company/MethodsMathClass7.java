package com.company;

public class MethodsMathClass7 {

    public MethodsMathClass7() {}//it is  a constructor
     private void printNumber(int num1, int num2) {
        System.out.println("First number is " + num1);
        System.out.println("Second number is "+num2);
    }
     public void addition(int number1,int number2)
    {
        printNumber(number1, number2);
        int c=number1+number2;
        System.out.println("Addition of the two numbers is "+c);

    }
    void subtraction(int number1,int number2)
    {
        int d=number2-number1;
        System.out.println("Subtraction of the two numbers is "+d);
    }
     int multiplication( int number1,int number2)
    {
        int e=number1 * number2;
        return e;
    }

    int division(int number1, int number2) {
        int y=number2 / number1;
        return y;

    }

}
