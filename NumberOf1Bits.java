import java.util.Scanner;

public class NumberOf1Bits {

    public static int hammingWeight(int n) {

        int count = 0;

        while (n != 0) {

            // Check whether the last bit is 1
            count = count + (n & 1);

            // Move all bits one position to the right
            n = n >>> 1;
        }

        return count;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int result = hammingWeight(n);

        System.out.println("Number of 1 bits = " + result);

        sc.close();
    }
}