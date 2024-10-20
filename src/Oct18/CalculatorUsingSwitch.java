package Oct18;

import java.util.Scanner;

public class CalculatorUsingSwitch {

    public static void main(String[] args) {

        /*
        Create a simple calculator that performs addition, subtraction, multiplication, and division, modus based on user input using switch statements.

Inputs :   num 1, num 2, +
Output :  num1+num2 → print information.
         */

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number 1:");

        double num1 = sc.nextDouble();
        System.out.println("Enter nUmber 2:");
        double num2 = sc.nextDouble();
        double answer;
        System.out.println("Enter Operator to caluclate between two values: + - % / *");
        char operator = sc.next().charAt(0);

        switch(operator) {
            case '+':
                answer = num1 + num2;
                System.out.println("Adition between two number is " + answer);
                break;
            case '-':
                answer = num1 - num2;
                System.out.println("Subtraction between num 1 and num2 is  " + answer);
                break;
            case '*':
                answer = num1 * num2;
                System.out.println("Multiplication between two numbers is " + answer);
                break;
            case '/':
                answer = num1 / num2;
                System.out.println("Division between num1 and num2 is " + answer);
                break;
            case '%':
                answer = num1 % num2;
                System.out.println("Modulous of two numbers is " + answer);
                break;
            default:
                System.out.println("Enter a valid operator ");
                break;
        }
        sc.close();
        }

}
