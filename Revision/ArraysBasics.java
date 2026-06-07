package Revision;

public class ArraysBasics {
    public static void main(String[] args) {
        int[] arr = {1,5,8,0,-6,4,0,-2,7,3,0};
        System.out.println("Second Largest Element is : " + secondLargest(arr));
        if (isSorted(arr)) {
            System.out.println("Array is Sorted");
        }
        else {
            System.out.println("Array is not sorted");
        }

        System.out.println("Modified array after moving zeros : ");
        moveZeros(arr);
        // Array to be rotated by
        int k = 4;
        System.out.println("Rotated Array : ");
        rotateArray(arr, k);
    }

    public static int secondLargest(int [] arr) {
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] > largest) {
                secondLargest = largest;
                largest = arr[i];
            }
            else if (arr[i] != largest && arr[i] > secondLargest) {
                secondLargest = arr[i];
            }
        }
        return secondLargest;
    }

    public static boolean isSorted(int[] arr) {
        boolean isSorted = true;
        for(int i = 0; i < arr.length-1; i++) {
            if(arr[i] > arr[i+1]) {
                isSorted = false;
            }

        }
        return isSorted;
    }

    public static void moveZeros(int arr[]) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                int temp = arr[i];
                arr[i] = arr[count];
                arr[count] = temp;
                count++;
            }
        }
        for (int i : arr) {
            System.out.print(i + " ");
        }        
        System.out.println();
    }

    public static void rotateArray(int[] arr, int k) {

        for (int j = 0; j < k; j++) {
            for (int i= 0; i < arr.length; i++) {
                int temp = arr[i];
                arr[i] = arr[arr.length-1];
                arr[arr.length-1] = temp;
            }
        }
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
