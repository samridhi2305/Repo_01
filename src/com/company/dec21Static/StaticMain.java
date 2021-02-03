package com.company.dec21Static;
//static method me static method directly call ho skta h.if we want to call non static method within a static method(eg. main)
// then we need to create an object for that.
public class StaticMain {
    int a=10;
    static int b=20;
    public static void main(String[] args) {
     hello();// StaticMain.hello(); by default it will take StaticMain.hello
//    static method me sirf static method or static variables use ho skte hain
       StaticMain s1=new StaticMain();
       s1.world();
    }
    static void hello(){
        System.out.println("hello");
      //  System.out.println(a);//static method me non static variables call nhi ho skte
        System.out.println(b);
    }

    void world() {
        System.out.println("world");
    }
}
