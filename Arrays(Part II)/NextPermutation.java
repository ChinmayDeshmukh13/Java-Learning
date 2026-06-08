public class NextPermutation {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        nextPermutation(nums);
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }

    public static void nextPermutation(int[] nums) {
        int n = nums.length;
        int i = n - 2;

        // Step 1: Find the largest index i such that nums[i] < nums[i + 1]. 
        // If no such index exists, the permutation is the last permutation.
        while (i >= 0 && nums[i] >= nums[i + 1]) {
            i--;
        }

        if (i >= 0) { // If such an index exists
            int j = n - 1;

            // Step 2: Find the largest index j greater than i such that nums[i] < nums[j].
            while (nums[j] <= nums[i]) {
                j--;
            }

            // Step 3: Swap the value of nums[i] with that of nums[j].
            swap(nums, i, j);
        }

        // Step 4: Reverse the sequence from nums[i + 1] up to and including the final element nums[n - 1].
        reverse(nums, i + 1, n - 1);
    }

    private static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    private static void reverse(int[] nums, int start, int end) {
        while (start < end) {
            swap(nums, start, end);
            start++;
            end--;
        }
    }
}
