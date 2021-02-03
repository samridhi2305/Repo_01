package practice.jan16;

public class ReverseArray2 {

    public static void main(String[] args) {
        int a[] = {10,20,30,25,15,12,40};
        int b[] = new int[a.length];
        int j = 0;
        for(int i=a.length-1;i>=0;i--){
            b[j] = a[i];
            j++;
        }
        for(int k=0;k<b.length;k++){
            System.out.println(b[k]);
        }
    }

}
