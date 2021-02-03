package com.company.dec22;

public class SahilMain {
    public static void main(String[] args) {
        Sahil sahil=new Sahil("Tues");
        sahil.printDay();
        Sahil sahil1=new Sahil("Sun");
        sahil1.printDay();
        Sahil sahil2=new Sahil();
        sahil2.printDay("Thu");
    }
}
