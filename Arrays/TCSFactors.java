import java.util.ArrayList;
import java.util.Scanner;

public class TCSFactors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        ArrayList<Integer> factors = new ArrayList<>();

        while(n%2==0) {
            n/=2;
            factors.add(2);
        }
        while (n%3==0) {
            n/=3;
            factors.add(3);
        }

        while(n!=1){
            if(n%5==0){
                n/=5;
                factors.add(5);
            }
            else {
                break;
            }
        }
        for(int i : factors) {
            System.out.print(i+" ");
        }
    }
}
