package practice;

public class CountOfNumber {

    public static void main(String[] args) {

        int number = 4;
        for(int i=1;i<=number;i++){
            System.out.println(number);
        }

        String s=Integer.toString(4);
        System.out.println("length of string is " +s);
        int i=1;
        while(i<=s.length()) {
            System.out.println(s);
            i++;
        }
    }

}
