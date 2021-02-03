package practice.jan19;

import java.util.Arrays;

public class ArrayMerge3 {

    public static void main(String[] args) {
        int array1[] = {2,4,5,6};
        int array2[] = {14,15,16,17};
        int value = array1.length+array2.length;
        int array3[] = new int[value];
        int k = 0;
        for(int i=0;i<array1.length;i++){
            array3[i] = array1[i];
        }

        for(int i = array1.length;i<value;i++){
            array3[i] = array2[k];
            k++;
        }
        System.out.println(Arrays.toString(array3));
    }

}
