public class CandyMan {
    public static int distOfCandies(int[] ratings, int size) {
        int[] candies = new int[1];
        boolean flag = true;
        while (flag) {
            flag = false;
            for (int i = 0; i < size; i++) {
                if (i != size - 1 && ratings[i] > ratings[i + 1] && candies[i] <= candies[i + 1]) {
                    candies[i] = candies[i + 1] + 1;
                    flag = true;
                }
                if (i > 0 && ratings[i] > ratings[i - 1] && candies[i] <= candies[i - 1]) {
                    candies[i] = candies[i - 1] + 1;
                    flag = true;
                }
            }
        }
        int sum = 0;
        for (int i = 0; i < size; i++) {
            sum += candies[i];
        }
        return sum;
    }

    public static void main(String[] args) {

        int[] arr = { 1, 2, 2 };
        int size = 10;
        System.out.println(distOfCandies(arr, size));
    }
}
