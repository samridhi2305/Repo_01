package practice.jan24;

import java.util.Arrays;

//5 1 2 3 4
public class RotateArray {

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5};
        int b[] = new int[arr.length];
        b[0]=arr[arr.length-1];
        for(int i=0;i<arr.length-1;i++){
            b[i+1] = arr[i];
        }
        System.out.println(Arrays.toString(b));
        }


    }


