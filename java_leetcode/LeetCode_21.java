import java.util.Arrays;

public class LeetCode_21 {

    public static int[] runningSum(int[] nums) {
        int[] result = nums.clone();

        for (int i = 1; i < result.length; i++) {
            result[i] += result[i - 1];
        }

        return result;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};

        System.out.println(Arrays.toString(runningSum(nums)));
    }
}