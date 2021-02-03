package practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.ListIterator;

public class ArrayListReverse16 {

    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(5);
        arr.add(10);
        arr.add(15);
        arr.add(8);
        System.out.print(arr);
        ListIterator itr = arr.listIterator(arr.size());
        while (itr.hasPrevious()) {
            System.out.print(itr.previous() + ", ");
        }
        Collections.reverse(arr);
        System.out.println(arr);
        int a[] = new int[10];

    }

}
//        while(itr.hasPrevious()) {
//            arr2.add((Integer) itr.previous());
//
//        }
//        System.out.println(arr2);



