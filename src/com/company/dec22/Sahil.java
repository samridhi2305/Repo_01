package com.company.dec22;

public class Sahil {
    String a;
    Sahil(String a){
      this.a=a;
    }
    Sahil(){

    }
    void printDay(String b) {
        switch (b) {
            case "Mon":
                System.out.println("day is monday");
                break;
            case "Tues":
                System.out.println("day is tuesday");
                break;
            case "Wed":
                System.out.println("day is wednesday");
                break;
            case "Thu":
                System.out.println("day is thursday");
                break;
            case "Fri":
                System.out.println("day is friday");
                break;
            case "Sat":
                System.out.println("day is saturday");
                break;
            case "Sun":
                System.out.println("day is sunday");
                break;
            default:
                System.out.println("No Day");
                break;

        }
        }
        void printDay() {
            switch ("Fri") {
                case "Mon":
                    System.out.println("day is monday");
                    break;
                case "Tues":
                    System.out.println("day is tuesday");
                    break;
                case "Wed":
                    System.out.println("day is wednesday");
                    break;
                case "Thu":
                    System.out.println("day is thursday");
                    break;
                case "Fri":
                    System.out.println("day is friday");
                    break;
                case "Sat":
                    System.out.println("day is saturday");
                    break;
                case "Sun":
                    System.out.println("day is sunday");
                    break;
                default:
                    System.out.println("No Day");
                    break;

            }

        }
    }