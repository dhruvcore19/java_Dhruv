import java.util.Scanner;

public class LeetCode_17 {

    public static boolean arrayStringsAreEqual(String[] word1, String[] word2) {

        String s1 = String.join("", word1);
        String s2 = String.join("", word2);

        return s1.equals(s2);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of strings in first array: ");
        int n1 = sc.nextInt();

        String[] word1 = new String[n1];

        System.out.println("Enter first array strings:");
        for (int i = 0; i < n1; i++) {
            word1[i] = sc.next();
        }

        System.out.print("Enter number of strings in second array: ");
        int n2 = sc.nextInt();

        String[] word2 = new String[n2];

        System.out.println("Enter second array strings:");
        for (int i = 0; i < n2; i++) {
            word2[i] = sc.next();
        }

        if (arrayStringsAreEqual(word1, word2)) {
            System.out.println("The two string arrays are equivalent.");
        } else {
            System.out.println("The two string arrays are not equivalent.");
        }

        sc.close();
    }
}