package practice.jan17;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Lambda {

    public static void main(String[] args) {
        //List<Integer> array1 = Arrays.asList(1,2,3,4,5,2);
        List<Integer> array1 = Arrays.asList(10,15,25,35);
        array1.forEach(i -> {
            int c = i*10;
            System.out.println(c);
        });

        List<Integer> array2 = array1.stream().filter(i -> i%2 ==0).collect(Collectors.toList());

    }

}
