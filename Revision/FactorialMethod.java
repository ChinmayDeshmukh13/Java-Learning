package Revision;

public class FactorialMethod {
    public static void main(String[] args) {
        System.out.println(facto(5));
    }

    public static int facto(int num) {
        int fact = 1;
        for(int i = 1; i <= num; i++) {
            fact = fact * i;
        }
        return fact;
    }
}
