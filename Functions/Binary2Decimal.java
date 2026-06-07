public class Binary2Decimal {
    
    public static void Bin2Dec(int binNum) {
        int myNum = binNum;
        int pow = 0;
        int dec = 0;
        
        while(binNum > 0) {
            int LastDigit = binNum % 10;
            dec = dec + (LastDigit * (int)Math.pow(2, pow));

            pow++;

            binNum = binNum /10;
        }
        System.out.println("Decimal of "+ myNum + " is " + dec);
    }
    public static void main(String[] args) {
        Bin2Dec(1010);   
    }    
}
