import java.util.Scanner;

public class LeetCode_15{

    public static boolean detectCapitalUse(String word) {

        int capitalCount = 0;

        for (int i = 0; i < word.length(); i++) {
            if (Character.isUpperCase(word.charAt(i))) {
                capitalCount++;
            }
        }

        if (capitalCount == word.length()) {
            return true;
        }

     
        if (capitalCount == 0) {
            return true;
        }

        if (capitalCount == 1 && Character.isUpperCase(word.charAt(0))) {
            return true;
        }

        return false;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a word: ");
        String word = sc.next();

        if (detectCapitalUse(word)) {
            System.out.println("Valid capital usage.");
        } else {
            System.out.println("Invalid capital usage.");
        }

        sc.close();
    }
}