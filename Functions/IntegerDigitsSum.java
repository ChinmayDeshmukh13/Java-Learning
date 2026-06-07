public class IntegerDigitsSum {
    
    public static int calsum(int n) {
        int num = n;
        int sum = 0;
        while(n > 0) {
            int lastDigit = n % 10;
            sum = sum + lastDigit;
            n = n / 10;
        }
        return sum;
    }
    public static void main(String[] args) {
        System.out.println(calsum(235));
    }   
}
