package Oct18102024_Switch_Break_in_Java;

import java.util.Scanner;

public class lab032_Conversion_program {

    public static void main(String[] args) {

        /*
        Write a program that converts between different units (e.g., kilometers to miles, Celsius to Fahrenheit) based on user selection using a switch statement.
Input. -
choice - 1 - km → m, km → 1km
choice - 2 - f → c, f → c
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("Unit Convertor Program");
        System.out.println("1. Kilometers to Miles");
        System.out.println("2. Fahrenheit to Celsius");
        System.out.println("Enter choice of yours either 1 or 2");
        int choice = sc.nextInt();

switch (choice)
{
    case 1:
        System.out.println("Enter value of distance in Kilometers");
        double kilometers = sc.nextDouble();
        double miles = kilometers * 0.621371;
        //System.out.printf("%.2f kilometers is %.2f miles.%n", kilometers, miles);
        System.out.println(kilometers + " Kilometers is equal to " + miles  + " miles ");
        break;
    case 2:
        System.out.println("Enter the temperature value in farenheit");
        double fahrenheit = sc.nextDouble();
        double celsius = (5 * (fahrenheit - 32)) / 9;
        System.out.println(fahrenheit + " degrees Fahrenheit is equal to " + celsius + " degrees Celsius");
        break;
    default:
        {
            System.out.println("Entered choice is not valid enter either 1 or 2");
        }

}
sc.close();
    }

}
