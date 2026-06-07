public class Rotatedpyramid {
    
    public static void inverted_pyramid(int totrows) {
        for(int i = 1; i <= totrows; i++) {
            //spaces
            for(int j = 1; j <= totrows - i; j++) {
                System.out.print(" ");

            }
            //stars 
            for(int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        } 
    }
    public static void main(String[] args) {
        inverted_pyramid(25);   
    }
    
}
