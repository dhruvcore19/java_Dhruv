import java.util.Scanner;

public class AddDigits{

    public static int addDigits(int num) {

        while (num >= 10) {

            int sum = 0;

            while (num > 0) {
                sum = sum + (num % 10);
                num = num / 10;
            }

            num = sum;
        }

        return num;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int result = addDigits(num);

        System.out.println("Single digit result = " + result);

        sc.close();
    }
}