package Oct16102024_Scanner_Class;

import java.util.Scanner;

public class lab023_ScannerClassExample {

    public static void main(String[] args) {
        // Scanner class example to print age, name and salary of the employee in a company
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Age of the employee:");
        int age = scanner.nextInt();
        System.out.println(age >= 18 ? "Eligible for employment" : "Not eligible for employment");

        scanner.nextLine(); // Consume the newline left-over

        System.out.println("Enter Name of the Employee:");
        String name = scanner.nextLine(); // Use nextLine() to read full name
        System.out.println("Name of the employee is: " + name);

        System.out.println("Enter salary of the employee:");
        double salary = scanner.nextDouble();
        System.out.println(salary >= 50000 ? "High salary" : "Standard salary");

        scanner.close();
    }
}

