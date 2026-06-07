package BinarySearch;

public class SplitArrayLargestSum {
    public static void main(String[] args) {
        int[] nums = {7, 2, 5, 10, 8};
        int k = 2;
        System.out.println(splitArray(nums, k));
    }
    public static int splitArray(int[] nums, int k) {
        int low = 0;
        int high = 0;

        for (int i : nums) {
            low = Math.max(low, i);
            high += i;
        }
        int ans = high;
        while(low <= high) {
            int mid = low + (high - low) / 2;

            if(canSplit(nums, k, mid)) {
                ans = mid;
                high = mid - 1;
            }
            else {
                low = mid + 1;
            }
        }
        return ans;
    }

    public static boolean canSplit(int[] nums, int k, int maxSum) {
        int subarrayCount = 1;
        int currSum = 0;

        for (int i : nums) {
            if(currSum + i > maxSum) {
                subarrayCount++;
                currSum = i;

                if (subarrayCount > k) {
                    return false;
                }
            }
            else {
                currSum += i;
            }
        }
        return true;
    }

}
