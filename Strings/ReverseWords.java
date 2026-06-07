package Strings;

import java.util.Scanner;

public class ReverseWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        
        String word[] = s.split(" ");
        int start = 0;
        int end = word.length-1;

        while(start<end) {
            String temp = word[start];
            word[start] = word[end];
            word[end] = temp;
            start++;
            end--;
        }

        for(String i : word) {
            System.out.print(i+" ");
        }
    }
}
