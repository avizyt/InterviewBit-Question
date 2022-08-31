
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

class Dictionary {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();

        int[] arr = { 3, 4, 1, 4, 1 };
        List<Integer> duplicateValue = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (!set.contains(arr[i])) {
                set.add(arr[i]);
            } else {
                duplicateValue.add(arr[i]);
            }

        }
        System.out.println(duplicateValue);

    }
}