/**
 * Distribute candy Probelm
 * 
 * Given N candies and M people, First turn, the first person get 1 candy and
 * second person get 2 candies, and so on till M people, In the next turn , the
 * first person gets M+ 1 candies, second person gets M+ 2and so on.
 * 
 * Approach One: Naive
 * Time complexity: O(Number of distributions)
 */

public class DistributedCandy {
    public static void distOfCandies(int numOfCandies, int students) {
        int[] arr = new int[students];
        int j = 0;
        while (numOfCandies > 0) {
            for (int i = 0; i < students; i++) {
                j++;
                if (numOfCandies <= 0) {
                    break;
                } else {
                    if (j < numOfCandies) {
                        arr[i] = arr[i] + j;
                    } else {
                        arr[i] = arr[i] + numOfCandies;
                    }
                    numOfCandies = numOfCandies - j;
                }
            }
        }
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

    public static void main(String[] args) {
        int numOfCandies = 10;
        int students = 3;
        distOfCandies(numOfCandies, students);
    }

}
