package practice.jan22;

import java.util.Arrays;

public class ReverseWords {

    public static void main(String[] args) {
        String str = "My name is Samridhi Mehra";
        String a[]=str.split(" ");
        String b[] =new String[a.length];
        int j=0;
        for(int i=a.length-1;i>=0;i--){
            b[j]=a[i];
            j++;
        }
        System.out.println(Arrays.toString(b));
    }

}
