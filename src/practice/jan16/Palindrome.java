package practice.jan16;
//Palindrome - If number is same as its reverse
public class Palindrome {

    public static void main(String[] args) {
        Integer number = new Integer(1233211);
        String str = Integer.toString(number);
        System.out.print("string " + str +"\n");
        char ch[] = str.toCharArray();
        char newChar[] = new char[ch.length];
        for(int i=ch.length-1;i>=0;i--){
            System.out.println(newChar[i]);
        }
        if(newChar==ch){
            System.out.println("equal string");
        }
        else{
            System.out.println("string not equal");
        }





//        String strings = new String("abc");
//        String[] ary = strings.split("");

    }

}
