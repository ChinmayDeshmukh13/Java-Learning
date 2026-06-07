import java.util.*;

public class calc {
    public static void main(String [] args) {
        int input; 
        do {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter first integer : ");
            int a = sc.nextInt();
            System.out.print("Enter second integer : ");
            int b = sc.nextInt();

            System.out.println(" What do you want to perform : \n1. Addition       : + \n2. Subtraction    : - \n3. Division       : /\n4. Multiplication : *\n-------------------------------------------------\nChoose your preffered option : ");
            char operator = sc.next().charAt(0);

            switch(operator) {
                case '+' : System.out.println(a*b);
                            break;
                case '-' : System.out.println(a-b);
                            break;
                case '/' : System.out.println(a/b);
                            break;
                case '*' : System.out.println(a*b);
                            break;
            }
            System.out.print("Want to continue : Yes(1) or No(0) : ");
            input = sc.nextInt();
        }
        while(input == 1);
    }
    
}
