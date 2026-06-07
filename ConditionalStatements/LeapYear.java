import java.util.Scanner;

public class LeapYear {
    public static void main(String args[]) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter Year : ");
            int n = sc.nextInt();

            if(n % 4 == 0) {
                System.out.println("It's a Leap Year");
            }
            else if(n % 100 == 0) {
                System.out.println("It's a Leap Year");
            }
            else {
                System.out.println("It's not a Leap Year");
            }


    }
}
