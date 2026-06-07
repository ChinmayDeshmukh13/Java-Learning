import java.util.*;

public class OddEvenSum {
    public static void main(String[] args) {
        System.out.println();
        Scanner sc = new Scanner(System.in);
        
        int evenSum = 0;
        int oddSum = 0;

        System.out.print("Enter the number of digits you want to enter :");
        int count = sc.nextInt();

        for(int i = 0; i < count; i++) {
            int number = sc.nextInt();

            if(number % 2 == 0) {
                evenSum += number;
            }
            else {
                oddSum += number;
            }
        }
        System.out.println("Sum of Even numbers :" + evenSum);
        System.out.println("Sum of Odd numbers :" + oddSum);
    }
    
}
