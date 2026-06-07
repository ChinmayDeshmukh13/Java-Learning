package Numbers;

import java.util.Scanner;

public class Magicnumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        if(num%9 == 1) {
            System.out.println("Magic Number");
        }
        else {
            System.out.println("Not magic Number");
        }
    }
}
