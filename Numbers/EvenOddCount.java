package Numbers;

import java.util.Scanner;

public class EvenOddCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int evenCount = 0;
        int oddCount = 0;
        int evenSum = 0;
        int oddSum = 0;
        while(num!=0) {
            int digit = num%10;
            if(digit%2 == 0) {
                evenCount++;
                evenSum += digit;
            }
            else{
                oddCount++;
                oddSum += digit;
            }
            num /=10;
        }

        System.out.println("Even Count : " + evenCount + " Even Sum : " + evenSum);
        System.out.println("Odd Count : " + oddCount + " Odd Sum : " + oddSum);
        sc.close();
    }
}
