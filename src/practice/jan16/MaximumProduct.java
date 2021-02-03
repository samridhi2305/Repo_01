package practice.jan16;

import java.lang.reflect.Array;
import java.util.Arrays;

public class MaximumProduct {

    public static void main(String[] args) {
        //int array1[] = {2, 3, 4, 7, 5, 6};
        //int array1[] = {2, 7, 6};
        //int array1[] = {2, 3, 4, 0, 7, 5, 6};
        int array1[] = {2, 7, 0, 6};
        if (array1.length < 4) {
            System.out.println("Array length less than 4");
            return;
        }

        //System.out.println(Arrays.stream(array1).anyMatch(val -> val == 0));
        if (array1.length == 4) {
            for (int value : array1) {
                if (value == 0) {
                    System.out.println("Array of length 4 contains element of 0 value");
                    return;
                }
            }

        }
        int value = 0;
        int i = 0;
        for (i = 0; i < array1.length; i++) {
            for (int j = i + 1; j < array1.length; j++) {
                if (array1[i] < array1[j]) {
                    value = array1[i];
                    array1[i] = array1[j];
                    array1[j] = value;
                }
            }

        }
        int product = 1;
        for (i = 0; i < 4; i++) {
            product = product * array1[i];
        }
        System.out.println("Product is " + product);

    }

}
