public class Rotate {
    public static void main(String[] args) {
        int nums[] = {1,2,3,4,5,6,7};
        int k = 4;
    }

    public void rotate(int[] nums, int k) {
        k = k % nums.length;

        for(int i = 0; i<k; i++) {
            int start = 0;
            int end = nums.length-1;
            while(start<end) {
                int temp = nums[start];
                nums[start] = nums[end];
                nums[end] = temp;
                start++;
            }
        }

    }
}

