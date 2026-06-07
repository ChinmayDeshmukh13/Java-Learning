public class flyodsTriangle {
    
    public static void flyods_triangle(int n) {
        int sum = 0;
        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= i; j++) {
                sum = sum + 1;
                System.out.print(sum+ " ");
            }
            System.out.println();
        }
    }
    
    public static void main(String[] args) {
        flyods_triangle(5);
    }
    
}
