package practice;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayList11 {

    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        //ADD
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(5);
        System.out.println(arr);
        System.out.println("For loop");
        //GET
        for(int i=0;i<arr.size();i++){
            System.out.print(arr.get(i) +" ");
        }
        //REMOVE
        arr.remove(3);
        System.out.println();
        //GET WHILE
        System.out.println("while loop");
        int j=0;
        while(j<arr.size()){
            System.out.print(arr.get(j));
            j++;
        }
        System.out.println();
        //FOR EACH
        System.out.println("for each");
        for(Integer k:arr){
            System.out.print(k + " ");
        }
        System.out.println("\nIterator");
        Iterator itr = arr.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
        arr.remove(3);
        System.out.println(arr);
        System.out.println("size is " + arr.size());
        //CONTAINS
        System.out.println(arr.contains(3));
        //CHECK EMPTY
        System.out.println(arr.isEmpty());

    }

}
