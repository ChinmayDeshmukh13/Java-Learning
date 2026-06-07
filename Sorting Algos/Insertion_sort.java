import java.util.Arrays;
public class Insertion_sort {

    public static void InsertionSort(int arr[]) {
        for(int i = 1; i < arr.length; i++) {
            for (int j = i; j > 0; j--) {
                if(arr[j] < arr[j-1]) {
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }
                else {
                    break;
                }
            }
        }
    }

    
    public static void main(String[] args) {
        int arrr[] = {5, 4, 1, 3, 2};
        InsertionSort(arrr);
        System.out.println(Arrays.toString(arrr));
    }
}
