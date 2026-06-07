package TwoPointers;

public class ValidPalindrome {
    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
        if (isPalindrome(s)) {
            System.out.println("String is a Palindrome");
        }
        else {
            System.out.println("String is not a Palindrome");
        }
    }
    public static boolean isPalindrome(String s) {
        boolean isPalindrome = true;
        s = s.toLowerCase();
        s = s.replaceAll("[^a-z0-9]", "" );
        char[] arr = s.toCharArray();
        
        int left = 0;
        int right = arr.length-1;

        while (left < right) {
            if (arr[left] != arr[right]) {
                isPalindrome = false;
                break;
            }
            left++;
            right--;
        }
        
        return isPalindrome;
    }
}
