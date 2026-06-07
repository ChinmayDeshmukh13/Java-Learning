package HashMap;

import java.util.HashMap;

public class Itinerary {
    public static void main(String[] args) {
        HashMap<String, String> tickets = new HashMap<>();
        tickets.put("Chennai", "Banglore");
        tickets.put("Mumbai", "Delhi");
        tickets.put("Goa", "Chennai");
        tickets.put("Delhi", "Goa");

        String start = getStart(tickets);

        while(tickets.containsKey(start)) {
            System.out.println(start);
            start = tickets.get(start);
        }
        System.out.println(start);
    }

    public static String getStart(HashMap<String, String> tickets) {
        HashMap<String, String> revSet = new HashMap<>();
        for (String key : tickets.keySet()) {
            revSet.put(tickets.get(key), key);
        }

        for (String key : tickets.keySet()) {
            if (!revSet.containsKey(key)) {
                return key;
            }            
        }
        return null;
    }

    
}
