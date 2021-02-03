package practice.jan24;

import java.util.Arrays;

public class Vowel {

    public static void main(String[] args) {
        String name = "Samridhi";
        char ch[]={'a','e','i','o','u'};
        char n[]=name.toCharArray();
        for(int i=0;i<n.length;i++){
            for(int j=0;j<ch.length;j++){
                if(n[i]==ch[j]){
                    n[i]='#';
                }
            }
        }
        System.out.println(Arrays.toString(n));


    }

}
