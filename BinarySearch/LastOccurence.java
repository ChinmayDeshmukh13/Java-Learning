package BinarySearch;

public class LastOccurence {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,4,5,6,7,7,8};
        int target = 4;
        int result = occurence(arr, target);
        if (result == -1) {
            System.out.println("Element not found in the array.");
        } else {
            System.out.println("Element found at index: " + result);
        }
    }
    public static int occurence(int[] arr, int target) {
        int left = 0;
        int right = arr.length-1;
        int result = -1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == target) {
                result = mid;
                left = mid + 1;
            }
            else if (target > arr[mid]) {
                left = mid + 1;
            }
            else {
                right = mid - 1;
            }
        }
        return result;
    }
}