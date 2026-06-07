public class Subarrayssum {

    public static void SubarraysSum(int numbers[]) {
        int maxSum = Integer.MIN_VALUE;
        int currSum = 0; 
        for(int i = 0; i < numbers.length; i++) {
            int start = i;
            for(int j = i; j < numbers.length; j++) {
                int end = j;
                currSum = 0;
                for(int k = start; k <= end; k++) {
                    System.out.print(numbers[k] + " ");
                    currSum += numbers[k];
                }
                System.out.print("sum = "+ currSum);
                System.out.println();
                if(currSum > maxSum) {
                    maxSum = currSum;
                }
            }
            System.out.println();  
        }
        System.out.println("Max Sum = " + maxSum);
    }
    public static void main(String[] args) {
        int numbers[] = {1,-2,6,-1,3};
        SubarraysSum(numbers);
    }
    
}
