
import java.util.Scanner;

public class SecondLargest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[5];

        for(int i = 0; i<arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int largest = -1;
        int secondLargest = -1;

        for(int i = 0; i<arr.length; i++) {
            if(arr[i]>largest) {
                secondLargest = largest;
                largest = arr[i];
            }
            else if(arr[i]!= largest && arr[i]>secondLargest) {
                secondLargest = arr[i];
            }
        }
        System.out.println(secondLargest);
    }
}
