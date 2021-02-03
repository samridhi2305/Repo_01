package practice.jan19;

public class CountOfNumber {

    public static void main(String[] args) {
        int number = 5;
        int count = 0;
        int array1[] = {5,7,6,5,5,3,4,2,9};
        for(int i=0;i<array1.length;i++){
            if(array1[i]==number){
                count++;
            }
        }
        System.out.println("Number occurs " + count+" times");
    }

}
