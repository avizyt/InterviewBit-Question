import java.util.ArrayList;
import java.util.List;

public class ListReverse {
    public static <T> List<T> reverse(final List<T> values) {
        final List<T> result = new ArrayList<>();

        for (int i = values.size() - 1; i >= 0; i--) {
            result.add(values.get(i));
        }

        return result;
    }

    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(5);
        System.out.println(arr);

        System.out.println(reverse(arr));
    }
}
