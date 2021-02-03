package practice.jan19;

import java.util.Arrays;

public class ArrayMerge2 {

    public static void main(String[] args) {
        int array1[] = {2,4,5,6};
        int array2[] = {14,15,16,17};
        int value = array1.length+array2.length;
        int array3[] = new int[value];
        int k = 0;
        for(int i=0;i<array1.length;i++){
            array3[k] = array1[i];
            k++;
        }
        for(int i = 0;i<array2.length;i++){
            array3[k] = array2[i];
            k++;
        }

        System.out.println(Arrays.toString(array3));

    }

}
