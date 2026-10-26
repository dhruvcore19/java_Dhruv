import java.util.Scanner;

public class LeetCode_19 {

    public static String defangIPaddr(String address) {

        return address.replace(".", "[.]");
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter IP address: ");
        String address = sc.nextLine();

        String result = defangIPaddr(address);

        System.out.println("Defanged IP address: " + result);

        sc.close();
    }
}