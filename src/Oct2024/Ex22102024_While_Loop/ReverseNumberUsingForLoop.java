package Oct2024.Ex22102024_While_Loop;

import java.util.Scanner;

public class ReverseNumberUsingForLoop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        int reversenum = 0;

        // For loop to reverse the number
        for (; num != 0; num /= 10) {
            int digit = num % 10; // Extract the last digit
            reversenum = reversenum * 10 + digit; // Append the digit to reversenum
        }

        System.out.println("Reversed Number: " + reversenum);
        scanner.close();
    }
}

