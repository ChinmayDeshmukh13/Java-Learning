package TwoPointers;

public class TwoSum2 {
    public static void main(String[] args) {
        int[] numbers = {2, 7, 11, 15};
        int target = 9;
        int[] result = twoSum(numbers, target);
        System.out.println("Indices: " + result[0] + ", " + result[1]);
    }
    
    public static int[] twoSum(int[] numbers, int target) {

        int[] arr = new int[2];
        int left = 0;
        int right = numbers.length - 1;

        while (left < right) {
            int sum = numbers[left] + numbers[right];
            if(sum == target) {
                arr[0] = left + 1;
                arr[1] = right + 1;
                break;
            }
            else if (sum < target) {
                left++;
            }
            else {
                right--;
            }
        }
        return arr;
    }
}