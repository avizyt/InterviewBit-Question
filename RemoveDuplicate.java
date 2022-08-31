
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/**
 * If you want to test this method you must implement the ListNode's
 * others methods.
 */

class ListNode {
    int val;
    ListNode next;

    ListNode(int item) {
        val = item;
        next = null;
    }
}

public class RemoveDuplicate {

    // Direct approach:
    public static void main(String[] args) {
        int[] arr = { 1, 2, 1, 3, 2, 4, 1, 2, 3, 5, 4, 7, 5, 6, 4 };
        List<Integer> refined = new ArrayList<>();
        HashSet<Integer> set = new HashSet<>();
        int i = 0;

        while (i < arr.length - 1) {
            if (!set.contains(arr[i])) {
                set.add(arr[i]);
                refined.add(arr[i]);
                i++;
            } else {
                i++;
            }
        }
        System.out.println(refined);

    }

    // Final method for interviewBit:
    public ListNode deletedDuplicates(ListNode A) {

        ListNode current = A;
        while (current != null) {
            ListNode temp = current;
            while (temp != null && temp.val == current.val) {
                temp = temp.next;
            }
            current.next = temp;
            current = current.next;
        }
        return A;
    }

}