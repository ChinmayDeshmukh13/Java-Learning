import java.util.*;

public class Product {

    public static int calculateProduct(int a, int b) {
        int prod = a *b;
        return prod;    

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int a = sc.nextInt();
        int b = sc.nextInt();
        int prod = calculateProduct(a, b);
        System.out.println("product = " + prod);

        int prod2 = calculateProduct(10, 15);
        System.out.println(prod2);
    }
    
}
