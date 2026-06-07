package HashMap;

import java.util.HashSet;

public class LongestConsequtiveSequence {
    public static void main(String[] args) {
        int[] nums = {100, 4, 200, 1, 3, 2, 101, 102, 103, 104};
        int longestStreak = longestConsecutive(nums);
        System.out.println("Longest Consecutive Sequence Length: " + longestStreak);
    }

    public static int longestConsecutive(int[] nums){
        HashSet<Integer> set = new HashSet<>();
        for (int num : nums) { 
            set.add(num);
        }
        int longest = 0;
        for (int num : set) {
            if (!set.contains(num - 1)) {
                int currNum = num;
                int length = 1;

                while (set.contains(currNum + 1)) {
                    currNum += 1;
                    length += 1;
                }
                longest = Math.max(longest, length);
            }
        }
        return longest;
    }
}
