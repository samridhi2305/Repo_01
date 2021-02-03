package com.company.jan12;

import java.io.BufferedReader;
import java.io.FileReader;

//Automatic Resource Management-Try ki exit pe wo connection close karega.

public class ExceptionHandlingEnhancements {
    public static void main(String[] args) {

        String s = null;
        //Object that necessarily needs to be closed(BufferedReader Object b) is put inside brackets of try.So we dont need finally
        //block anymore.
        //It is called Automatic Resource Management in try-statement.
        try(BufferedReader b = new BufferedReader(new FileReader("d:/Hello.txt"))) {
            System.out.println(b.readLine());
        }
        catch(Exception e)
        {
            System.out.println("Exception is "+e);
        }
    }

}
