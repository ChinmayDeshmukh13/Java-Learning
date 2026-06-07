package HashMap;

import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;

public class Frequency {
    public static void main(String[] args) {
        int arr[] = {1,2,5,6,7,2,4,8,9,3,4,6,7,5};
        HashMap<Integer, Integer> map = new LinkedHashMap<>();
        
        for(int i = 0; i<arr.length; i++) {
            if(map.containsKey(arr[i])) {
                map.put(arr[i], map.get(arr[i])+1);
            }
            else{
                map.put(arr[i], 1);
            }
        }
        for(int key : map.keySet()) {
            System.out.println(key + "->" + map.get(key));
        }

        int max = Collections.max(map.values());
        System.out.println("Max Frequency : " + max);
        int freq = 0;
        for(int value : map.values()) {
            if(value == max) {
                freq += value;
            }
        }

        System.out.println("Frequency of Max Frequency : " + freq);

    }
}
