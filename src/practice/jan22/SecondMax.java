package practice.jan22;

public class SecondMax {

    public static void main(String[] args) {
            int array1[] = {1,2,5,34,9,7,6};
            int temp=0;
            for(int i=0;i<array1.length;i++) {
                for(int j=i+1;j<array1.length;j++){
                    if(array1[i]<array1[j]){
                        temp=array1[i];
                        array1[i]=array1[j];
                        array1[j]=temp;
                    }

                }
            }
            System.out.println(array1[1]);
        }
    }

