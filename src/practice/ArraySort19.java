package practice;

import java.util.ArrayList;

public class ArraySort19 {

    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        ArrayList<Integer> arr2 = new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(5);
        arr.add(4);
        arr.add(5);
        arr.add(6);
        for(Integer k:arr){
            if(!(arr2.contains(k))){
                arr2.add(k);
            }
        }
        System.out.println(arr2);



    }

}
