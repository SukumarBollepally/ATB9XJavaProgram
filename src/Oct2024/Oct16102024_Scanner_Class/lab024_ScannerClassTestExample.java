package Oct2024.Oct16102024_Scanner_Class;

import java.util.Scanner;

public class lab024_ScannerClassTestExample {
    public static void main(String[] args) {
//scanner class exmaple to print age, name and salary of the employee in a company
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Age of the employee \n");
        int age = scanner.nextInt();
        System.out.println(age>=34 ? "He is the Employee of the company" : "He is not the employee of the company");
        System.out.println("Enter Name of the Employee\n");
        String name = scanner.next();
        System.out.println("Name of the employee is \t"   +name);
        System.out.println("Enter salary of the employee \n");
        double salary = scanner.nextDouble();
        System.out.println(salary>=9999 ? "Sukumar's salary": "Not Sukumar salary");
       scanner.close();
    }
}
