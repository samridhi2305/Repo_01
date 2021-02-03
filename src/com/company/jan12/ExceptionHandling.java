package com.company.jan12;

import java.io.BufferedReader;
import java.io.FileReader;
import java.sql.SQLOutput;
//Resource Management
//BufferedReader b = new BufferedReader(f); This line will create connection between Object b and file.
public class ExceptionHandling {
    public static void main(String[] args) {
        BufferedReader b =null;
        String s = null;

        try {
            FileReader f = new FileReader("d:/Hello.txt");
             b = new BufferedReader(f);
            s = b.readLine();
            System.out.println(s);

        }
        catch(Exception e)
        {
            System.out.println("Exception is "+e);
        }
        finally{
            try {
                b.close();
            }
            catch(Exception e){
                System.out.println("Exception is "+e);
            }
        }
    }

}
