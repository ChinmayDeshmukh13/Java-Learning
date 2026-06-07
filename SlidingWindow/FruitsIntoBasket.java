package SlidingWindow;

import java.util.HashSet;

public class FruitsIntoBasket {
    public static void main(String[] args) {
        int[] fruits = {1,2,3,2,2};
        System.out.println(maxFruits(fruits));
    }
    public static int maxFruits(int[] fruits) {
        int max = 0;
        HashSet<Integer> set = new HashSet<>();
        int left = 0;
        for (int i = 0; i < fruits.length; i++) {
            set.add(fruits[i]);

            while(set.size() > 2) {
                set.remove(left);
                left++;
            }
            System.out.println(set);
            max = Math.max(max, i - left +1);
            System.out.println(max);
        }
        return max;
    }
}
