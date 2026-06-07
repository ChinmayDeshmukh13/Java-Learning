import java.util.Scanner;

public class temperature {
    public static void main(String args[]) {
            Scanner sc = new Scanner(System.in);
            double temp = sc.nextDouble();

            if(temp > 100.00) {
                System.out.println("You have fever");
            }
            else {
                System.out.println("You don't have fever");
            }
    }
}
