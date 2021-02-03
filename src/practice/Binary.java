package practice;

import java.util.ArrayList;
import java.util.Arrays;

public class Binary {

    public static void main(String[] args) {
        int num = 17;
        int array[] = new int[10];
        int i = 0;
        while (num > 0) {
            array[i] = num % 2;
            num = num / 2;
            i++;
//            System.out.println("num is " +num);
//            System.out.println("array is "+array[i-1]);
        }
        for (int l = i - 1; l >= 0; l--) {
            System.out.print(array[l]);
        }
        System.out.println(Arrays.toString(array));
    }

//        ArrayList<Integer> arrayList = new ArrayList<>();
//        int i = 0;
//        while (num > 0) {
//            num = num / 2;
//            int remainder = num % 2;
//            arrayList.add(remainder);
//
//        }
//        System.out.println(arrayList);
//    }

}
