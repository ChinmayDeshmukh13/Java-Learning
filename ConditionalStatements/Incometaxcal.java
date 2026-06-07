import java.util.*;

public class Incometaxcal {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in); 
        int income = sc.nextInt();
        int tax;

        if(income < 500000) {
            tax = 0;
            System.out.println("Tax : " + tax);
        }
        else if((income >= 500000) && (income < 1000000)) {
            tax = (int) (income * 20)/100;
            System.out.println("Tax : " + tax);
        }
        else {
            tax = (int) (income * 0.30);
            System.out.println("Tax : " + tax);
        }
    }
}

