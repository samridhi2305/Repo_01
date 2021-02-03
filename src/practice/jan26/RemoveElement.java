package practice.jan26;

import java.util.Arrays;

public class RemoveElement {
    public static int[] removeElement(int arr[],int index){

        int b[]= new int[arr.length-1];
        int k=0;
        for(int i=0;i<arr.length;i++){
            if(i!=index){
                b[k]=arr[i];
                k++;
            }

        }
        return b;
    }

    public static void main(String[] args) {
        int arr[]={1,2,3,4};
        for(int i=0;i<arr.length;i++) {
            int[] b = removeElement(arr,i);
            System.out.println(Arrays.toString(b));
//            for(int z=0;z<b.length;z++){
//                System.out.println(b[z]);
//            }
        }


    }

}
