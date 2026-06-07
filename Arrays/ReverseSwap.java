import java.util.Arrays;

public class ReverseSwap {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        reve(arr);
     }

    public static void reve(int[] arr) {
        int start = 0;
        int end = arr.length-1;

        for(int i = start; end>start; i++) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        System.out.println(Arrays.toString(arr));
        }
    
}
