package com.company.jan21HashMap;

import java.util.HashMap;
//HashMap internally overrides two methods of object class-hashCode and equals
//It calculates hashCode of each key and use the equals method to check whether hashCode of two objects/keys is same
//If both hashCodes are equal then the keys are duplicate
//HashMap use some internal logic to calculate hashCode but there are some scenarios where two objects can have same hashCode
//But still they are not equal.
//HashMap internally uses hashSet to store its keys
//keySet method to get all keys


public class TestHashMap2 {
    public static void main(String[] args) {
        HashMap<String,String> h = new HashMap<>();
        h.put("Sahil","Amritsar");
        h.put("Samridhi","Gurugram");
        h.put("Manu bhaiya","Asr");
        System.out.println(h);
        h.put("Sahil","Oslo");
        System.out.println(h);
        System.out.println(h.get("Sahil"));
        h.keySet();
        System.out.println(h.keySet());//print all keys
        System.out.println("Hello");
        System.out.println(h.values());//print all values
        h.put("Ishi",null);
        System.out.println(h);
        h.put(null,"qwerty");//index of null is always zero
        System.out.println(h);
        h.put(null,"Newvalue");
        System.out.println(h);
        h.put("Shivi",null);
        System.out.println(h);


    }
}




//put method pe it calculates hashCode
//hashCode of Sahil=12345.checks if this hashCode exists,if no then it creates a new entry set and store sahil in key and
//amritsar in value
//hashCode of samridhi=78910.checks.............
//hashcode of manu................
//hashCode of sahil=12345
//same hashCode.so it overrides value with old one.

