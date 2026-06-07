package Numbers;

import java.util.Scanner;

public class DigitSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int sum = 0;

        while(num != 0) {
            int i = num % 10;
            sum = sum + i;
            num /= 10;
        }

        System.out.println(sum);
        sc.close();
    }
}
