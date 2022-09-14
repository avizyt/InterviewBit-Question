import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListReverse {
    public static <T> List<T> reverse(final List<T> values) {
        final List<T> result = new ArrayList<>();

        for (int i = values.size() - 1; i >= 0; i--) {
            result.add(values.get(i));
        }

        return result;
    }

    public static <T> List<T> reverseWithListIterator(final List<T> values) {
        final List<T> result = new ArrayList<>();
        final ListIterator<T> it = values.listIterator(values.size());
        while (it.hasPrevious()) {
            result.add(it.previous());
        }
        return result;
    }

    public static void main(String[] args) {
        List<Character> arr = new ArrayList<>();
        arr.add('a');
        arr.add('b');
        arr.add('c');
        arr.add('d');
        arr.add('e');
        System.out.println(arr);

        System.out.println(reverse(arr));
    }
}
