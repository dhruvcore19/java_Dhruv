import java.util.Scanner;

class StudentResult {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter student name: ");
        String name = sc.nextLine();

        System.out.print("Enter marks in Subject 1: ");
        int m1 = sc.nextInt();

        System.out.print("Enter marks in Subject 2: ");
        int m2 = sc.nextInt();

        System.out.print("Enter marks in Subject 3: ");
        int m3 = sc.nextInt();

        int total = m1 + m2 + m3;
        double average = (double) total / 3;

        boolean passed = m1 >= 40 && m2 >= 40 && m3 >= 40;
        boolean distinction = passed && average >= 75;
        boolean award = m1 >= 90 && m2 >= 90 && m3 >= 90;

        System.out.println("\n--- Student Result ---");
        System.out.println("Name: " + name);
        System.out.println("Total Marks: " + total);
        System.out.println("Average: " + average);
        System.out.println("Passed: " + passed);
        System.out.println("Distinction: " + distinction);
        System.out.println("Special Award: " + award);

        sc.close();
    }
}