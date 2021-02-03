package practice.jan16;

import java.util.Arrays;

public class ArrayMarathon {

    public static void main(String[] args) {
        int dist = 42;//use proper naming
        //int arr[]={23,24,36,42,40,42,12,42,16};
        //int arr[] = {36, 42, 40, 42, 42};
        int arr[]={23,24,36,42,54,40,42,12,42,16};
        int arr2[] = new int[arr.length];
        int i = 0;
        int j = 0;
        for (i = 0; i < arr.length; i++) {
            //if(arr[i]>dist){//proper spacing
            if (arr[i] > dist) {
                System.out.println("invalid value provided for distance");
                return;
            }
            if (arr[i] != dist) {
                arr2[j] = arr[i];
                j++;
            }
            System.out.println(Arrays.toString(arr2));

        }
        /* not necessary
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr2[i]);
        }
        */
        int temp = 0;
        for (i = 0; i < arr2.length; i++) {
            for (j = i + 1; j < arr2.length; j++) {
                if (arr2[i] < arr2[j]) {
                    temp = arr2[i];
                    arr2[i] = arr2[j];
                    arr2[j] = temp;
                }

            }
            //System.out.println(arr2[m]);
        }
        System.out.println("Max values are ");
        for (i = 0; i < 3; i++) {
            if (arr2[i] != 0) {
                System.out.print(arr2[i] + "\t");//Print as required
            }
        }

    }

}
