package Strings;

import java.util.Scanner;

public class Digitsum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s  = sc.nextLine();
        s.toLowerCase();
        s = s.replaceAll("[^0-9]", "");

        int sum = 0;
        int digit = Integer.parseInt(s);
        System.out.println(digit);
        while(digit>0) {
            int last = digit % 10;
            sum = sum+last;
            digit = digit / 10;
        }
        System.out.println("Sum = " + sum);
        
    }
}
