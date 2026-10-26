import java.util.Scanner;

public class LeetCode_16 {

    public static String reversePrefix(String word, char ch) {

        char[] arr = word.toCharArray();

     
        int index = word.indexOf(ch);

     
        int left = 0;
        int right = index;

        while (left < right) {
            char temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;
        }

        return new String(arr);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a word: ");
        String word = sc.next();

        System.out.print("Enter a character: ");
        char ch = sc.next().charAt(0);

        String result = reversePrefix(word, ch);

        System.out.println("Result: " + result);

        sc.close();
    }
}