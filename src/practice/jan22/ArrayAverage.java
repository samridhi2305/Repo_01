package practice.jan22;

public class ArrayAverage {

    public static void main(String[] args) {
        int arr[]= {1,2,3,5,8,5,4};
        int len=arr.length;
        int avg;
        int sum=0;
        for(int a:arr){
            sum=sum+a;

        }
        avg=sum/len;
        System.out.println(avg);

    }

}
