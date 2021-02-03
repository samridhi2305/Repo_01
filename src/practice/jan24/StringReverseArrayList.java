package practice.jan24;

import java.util.Arrays;
import java.util.List;

public class StringReverseArrayList {

    public static void main(String[] args) {
        String name="My name is Samridhi Mehra";
        List<String> arr = Arrays.asList(name.split(" "));
        for(String value:arr){
            StringBuffer br=new StringBuffer(value);
            System.out.print(br.reverse()+"\t");
        }
    }

}
