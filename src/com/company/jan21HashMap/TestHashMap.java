package com.company.jan21HashMap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

//HashMap stores in the form of key value pair.
//Each value can be accessed via their key.Keys are always unique but values can be duplicate.
//Its default capacity is 16 and load factor is 0.75.
//Keys can always have a unique value or one null value
//value can have duplicate values or null values.

public class TestHashMap {
    public static void main(String[] args) {
        HashMap<Integer,String>  h= new HashMap<>();
        //Classname Key,Value name = new Classname
        h.put(1,"Sahil");
        h.put(2,"Samridhi");
        h.put(3,"Manu");
        System.out.println(h);
        System.out.println(h.get(2));
        h.put(3,"abcde");
        System.out.println(h);
        h.put(5,"Sahil");
        System.out.println(h);
        h.remove(5);
        System.out.println(h);
        System.out.println(h.get(3));

        HashMap<Integer,String> h2 = new HashMap<>(50);//Defined initial capacity
        HashMap<Integer,String> h3 = new HashMap<>(20,0.8f);//Defined initial capacity and load factor.


        /*for(Map.Entry k:h.entrySet()){
            System.out.println(k.getValue());
            System.out.println(k.getKey());
            System.out.println(k);
        }*/




    }
}
