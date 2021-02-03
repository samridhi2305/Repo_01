package practice.jan22;

import java.util.Arrays;

//1 2 3 4 5 6 7 8 9
public class ReverseNumberUsingSwap {

    public static void main(String[] args) {
        int arr[] = {1, 5, 4, 6, 8, 10, 3, 2};
        int j = arr.length - 1;
        int temp = 0;
        for (int i = 0; i < arr.length / 2; i++) {
            temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            j--;
        }
        System.out.println(Arrays.toString(arr));
        //Odd numbers
        int arr2[] = {1, 5, 4, 6, 8, 10, 3, 2, 9};
        int k = arr2.length - 1;
        int tempo = 0;
        for (int i = 0; i < arr2.length/ 2; i++) {
            tempo= arr2[i];
            arr2[i] = arr2[k];
            arr2[k] = tempo;
            k--;
        }
        System.out.println(Arrays.toString(arr2));
    }

}
