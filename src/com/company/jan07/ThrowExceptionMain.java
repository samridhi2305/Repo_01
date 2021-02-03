package com.company.jan07;
//throw keyword gives an exception and breaks the try block or the program flow and then go to catch block.
// throw keyword is used to explicitly throw an exception from the code
//Call to Child class constructor with the message
// Child class pass the message to Parent class constructor
// Parent class constructor stores the message in e variable
// Then we fetch the value of e variable in catch block and print the message
public class ThrowExceptionMain {
    public static void main(String[] args) {
        String s = "";
        try{
             s = "Sahil";
             if(s.equals("Sahil")) {
                 throw new IllegalNameException("Name "+s+" is not valid");
             }
            System.out.println("out of if and inside try");

        }
        catch(Exception e) {
            System.out.println(e);
}

    }
}
