package practice.jan22;

public class StringReverse {

    public static void main(String[] args) {
        String name = "Samridhi Mehra";
        String reverseString="";
        for(int i=name.length()-1;i>=0;i--){
            reverseString=reverseString+name.charAt(i);
        }
        System.out.println(reverseString);
    }
}
