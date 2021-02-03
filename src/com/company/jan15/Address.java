package com.company.jan15;
//DATA CLASS
public class Address {
    String houseNumber;
    String streetName;
    String city;
    String country;

   public String toString(){
       String s ="House number = "+houseNumber+",Street Name = "+streetName+" and City = "+city;
       return s;
   }

    Address(String houseNumber, String streetName, String city){
        this.houseNumber = houseNumber;
        this.streetName = streetName;
        this.city = city;
    }
}
