import java.util.Scanner;

public class LeetCode_18 {

    public static String interpret(String command) {

        StringBuilder result = new StringBuilder();

        int i = 0;

        while (i < command.length()) {

            if (command.charAt(i) == 'G') {
                result.append('G');
                i++;
            }
            else if (command.charAt(i) == '(' &&
                     i + 1 < command.length() &&
                     command.charAt(i + 1) == ')') {
                result.append('o');
                i += 2;
            }
            else if (command.charAt(i) == '(') {
                result.append("al");
                i += 4;
            }
        }

        return result.toString();
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter command: ");
        String command = sc.nextLine();

        String result = interpret(command);

        System.out.println("Output: " + result);

        sc.close();
    }
}