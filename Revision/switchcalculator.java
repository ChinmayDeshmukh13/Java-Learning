package Revision;

import java.util.Scanner;  
public class switchcalculator {
    public static void main(String[] args) {
        int a = 10;
        int b = 5;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an operator (+, -, *, /):");
        char operator = sc.nextLine().charAt(0);
        switch (operator) {
            case '+':
                System.out.println("The sum is: " + (a + b));
                break;
            case '-':
                System.out.println("The difference is: " + (a - b));
                break;
            case '*':
                System.out.println("The product is: " + (a * b));
                break;
            case '/':
                if (b != 0) {
                    System.out.println("The quotient is: " + (a / b));
                } else {
                    System.out.println("Cannot divide by zero.");
                }
                break;
            default:
                System.out.println("Invalid operator.");
        }
    }
}
