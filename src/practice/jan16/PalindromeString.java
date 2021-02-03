package practice.jan16;

public class PalindromeString {

    public static void main(String[] args) {
        String str = "samrrmas";
        String reverse = "";
        for(int i=str.length()-1;i>=0;i--){
            reverse = reverse+str.charAt(i);
        }
        System.out.print("reverse is " + reverse + "\n");

        if(str.equals(reverse)){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not palindrome");
        }
    }

}
