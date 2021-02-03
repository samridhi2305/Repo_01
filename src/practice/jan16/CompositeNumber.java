package practice.jan16;

public class CompositeNumber {

    public static void main(String[] args) {
        int number = 1;
        boolean value=false;

        if(number==0||number==1){
            System.out.println("composite number");
            value=true;
        }
        for(int i=2;i<number;i++){
            if(number%i==0){
                System.out.println("composite number");
                value =true;
                break;
            }

            }
        if(value==false){
            System.out.println("prime number");
        }

    }

}
