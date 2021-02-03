package com.company;

public class Methods6 {
    public static void main(String args[]) {
        int firstNumber = 2;
        int secondNumber = 3;//space when we are equating
        double a = 2.0;
        double b = 3.0;
        printHello();
        printNumber(firstNumber, secondNumber);
        addition(firstNumber, secondNumber);
        subtraction(firstNumber, secondNumber);
        int multiply = multiplication(firstNumber,secondNumber);
        System.out.println("Multiplication of two numbers is " + multiply);//space when we are using operators
        String divi = division2(firstNumber,secondNumber);
        System.out.println(divi);//printing a string value
        double div = division(a,b);
        System.out.println("Division of numbers is " + div);
    }
        static void printHello() {
        System.out.println("HELLO");
        }

        static void printNumber(int num1, int num2) {
        System.out.println("First number is " + num1);
        System.out.println("Second number is "+num2);
    }
        static void addition(int number1,int number2)
        {
        int c=number1+number2;
        System.out.println("Addition of the two numbers is "+c);

    }
        static void subtraction(int number1,int number2)
    {
        int d=number2-number1;
        System.out.println("Subtraction of the two numbers is "+d);
    }
        static int multiplication( int number1,int number2)
    {
        int e=number1 * number2;
        return e;
    }

        static String division2(int number1,int number2)
    {
        int g=number2/number1;
        String z="Div of two numbers is "+g;
        return z;
    }
    static double division(double number1, double number2) {
        double y=number2 / number1;
        return y;

    }

}
