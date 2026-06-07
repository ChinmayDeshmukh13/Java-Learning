public class binomial {
    public static int factorial(int n) {
        int f = 1;
        for(int i = 1; i <= n; i++) {
            f = i * f;
        }
        return f;
    }
    public static int binoCoeff(int n, int r) {
        int fact_n = factorial(n);
        int fact_r = factorial(r);
        int fact_nmr = factorial(n-r);

        int binCoeff = fact_n/(fact_r*fact_nmr);
        System.out.println("Binomial Coefficient = "+ binCoeff);
        return binCoeff;
    }
    public static void main(String[] args) {
        binoCoeff(5, 2);
    }
}
