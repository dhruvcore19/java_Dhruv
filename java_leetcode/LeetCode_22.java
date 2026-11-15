public class LeetCode_22 {

    public static int maximumWealth(int[][] accounts) {
        int maxWealth = 0;

        for (int[] customer : accounts) {
            int sum = 0;

            for (int amount : customer) {
                sum += amount;
            }

            maxWealth = Math.max(maxWealth, sum);
        }

        return maxWealth;
    }

    public static void main(String[] args) {
        int[][] accounts = {
            {1, 2, 3},
            {3, 2, 1}
        };

        System.out.println(maximumWealth(accounts));
    }
}