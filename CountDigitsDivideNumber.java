import java.util.Scanner;

public class CountDigitsDivideNumber {

    public static int countDigits(int num) {

        int original = num;
        int count = 0;

        while (num > 0) {

            // Get the last digit
            int digit = num % 10;

            // Check if digit divides the original number
            if (digit != 0 && original % digit == 0) {
                count++;
            }

            // Remove the last digit
            num = num / 10;
        }

        return count;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int result = countDigits(num);

        System.out.println("Count of digits that divide the number = " + result);

        sc.close();
    }
}