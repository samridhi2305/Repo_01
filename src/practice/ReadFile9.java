package practice;

import java.io.*;

public class ReadFile9 {

    public static void main(String[] args) throws Exception {
        FileReader fr = new FileReader("D:/Hello.txt");
        BufferedReader br = new BufferedReader(fr);
        //BufferedReader br = new BufferedReader(new FileReader("D:/Hello.txt"));
        String st;
        while ((st = br.readLine()) != null){
            System.out.println(st);
        }

    }

}
