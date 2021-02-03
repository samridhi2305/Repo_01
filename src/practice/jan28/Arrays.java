package practice.jan28;

import java.util.Scanner;

public class Arrays{
    public static void main(String[] args){
        //int arr[] = {1,2,3,4,5};
        int counter;
        int number[] = new int[100];
        Scanner sc = new Scanner(System.in);
        counter = sc.nextInt();
        for(int j=0;j<counter;j++){
            number[j]=sc.nextInt();
        }
        for(int i=number.length-1;i>=0;i--){
            System.out.println(number[i]);
        }


    }

}