package SlidingWindow;

public class MaximumVowelsInSubstring {
    public static void main(String[] args) {
        String s = "abciiidef";
        int k = 3;
        System.out.println(maxVowels(s, k));
    }

    public static int maxVowels(String s, int k) {
        int count = 0;
        char[] ch = s.toCharArray();

        for (int i = 0; i < k; i++) {
            if(isVowel(ch[i])){
                count++;
            }
        }
        int maxCount = count;
        for (int i = k; i < ch.length; i++) {
            if(isVowel(ch[i])){
                count++;
            }
            if(isVowel(ch[i-k])){
                count--;
            }
            maxCount = Math.max(maxCount, count);
        }
        return maxCount;
    }

    public static boolean isVowel(char c) {
        if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U') {
            return true;
        }
        return false;
    }
}
