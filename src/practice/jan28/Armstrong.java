package practice.jan28;
import java.util.Scanner;
//ARMSTRONG
public class Armstrong{
    public static void main(String[] args){
        int rem=0;

        int num;
        int n=0;
        //int num=153;
        Scanner sc = new Scanner(System.in);
        num= sc.nextInt();
        int temp=num;
        while(num>0){
            rem=num%10;
            n=n+(rem*rem*rem);
            num=num/10;

        }
        if(temp==n){
            System.out.println("It is armstrong number");
        }
        else{
            System.out.println("no");
        }
    }

}