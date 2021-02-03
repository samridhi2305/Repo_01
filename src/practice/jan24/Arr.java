package practice.jan24;
//2 3 6 8
import java.util.Arrays;
//0 3
public class Arr {

    public static void main(String[] args) {
        int arr[]={0,3};
        Arrays.sort(arr);
        int count=0;
        for(int i=0;i<arr.length-1;i++) {
            int diff=arr[i+1]-arr[i];
            System.out.println(diff);
            if(diff!=1){
                count=count+diff-1;
            }
        }
        System.out.println(count);
    }
}
