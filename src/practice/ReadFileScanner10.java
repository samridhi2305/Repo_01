package practice;

import java.io.*;
import java.util.Scanner;

public class ReadFileScanner10 {

    public static void main(String[] args) throws Exception{
        File file = new File("D:\\Hello.txt");
        Scanner scr = new Scanner(file);
        while(scr.hasNextLine()){
            System.out.println(scr.nextLine());
        }
    }

}
