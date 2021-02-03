package practice.jan22;


import java.util.Arrays;
import java.util.List;


public class Stream {

    public static void main(String[] args) {
        //List<String> arr = Arrays.asList("abc", "", "bc", "efg", "abcd","", "jkl");

        String arr[]= {"abc", "", "bc", "efg", "abcd","", "jkl"};
        int count=0;
        for(String str:arr){
            if(str.isEmpty()){
                count=count+1;
            }
        }

        //int count = (int) arr.stream().filter(string -> string.isEmpty()).count();

        System.out.println(count);
    }

}
