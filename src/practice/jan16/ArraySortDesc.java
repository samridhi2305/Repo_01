package practice.jan16;

import java.util.Arrays;

public class ArraySortDesc {

    public static void main(String[] args) {
        int arr[] = {5, 3, 2, 6, 9, 7, 10};
        int temp;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]<arr[j]){
                    temp=arr[j];
                    arr[j]=arr[i];
                    arr[i]=temp;
                }
            }
            System.out.println(arr[i]);
        }
//        for(int k=0;k<arr.length;k++){
//            System.out.println(arr[k]);
//        }

    }

}
