package com.company.jan19Collections;

import java.util.ArrayList;

public class ArrayListWhileLoop {
    public static void main(String[] args) {
        ArrayList<Boolean> b = new ArrayList<>();
        b.add(true);
        b.add(false);
        b.add(false);
        b.add(true);
        int i=0;
        while(i<b.size()) {
            System.out.println(b.get(i));
            i++;
        }


    }
}
