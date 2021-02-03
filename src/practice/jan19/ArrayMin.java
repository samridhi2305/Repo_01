package practice.jan19;

public class ArrayMin {

    public static void main(String[] args) {
        int array1[] = {2,3,4,1,10,9,8,7,5};
        int num = array1[0];
        for(int i=1;i<array1.length;i++){
            if(array1[i]<num){
                num=array1[i];

            }
        }
        System.out.println("Minimum Number is "+num);
    }

}
