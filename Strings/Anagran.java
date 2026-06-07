package Strings;
import java.util.Arrays;
import java.util.Scanner;
public class Anagran {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String b = sc.nextLine();
        if(Anagram(a, b) == true) {
            System.out.println("Anagram");
        }
        else{
            System.out.println("Not Anagram");
        }    
    }
    public static boolean Anagram(String a, String b) {
        a= a.replaceAll(" ", "");
        b = b.replaceAll(" ", "");

        int lenA = a.length();
        int lenB = b.length();
        if(lenA != lenB) {
            return false;
        }
        else{
            char cha[] = a.toCharArray();
            char chb[] = b.toCharArray();
            Arrays.sort(cha);
            Arrays.sort(chb);

            String m = String.valueOf(cha);
            String n = String.valueOf(chb);
                              
            if(m.equals(n)) {
                return true;
            }
            else {
                return false;
            }
        }
    }  
}