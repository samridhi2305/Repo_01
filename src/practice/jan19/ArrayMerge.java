package practice.jan19;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ArrayMerge {

    public static void main(String[] args) {
        int array1[] = {2,4,5,6};
        int array2[] = {14,15,16,17};
        int value = array1.length+array2.length;
        int array3[] = new int [value];

        System.out.println("Value is " +value);
        int k = 0;
        for(int i:array1){
            array3[k] = i;
           k++;
        }
        for(int i:array2){
            array3[k] = i;
            k++;

        }
        System.out.println(Arrays.toString(array3));

    }

}
