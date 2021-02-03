package practice;

import java.util.Arrays;

//1000000111010101
public class binarySplit {

    public static void main(String[] args) {
        String binary = "1100000101";
        String arr[] = binary.split("1");
        String k = "";
        for(String s:arr) {
            if(k.length()<s.length()){
                k = s;
            }
        }
        System.out.println(k.length());
        System.out.println(Arrays.toString(arr));
    }
}
