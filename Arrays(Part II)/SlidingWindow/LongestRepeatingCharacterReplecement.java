package SlidingWindow;

public class LongestRepeatingCharacterReplecement {
    public static void main(String[] args) {
        String s = "AABABBA";
        int k = 1;
        System.out.println(characterReplacement(s, k));
    }
    public static int characterReplacement(String s, int k) {
        int maxCount = 0;
        int left = 0;
        int maxLength = 0;
        int[] count = new int[26];

        for(int right = 0; right < s.length(); right++) {
            count[s.charAt(right) - 'A']++;

            maxCount = Math.max(maxCount, count[s.charAt(right) - 'A']);

            while ((right - left + 1) - maxCount > k) {
                count[s.charAt(left) - 'A']--;
                left++;                
            }

            maxLength = Math.max(maxLength, right - left + 1);
        }
        return maxLength;
    }
}
