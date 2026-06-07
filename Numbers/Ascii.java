package Numbers;

import java.util.Scanner;

public class Ascii {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        char Asc = (char)(num+'0');

        System.out.println((int)Asc);
    }
}
