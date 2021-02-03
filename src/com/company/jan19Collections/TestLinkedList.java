package com.company.jan19Collections;

import java.util.Iterator;
import java.util.LinkedList;

public class TestLinkedList {
    public static void main(String[] args) {
        LinkedList<String> l = new LinkedList<>();
        l.add("Sahil");
        l.add("Samridhi");
        l.add("Adi");
        l.add("Abcde");
        l.add("xyz");
        Iterator itr = l.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
