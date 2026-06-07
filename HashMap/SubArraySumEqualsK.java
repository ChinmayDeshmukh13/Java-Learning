package HashMap;
import java.util.HashMap;
public class SubArraySumEqualsK {
    public static void main(String[] args) {
        int[] arr = {4, 2, -3, 1, 6, -1, 2, 3, 4, 5};
        int k = 7;
        System.out.println(subarraySum(arr, k));
    }
    public static int subarraySum(int[] arr, int k) {
        if (arr == null || arr.length == 0) return 0;
        int count = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, 1); // Base case: there's one way to have a sum of 0 (by taking no elements)
        int currsum = 0;
        for (int i = 0; i < arr.length; i++) {
            currsum += arr[i];
            System.out.println(currsum);
            if(map.containsKey(currsum-k)) {
                count += map.get(currsum-k);
            }
            map.put(currsum, map.getOrDefault(currsum, 0) + 1);
        }
        return count;
    }
}
