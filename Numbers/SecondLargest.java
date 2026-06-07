package Numbers;

import java.util.Scanner;

public class SecondLargest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int n = num;
        int largest = -1;
        int secondLargest = -1;
        while (num!=0) {
            int lastd = num%10;
            
            if(lastd > largest) {
                secondLargest = largest;
                largest = lastd;
            }
            else if(lastd > secondLargest && lastd < largest){
                secondLargest = lastd;
            }
            num/=10;
        } 
        System.out.println(secondLargest);
    }
}
