package com.company.dec22;

public class CompareString {
    public static void main(String[] args) {
        String a="Sahil";
        String b="sahil";
        String c="Samridhi Mehra is a girlh";
        String d=" manu ";
        String e=" ";
        if(a.equalsIgnoreCase(b)){
            System.out.println("a is equal to b");
        }
        else
        {
            System.out.println("a is not equal to b");
        }

        if(a.contains("v")){
            System.out.println("String a contains h");
        }
        else{
            System.out.println("v is not present in String a");
        }
        System.out.println(a.length());
        System.out.println(a.charAt(4));
        System.out.println(a.indexOf("h"));
        System.out.println(c.substring(9,13));
        System.out.println(c.concat(" "+a));
        System.out.println(c.lastIndexOf("h"));
        System.out.println(c.replace("Mehra","Mahajan"));
        System.out.println(c.toLowerCase());
        System.out.println(d.trim());
        if(e.isEmpty()){
            System.out.println("string is empty");
         }
        else
        {
            System.out.println("String not empty");
        }
        if(a.startsWith("s")){
            System.out.println("string starts with s");
        }
        else{
            System.out.println("string does not start with s");
        }

     if(e.trim().isEmpty()){
         System.out.println("Empty string");

     }
     else{
         System.out.println("non empty string");
     }
    }
}
