package practice;

public class PrimeNumber7 {

    public static void main(String[] args) {
        int number=7;
        for(int i=2;i<=number;i++){
            if(number%i==0){
                System.out.println("Number " +number + " is not a prime number");
                break;
            }
        }
    }

}
