package Revision;

public class DigitSum {
    public static void main(String[] args) {
        int num = 12345;
        int sum = 0;
        while (num != 0) {
            int digit = num % 10;
            sum += digit;
            num /=10;
        }
        System.out.println("Sum of digits: " + sum);
    }
}
