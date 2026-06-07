package Strings;

import java.util.Scanner;

public class DigitCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        int DigitC = 0;
        int LetterC = 0;
        int SymbolC = 0;

        for(int i = 0; i<s.length(); i++) {
            char c = s.charAt(i);
            if(Character.isLetter(c)) {
                LetterC++;
            }
            else if(Character.isDigit(c)) {
                DigitC++;
            }
            else {
                SymbolC++;
            }
        }
        
        System.out.println("Digits in String :" + DigitC);
        System.out.println("Letters in String :" + LetterC);
        System.out.println("Symbols in String :" + SymbolC);

    }
    
}
