package Revision;

public class swap {
    public static void main(String[] args) {
        int a = 5;
        int b= 10;
        int c;
        System.out.println("Before swapping:");
        System.out.println(a);
        System.out.println(b);

        c = a;
        a = b;
        b = c;
        System.out.println("After swapping:");
        System.out.println(a);
        System.out.println(b);
    }
}