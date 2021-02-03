package com.company.jan19Collections;

import java.util.ArrayList;

public class ArrayListfForEachLoop {
    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<>();
        a.add(1);
        a.add(2);
        a.add(3);
        a.add(4);
        a.add(5);
        for(Integer k:a){
            System.out.println(k);
        }
    }
}
