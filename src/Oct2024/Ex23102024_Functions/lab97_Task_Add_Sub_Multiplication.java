package Oct2024.Ex23102024_Functions;

import java.util.Scanner;

public class lab97_Task_Add_Sub_Multiplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        System.out.println("Enter the first number: " + a);
        int b = scanner.nextInt();
        System.out.println("Enter the second number: " + b);

        int sum = add(a, b);
        System.out.println("Sum: " + sum);
        int difference = sub(a, b);
        System.out.println("Difference: " + difference);
        int product = mul(a, b);
        System.out.println("Product: " + product);
        int quotient = div(a, b);
        System.out.println("Quotient: " + quotient);
        scanner.close();
    }


     public static int add(int a, int b) {
        return a + b;
    }
    public static int sub(int a, int b) {
        return a - b;
    }
    public static int mul(int a, int b) {
        return a * b;
    }
    public static int div(int a, int b) {
        return a / b;
    }
}
