package BinarySearch;

public class MinimumNumberOfDaysToMakeMBouquets {
    public static void main(String[] args) {
        int[] bloomDay = {1, 10, 3, 10, 2};
        int m = 3;
        int k = 1;
        System.out.println(minDays(bloomDay, m, k));
    }

    public static int minDays(int[] bloomDays, int m, int k) {
        if ((m * k) > bloomDays.length) return -1;

        int left = 0;
        int right = 0;

        for (int i : bloomDays) {
            left = Math.min(left, i);
            right = Math.max(i, right);
        }
        int ans = -1;
        while(left <= right) {
            int mid = left + (right - left) / 2;

            if(canMakeBouquet(bloomDays, m, k, mid)) {
                ans = mid;
                right = mid - 1;
            }
            else {
                left = mid+ 1; 
            }
        }
        return ans;
    }

    public static boolean canMakeBouquet(int[] bloomDays, int m, int k, int days) {
        int bouquets = 0;
        int flowers = 0;
        for (int bDay : bloomDays) {
            if (bDay <= days) {
                flowers++;
                if (flowers == k) {
                    bouquets++;
                    flowers = 0;
                }
            } else {
                flowers = 0;
            }
            if (bouquets >= m) {
                return true;
            }
        }
        return bouquets >= m;
    }
}
