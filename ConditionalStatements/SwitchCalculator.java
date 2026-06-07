import java.util.*;

public class SwitchCalculator {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number :");
        int a = sc.nextInt();
        System.out.print("Enter second number :");
        int b = sc.nextInt();
        System.out.print("What you want to perform :");
        char operator = sc.next().charAt(0);

        switch(operator) { 
            case '+' : System.out.println(a+b);
                        break;
            case '-' : System.out.println(a-b);
                        break;
            case '*' : System.out.println(a*b);
                        break;
            case '/' : System.out.println(a/b);
                        break;
            default : System.out.println("It is a not a advanced calculator");
        }
    }
}