public class SubarraySumPrefix {

    public static void SubarraySum(int numbers[]) {
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;

        int prefix[] = new int[numbers.length];
        for(int i = 0; i < numbers.length; i++) {
            prefix[i] = i == 0 ? numbers[i] : prefix[i - 1] + numbers[i];
            System.out.println(prefix[i]);
        }

        for(int i = 0; i < numbers.length; i++) {
            int start = i;
            for(int j = 0; j < numbers.length; j++) {
                int end = j;
                currSum = start == 0 ? prefix[end] : prefix[end] - prefix[start-1];

                if(maxSum < currSum) {
                    maxSum = currSum;
                }
            }
        }
        System.out.println("Max Sum = " + maxSum);
    }

    public static void main(String[] args) {
        int numbers[] = {1, -2, 6, -1, 3};
        SubarraySum(numbers);
    }
    
}
