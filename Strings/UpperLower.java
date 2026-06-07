package Strings;
import java.util.Scanner;
public class UpperLower {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s  = sc.nextLine();
        String newString = "";
        char ch[] = s.toCharArray();

        for(int i = 0;i<s.length(); i++) {
            if(ch[i] >= 65 && ch[i] <= 90) {
                int c = (int) ch[i]+32;
                newString = newString+(char) c;
            }
            else if(ch[i] >= 97 && ch[i] <= 122) {
                int c = (int) ch[i]-32;
                newString = newString + (char) c;
            }
            else {
                newString = newString + ch[i];
            }
        }
        System.out.println(newString);
    }
}
