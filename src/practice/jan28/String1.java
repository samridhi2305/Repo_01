package practice.jan28;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

//STRING ARRAYLIST
public class String1{
    public static void main(String[] args){
        //String str = "Samridhi Mehra";
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        List<String> stringss = Arrays.asList(str.split(" "));
        for(String s:stringss){
            StringBuffer br = new StringBuffer(s);
            System.out.println(br.reverse());

        }
        System.out.println(stringss);



    }
}