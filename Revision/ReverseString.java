package Revision;

public class ReverseString {
    public static void main(String[] args) {
        String str = "Chinmay";
        String rev = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            rev = rev + str.charAt(i);
        }
        System.out.println(rev);
    
        if (str.equals(rev)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }

        StringBuilder sb = new StringBuilder(str);
        sb.reverse();
        System.out.println(sb);

        
    }
}
