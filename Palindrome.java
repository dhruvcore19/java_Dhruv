import java.util.Scanner;

public class Palindrome {

    public static boolean isPalindrome(int x) {

        // Negative numbers are not palindromes
        if (x < 0) {
            return false;
        }

        int original = x;
        int reverse = 0;

        while (x != 0) {
            int digit = x % 10;
            reverse = reverse * 10 + digit;
            x = x / 10;
        }

        return original == reverse;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int x = sc.nextInt();

        boolean result = isPalindrome(x);

        if (result) {
            System.out.println(x + " is a Palindrome Number.");
        } else {
            System.out.println(x + " is not a Palindrome Number.");
        }

        sc.close();
    }
}