package Numbers;

import java.util.Scanner;

public class AramstrongNumber {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int num = sc.nextInt();
        int n = num;
        int original = num;
        int len = 0;
        while(n != 0) {
            n/=10;
            len++;
        }
        System.out.println(len);
        int armStrong = 0;
        while(num != 0) {
            int lastd = num % 10;
            armStrong += (int)Math.pow(lastd, len);
            num/=10;
        }

        if(original == armStrong) {
            System.out.println("Armstrong Number");
        }
        else {
            System.out.println("Not Armstrong");
        }
        sc.close();
    }
}
