package com.company.jan19Collections;

import java.util.ArrayList;
import java.util.Iterator;
//ArrayList internally creates an array of size equal to the capacity of arraylist(10)
//when this arrayList reached its maximum size(10) then its size becomes 15(capacity*1.5)
//Now internally a new array is created whose size would be 15 and the 10 elements of 1st array would be copied to 2nd array
//And 1st array would be eligible for garbage collection.

//Load factor in HASHMAP
//Capacity is the initial size or the number of elements that arrayList can hold i.e. 10 here.
//10 is the default capacity
//LoAD Factor provides the criteria to reshuffle or increase the size of arrayList
//when we have(capacity*load factor) number of elements in an ArrayList then its size gets doubled.
//Load factor default value = 0.75
//when we add 7th element then its size gets doubled i.e 20 because 10*0.75 is 7.5,so at that point size gets doubled.
//Default value of ArrayList can be increased.

public class ArrayListIterator {
    public static void main(String[] args) {
        ArrayList<String> arr = new ArrayList<>(50);
        arr.add("Sahil");
        arr.add("Sahil");
        arr.add("Samridhi");
        arr.add("Manu bhaiya");
        arr.add("Abc");
        arr.add("Def");
        arr.add("Xyz");

        Iterator itr = arr.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
