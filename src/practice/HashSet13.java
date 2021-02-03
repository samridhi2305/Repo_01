package practice;

import java.util.HashSet;
import java.util.TreeSet;

public class HashSet13 {

    public static void main(String[] args) {
        HashSet<Integer> hash = new HashSet<>();
        hash.add(1);
        hash.add(2);
        hash.add(3);
        hash.add(3);
        hash.add(3);
        hash.add(4);
        hash.add(5);
        hash.add(6);
        hash.add(6);
        hash.add(7);
        hash.add(15);
        hash.add(8);
        System.out.println(hash);
        for (Integer m:hash){
            System.out.print(m);
        }
        System.out.println("\nTREESET");
        TreeSet<Integer> treeSet = new TreeSet<>();
        treeSet.addAll(hash);
        System.out.println(treeSet);
            }
}
