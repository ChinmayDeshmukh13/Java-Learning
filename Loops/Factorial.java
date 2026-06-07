import java.util.*;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");

        int num = sc.nextInt();
        int fact = 1;
        if(num == 0) {
            System.out.println("Factorial : 1");
        }
        else {
            for(int i = num; num >= 1; num--) {
                fact = fact * num;
            }   
        System.out.println("Factorial : " + fact);
        }
    }
    
}
