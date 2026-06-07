package Strings;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        s = s.toLowerCase();

        char ch[] = s.toCharArray();
        int start = 0;
        int end = s.length()-1;
        while(start<end) {
            if(ch[start] == ch[end]) {
                break;
            }
            else {
                System.out.println("Not Palindrome");
            }
        }
        System.out.println("Palindrome");
        
    }
}
