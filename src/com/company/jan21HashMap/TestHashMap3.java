package com.company.jan21HashMap;

import java.util.HashMap;

public class TestHashMap3 {
    public static void main(String[] args) {
        HashMap<Boolean,String> h = new HashMap<>();
        h.put(true,"Sahil");
        h.put(false,"Samridhi");
        System.out.println(h);
        h.put(null,"Manu");
        System.out.println(h);
    }
}
