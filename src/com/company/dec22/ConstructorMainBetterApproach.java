package com.company.dec22;
//the value that is can be reused is put in constructor and dynamic value is passed in methods
public class ConstructorMainBetterApproach {
    public static void main(String[] args) {
        ConstructorBetterApproach cons= new ConstructorBetterApproach(5);

        cons.multiple(5);
        cons.multiple(6);
        cons.multiple(15);
        cons.multiple(20);
    }
}
