import java.util.Arrays;
import java.util.Collections;
public class InbuiltSorting {
    public static void main(String[] args) {
        int arr[] = {2, 4, 1, 3, 5, 9, 7, 8, 6};
        Arrays.sort(arr);
        //Time Complexity O(n logn)
        for(int i=0; i<arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        int arr1[] = {2, 4, 1, 3, 5, 9, 7, 8, 6};

        Arrays.sort(arr1, 0, 4);
        for(int i=0; i<arr1.length; i++) {
            System.out.print(arr1[i]+" ");
        }

        System.out.println();
        Integer arr2[] = {2, 4, 1, 3, 5, 9, 7, 8, 6};
        Arrays.sort(arr2, Collections.reverseOrder());
        for(int i=0; i<arr1.length; i++) {
            System.out.print(arr2[i]+" ");
        }
    }
}
