package practice;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Vector;

public class LinkedList12 {

    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("Samridhi");
        list.add("Adi");
        list.add("Aditya");
        list.add("Mehra");
        list.add("Mini");
        System.out.println(list);
        Iterator itr = list.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());

        }
        list.remove("Samridhi");
        System.out.println(list);
        list.remove(1);
        System.out.println(list);
        list.set(1,"New");
        System.out.println(list);
        list.add(1,"Element");
        System.out.println(list);
        //CLEARS LIST
//        list.clear();
//        System.out.println(list);
        //VECTOR
        Vector<String> vector = new Vector<>();
        vector.addAll(list);
        System.out.println("Vector is "+vector);


    }

}
