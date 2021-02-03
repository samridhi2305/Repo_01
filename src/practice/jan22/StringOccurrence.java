package practice.jan22;

public class StringOccurrence {

    public static void main(String[] args) {
        String str = "Samridhi";
        int count=0;
        for(int i =0;i<str.length();i++){
            if(str.charAt(i)=='i'){
                count++;
            }
        }
        System.out.println(count);
    }

}
