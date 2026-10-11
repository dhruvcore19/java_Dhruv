
import java.util.Scanner;

public class LeetCode_8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int temp = num;
        int count = 0;

        while (temp > 0) {
            int digit = temp % 10;

            if (num % digit == 0) {
                count++;
            }

            temp = temp / 10;
        }

        System.out.println("Count: " + count);

        sc.close();
    }
}
