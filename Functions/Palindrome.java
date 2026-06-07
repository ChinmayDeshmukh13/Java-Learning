public class Palindrome {
    public static boolean isPalindrome1(int n) {
        int originalNum = n;
        int revNum = 0;

        while(n != 0) {
            int LastDigit = n % 10;
            revNum = revNum * 10 + LastDigit;
            n = n /10;
        }
        return originalNum == revNum;
    }
    public static void main(String[] args) {
        System.err.println(isPalindrome1(121221));   
    }
    
}
