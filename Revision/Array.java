package Revision;

public class Array {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        printArray(arr);
        System.out.println("Sum of array: " + arraySum(arr));
        System.out.println("Maximum value in array: " + findMax(arr));
        System.out.println("Minimum value in array: " + findMin(arr));
        int target = 3;
        System.out.println("Linear search for " + target + ": " + linearSearch(arr, target));
        System.out.println("Reversed array:");
        reverseArray(arr);
        System.out.println("Average of array: " + average(arr));
        countEvenOdd(arr);

    }

    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static int arraySum(int[] arr) {
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        return sum; 
    }

    public static int findMax(int[] arr) {
        int max = arr[0];
        for(int num : arr) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }

    public static int findMin(int[] arr) {
        int min = arr[0];
        for(int num : arr) {
            if (num < min) {
                min = num;
            }
        }
        return min;
    }

    public static int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return arr[i];
            }
        }
        return -1;
    }

    public static void reverseArray(int[] arr) {
        int left = 0;
        int right = arr.length -1;
        while(left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--; 
        }
        printArray(arr);
    }

    public static double average(int[] arr) {
        int sum = arraySum(arr);
        return (double) sum / arr.length;
    }

    public static void countEvenOdd(int[] arr) {
        int evenCount = 0;
        int oddCount = 0;
        for (int i : arr) {
            if (i % 2 == 0) {
                evenCount++;
            }
            else {
                oddCount++;
            }
        }
        System.out.println("Even Count : " + evenCount);
        System.out.println("Odd Count : " + oddCount);
    }
}