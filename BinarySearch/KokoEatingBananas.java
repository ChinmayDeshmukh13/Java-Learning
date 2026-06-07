package BinarySearch;

public class KokoEatingBananas {
    public static void main(String[] args) {
        int piles[] = {3, 6, 7, 11};
        int h = 8;
        int result = minEatingSpeed(piles, h);
        System.out.println("Minimum eating speed is: " + result);
        
    }
    public static int minEatingSpeed(int[] piles, int h) {
        int left = 1;
        int right = 0;

        for (int i : piles) {
            right = Math.max(i, right);
        }

        while(left < right) {
            int mid = left + (right - left) / 2;

            if(canEatAll(piles, h, mid)) {
                right = mid -1;
            }
            else {
                left = mid +1;
            }
        }
        return left;
    }
    public static boolean canEatAll(int[] piles, int h, int speed) {
        int hoursSpent = 0;
        for (int pile : piles) {
            hoursSpent += Math.ceil((double) pile / speed);
        }
        return hoursSpent <= h;
    }
}