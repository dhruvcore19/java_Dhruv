import java.util.Arrays;

public class LeetCode_31 {

    public static int[] plusOne(int[] digits) {
        int[] result = digits.clone();

        for (int i = result.length - 1; i >= 0; i--) {

            if (result[i] < 9) {
                result[i]++;
                return result;
            }

            result[i] = 0;
        }

        int[] largerResult = new int[result.length + 1];
        largerResult[0] = 1;

        return largerResult;
    }

    public static void main(String[] args) {
        int[] digits = {9, 9, 9};

        System.out.println(Arrays.toString(plusOne(digits)));
    }
}