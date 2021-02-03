package practice.jan16;

public class PalindromeNumber {

    public static void main(String[] args) {
        int number=123;
        int newNum=0;
        int rem=0;
        while(number>0){
            rem = number%10;
            newNum=newNum*10+rem;
            number=number/10;
        }
        System.out.println(newNum);
        if(number==newNum){
            System.out.println("Palindrome");
        }

        else{
            System.out.println("Not Palindrome");
        }
    }

}
