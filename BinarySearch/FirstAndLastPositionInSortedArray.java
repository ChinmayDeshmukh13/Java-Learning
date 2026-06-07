package BinarySearch;

public class FirstAndLastPositionInSortedArray {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,4,5,6,7,7,8};
        int target = 4;
        int[] result = searchRange(arr, target);
        if (result[0] == -1) {
            System.out.println("Element not found in the array.");
        } else {
            System.out.println("First occurrence index: " + result[0]);
            System.out.println("Last occurrence index: " + result[1]);
        }
        
    }
    public static int[] searchRange(int[] arr, int target) {
        int[] result = new int[2];
        result[0] = firstOccurrence(arr, target);
        result[1] = lastOccurrence(arr, target);
        return result;
    }
    public static int firstOccurrence(int[] arr, int target) {
        int left = 0;
        int right = arr.length-1;
        int result = -1;
        while(left <= right) {
            int mid = left + (right - left) / 2;
            if(arr[mid] == target) {
                result = mid;
                right = mid - 1;
            }
            else if (arr[mid] < target) {
                left = mid + 1;
            }
            else {
                right = mid - 1;
            }
        }
        return result;
    }
    public static int lastOccurrence(int[] arr, int target) {
        int left = 0;
        int right = arr.length-1;
        int result = -1;
        while(left <= right) {
            int mid = left + (right - left) / 2;
            if(arr[mid] == target) {
                result = mid;
                left = mid + 1;
            }
            else if (arr[mid] < target) {
                left = mid + 1;
            }
            else {
                right = mid - 1;
            }
        }
        return result;
    }
}
