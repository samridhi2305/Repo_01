package com.company.dec22;

public class ArrayTable {
    public static void main(String[] args) {
        int a[]=new int[10];
        for(int i=0;i<a.length;i++){
            a[i]=(i+1)*5;
        }
        for(int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }
    }
}
