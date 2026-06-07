package BinarySearch;

public class MinimuminRotatedSortedArray {
    public static void main(String[] args) {
        int nums[] = {4,5,0,1,2};
        int result = findMin(nums);
        System.out.println("Minimum element in the rotated sorted array is: " + result);
    }

    public static int findMin(int[] nums) {
        int left = 0;
        int right = nums.length-1;
        int max = nums[0];

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if(nums[left] <= nums[mid]) {
                mid = mid +1;
            }
            else {
                right = mid;
            }
        }
        return nums[left];
    }
}
