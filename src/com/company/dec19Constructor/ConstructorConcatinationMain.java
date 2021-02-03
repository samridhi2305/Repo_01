package com.company.dec19Constructor;
//polymorphism for constructor
//jisme parameters pass hoge usiki overloading hogi.method me we have not passed any variables ,so ....cant do method overloading
public class ConstructorConcatinationMain {
    public static void main(String args[]) {
        ConstructorConcatination4 obj=new ConstructorConcatination4("Sahil","Mahajan");
        obj.concatination();
        ConstructorConcatination4 obj2 = new ConstructorConcatination4("Sahil","Mehra","Mahajan");
        obj2.newConcatinate();
    }
}
