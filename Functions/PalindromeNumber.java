public class PalindromeNumber {
    public static void main(String[] args) {
        int n = 123321;
        int original = n;
        int sum = Integer.MIN_VALUE;
        while(n >0) {
            int last_digit = n % 10;
            sum = sum*10 + last_digit;
            n = n/10;
        }
        System.out.println(sum);

        if(sum == original) {
            System.out.println("Palindrome");
        }
        else {
            System.out.println("Not Palindrome");
        }
    }
}
