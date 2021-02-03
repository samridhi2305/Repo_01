package com.company.jan05;
//Throws keyword is used to propagate exception from one place to other
//in this case throws keyword is propagating exception from division method to the class calling this method
//jb hm thorws keyword lgate hain toh error dikahata hai when we are calling division method
public class Sahil7 {

     int division(String a,String b) throws NumberFormatException{
         int c;
         c = Integer.parseInt(a) / Integer.parseInt(b);
        return(c);
    }
}
