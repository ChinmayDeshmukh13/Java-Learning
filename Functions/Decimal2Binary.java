public class Decimal2Binary {
    
    public static void Dec2Bin(int n) {
        int mynum = n;
        int pow = 0;
        int binNUm = 0;
         while(n > 0) {
            int rem = n % 2;

            binNUm = binNUm + (int)(rem * Math.pow(10, pow));

            pow++;
            n = n / 2;

         }
         System.out.println("Binary form of " + mynum + " is "+ binNUm);
    }   
    public static void main(String[] args) {
        Dec2Bin(7);
    }
    
}
