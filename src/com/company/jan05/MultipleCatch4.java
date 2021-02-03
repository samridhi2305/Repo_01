package com.company.jan05;
//A try block can be followed by more than one catch block
/*A try block must be followed by atleast one catch block because if an exception is thrown from try block there
 should be atleast
one catch block to handle that exception*/
/*hierarchy of catch block matters.If we have declared /caught parent exception before then we cant catch child exception below it.
we can declare child exception,then parent exception.
 */
public class MultipleCatch4 {
    public static void main(String[] args) {
        String a = "10";
        String b = "Mahajan";
        int c=0;
        try{
          c=Integer.parseInt(a)/Integer.parseInt(b);
        }
        catch(NumberFormatException e){
            System.out.println("Code logic has some number format error");
            System.out.println("Exception in this class is "+e);
        }

        catch(ArithmeticException e){
            System.out.println("Code logic has some arithmetic error");
            System.out.println("Exception in this class is "+e);
        }
        catch(RuntimeException e) {
            System.out.println("Code logic has some exception while converting string to int");
            System.out.println("Exception in this class is " + e);
        }
        System.out.println(c);
    }
}
