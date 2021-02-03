package practice;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayLisSort18 {

    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(5);
        arr.add(10);
        arr.add(15);
        arr.add(8);



        Collections.sort(arr);
        System.out.println(arr);
        //Collections.reverseOrder(arr);
    }

}
