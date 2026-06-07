package SlidingWindow;
import java.util.HashSet;

public class LongestSubstringWithoutRepeatingCharacters {
    public static void main(String[] args) {
        String s = "abcabcbb";
        System.out.println(lengthOfLongestSubstring(s));
    }
    public static int lengthOfLongestSubstring(String s) {
        int maxlength = 0;
        HashSet<Character> set = new HashSet<>();
        char[] ch = s.toCharArray();
        int left = 0;
        
        for (int i = 0; i < ch.length; i++) {
            while (set.contains(ch[i])) {
                set.remove(ch[left]);
                left++;
            }
            set.add(ch[i]);
            maxlength = Math.max(maxlength, i - left + 1);
        }
        return maxlength;
    }
}