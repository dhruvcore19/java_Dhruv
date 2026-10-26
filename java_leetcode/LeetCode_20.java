import java.util.Scanner;

public class LeetCode_20 {

    public static String toLowerCase(String s) {
        return s.toLowerCase();
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String s = sc.nextLine();

        String result = toLowerCase(s);

        System.out.println("Lowercase string: " + result);

        sc.close();
    }
}