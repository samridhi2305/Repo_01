package com.company.dec21Static;

/*java creates default/blank constructor for every class but if you create any constructor by yourself then
java does not create any default constructor*/
public class HelloWorldMain {

    public static void main(String[] args) {
        HelloWorld h1 = new HelloWorld(10);
        h1.hello();
        HelloWorld h2 = new HelloWorld(50, 60);
        h2.hello2();
        HelloWorld h = new HelloWorld();
        h.sayHello();
    }

}
