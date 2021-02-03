package practice.jan22;

public class Factorial {

    public static void main(String[] args) {
        int num=5;
        for(int i=num-1;i>0;i--){
            num=num*i;
        }
        System.out.println(num);
    }

}
