package practice.jan22;

import java.util.Arrays;

public class AtEvenNumbered {

    public static void main(String[] args) {
        int arr[] = {1,2,5,4,6,7,8};
        int b[]=new int[arr.length];
        for(int i=1;i<arr.length;i=i+2){
            System.out.println(arr[i]);


        }

        int arr2[] = {1,2,5,4,6,7,8};
        int b2[]=new int[arr.length/2];
        int k=0;
        for(int i=1;i<arr.length;i=i+2){
            b2[k]=arr2[i];
            k++;
        }
        System.out.println(Arrays.toString(b2));


    }

}
