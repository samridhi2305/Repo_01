package practice.jan21;
//0 1 2 3 5 8 13
public class Fibonacci {

    public static void main(String[] args) {
        int i = 0;
        int j = 1;
        System.out.print(i+" "+j+" ");
        int val=1;
        while (val<10){
            int k = i + j;
            System.out.print(k+" ");
            i=j;
            j=k;
            val++;

        }
    }

}
