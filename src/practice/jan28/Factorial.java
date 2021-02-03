package practice.jan28;

import java.util.Scanner;


public class Factorial{
    public static void main(String[] args){
        int num = 5;
        int factorial=1;
        Scanner sc = new Scanner(System.in);
        System.out.println(sc.nextLine());

        for(int i=num-1;i>=1;i--){
            factorial=factorial*i;

        }

        System.out.println(factorial);
    }
}