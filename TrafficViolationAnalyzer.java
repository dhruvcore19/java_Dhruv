import java.util.Scanner;

public class TrafficViolationAnalyzer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Vehicle Number: ");
        String vehicleNo = sc.nextLine();

        System.out.print("Enter Vehicle Speed: ");
        int speed = sc.nextInt();

        System.out.print("Enter Speed Limit: ");
        int speedLimit = sc.nextInt();

        System.out.print("Enter Driver Age: ");
        int age = sc.nextInt();

        System.out.print("Is Helmet Worn? (true/false): ");
        boolean helmet = sc.nextBoolean();

        System.out.print("Is Seatbelt Worn? (true/false): ");
        boolean seatbelt = sc.nextBoolean();

        System.out.print("Is License Valid? (true/false): ");
        boolean license = sc.nextBoolean();

        System.out.print("Is Emergency Vehicle? (true/false): ");
        boolean emergency = sc.nextBoolean();

        int fine = 0;

        System.out.println("\n------ TRAFFIC VIOLATION REPORT ------");
        System.out.println("Vehicle Number: " + vehicleNo);

        // Speed violation
        if (speed > speedLimit && !emergency) {
            System.out.println("Violation: Over Speeding");
            fine += 1000;
        }

        // Helmet violation
        if (!helmet && age >= 18 && !emergency) {
            System.out.println("Violation: Helmet Not Worn");
            fine += 500;
        }

        // Seatbelt violation
        if (!seatbelt && !emergency) {
            System.out.println("Violation: Seatbelt Not Worn");
            fine += 500;
        }

        // License violation
        if (!license) {
            System.out.println("Violation: Invalid License");
            fine += 2000;
        }

        // Age check
        if (age < 18) {
            System.out.println("Violation: Driver Below Legal Driving Age");
            fine += 1000;
        }

        // Final report
        if (fine == 0) {
            System.out.println("Status: No Traffic Violation");
            System.out.println("Total Fine: ₹0");
        } else {
            System.out.println("Status: Traffic Violation Detected");
            System.out.println("Total Fine: ₹" + fine);
        }

        sc.close();
    }
}