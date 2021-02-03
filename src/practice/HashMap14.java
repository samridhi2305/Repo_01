package practice;

import org.w3c.dom.ls.LSOutput;

import java.util.HashMap;
import java.util.Map;

public class HashMap14 {

    public static void main(String[] args) {
        HashMap<String,Integer> hashMap = new HashMap<>();
        hashMap.put("Java",4000);
        hashMap.put("DotNet",8000);
        hashMap.put("Python",6000);
        hashMap.put("C",5000);
        System.out.println(hashMap);
        hashMap.forEach((key,value) ->{
            System.out.print(key);
            System.out.print("=>");
            System.out.print(value);
            System.out.println();
            //System.out.println("key " + key+ "\tvalue " + value);
        });
        System.out.println(hashMap.get("Java"));
        hashMap.remove("Java");
        System.out.print(hashMap);
        System.out.println("keyset"+hashMap.keySet());
        System.out.println("values"+hashMap.values());
        System.out.println("entryset"+hashMap.entrySet());
        for(Map.Entry k:hashMap.entrySet()){
            System.out.print(k.getKey());
            System.out.println(k.getValue());
            System.out.print(k+"\n");
        }
    }

    //entry set
    //key set
}
