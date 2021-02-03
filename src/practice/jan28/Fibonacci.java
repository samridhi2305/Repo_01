package practice.jan28;
//0 1 1 2 3 5 8

public class Fibonacci {

    public static void main(String[] args) {
        int i = 0;
        int j = 1;

        System.out.println(i + " " + j);
        for (int z = 0; z < 10; z++) {
            int k = i + j;
            System.out.print(k+" ");
            i=j;
            j=k;

        }

    }

}
