
import java.util.*;

// Majority Element
public class Mapped {

    public static void main(String[] args) {
        int[] arr = { 2, 1, 3, 1, 4, 2, 5, 3, 4, 2, 6, 4 };

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            if (map.containsKey(arr[i])) {
                int val = map.get(arr[i]);
                map.put(arr[i], val + 1);
            } else {
                map.put(arr[i], 1);
            }
        }
        int maxInMap = Collections.max(map.entrySet(), Map.Entry.comparingByValue()).getKey();
        System.out.println(maxInMap);

    }
}