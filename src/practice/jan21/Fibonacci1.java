package practice.jan21;

public class Fibonacci1 {

    public static void main(String[] args) {
        int i = 0;
        int j = 1;
        int k = i + j;
        System.out.println(k);
        int val=1;
        while (val<10){
            int m=k+j;
            System.out.println(m);
            j=k;
            k=m;
            val++;

        }
    }

}
