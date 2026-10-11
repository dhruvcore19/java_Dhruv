
import java.util.Scanner;

public class LeetCode_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a binary number: ");
        String binary = sc.next();

        int result = 0;

        for (int i = 0; i < binary.length(); i++) {
            int bit = binary.charAt(i) - '0';
            result = result * 2 + bit;
        }

        System.out.println("Decimal number: " + result);

        sc.close();
    }
}
