package practice.jan24;

import java.util.Arrays;

public class jan24 {

    public static void main(String[] args) {
        String str = "I love India";
    String[] array1 =str.split(" ");
    String newStr="";
        String word;
        System.out.println(Arrays.toString(array1));
        for(int i=0;i<array1.length;i++){
            word=array1[i];
           for(int k=word.length()-1;k>=0;k--){

               newStr=newStr+word.charAt(k);


           }
            newStr=newStr + " ";

        }
        System.out.println(newStr);


    }

}
