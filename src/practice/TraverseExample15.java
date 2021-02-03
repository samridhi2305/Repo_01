package practice;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.TreeSet;

public class TraverseExample15 {

    public static void main(String[] args) {
        ArrayList<String> arr=new ArrayList<>();
        arr.add("Samridhi");
        arr.add("Aditya");
        arr.add("Sita");
        arr.add("Geeta");
        arr.add("Manu");
        arr.add("Rekha");
        for(String str:arr){
            System.out.print(str+"\t"+str.length() + "\t");
            StringBuffer br = new StringBuffer(str);
            System.out.println(br.reverse());
        }
        Iterator itr = arr.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
        //Traversal Backward - List Iterator
        ListIterator listIterator = arr.listIterator(arr.size());
        while(listIterator.hasPrevious()){
            System.out.print(listIterator.previous());
        }

        //Traverse using for each
        System.out.println("for each method");
        arr.forEach(e ->{
            System.out.print(e +"\t");
        });
        System.out.println("\n-----------TREESET-----------------");
        TreeSet<String> tree = new TreeSet<>();
        tree.addAll(arr);
        tree.forEach(e->{
            System.out.print(e);
        });

    }

}
