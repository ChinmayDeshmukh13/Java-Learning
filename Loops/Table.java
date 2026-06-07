import java.util.*;

public class Table {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Table Digit : ");
        int tab = sc.nextInt();
        System.out.println("Table of "+ tab +" is : ");
        for(int i = 1; i <=10; i++) {
            System.out.println(tab*i);
        }
    }
}
