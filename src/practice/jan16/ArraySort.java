package practice.jan16;

import java.util.Arrays;

public class ArraySort {

    public static void main(String[] args) {
        int arr[] = {5,7,4,3,2,8,1,10};
        int temp = 0;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]>arr[j]){
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }

        }
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }


//        int arr1[] = {5,3,2,6,9,7,10};
//        Arrays.sort(arr);
//        for(int i=0;i<arr.length;i++){
//            System.out.println(arr1[i]);
//        }
    }

}
