package Oct2024.Oct18102024_Switch_Break_in_Java;

import java.util.Scanner;

public class lab81_unit_convertor_using_Conversion_Methods_program {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Unit Conversion Program");
            System.out.println("1. Kilometers to Miles");
            System.out.println("2. Miles to Kilometers");
            System.out.println("3. Fahrenheit to Celsius");
            System.out.println("4. Celsius to Fahrenheit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {

                /*
                Conversion Methods:
                Each method (convertKilometersToMiles,
                 convertMilesToKilometers, convertFahrenheitToCelsius,
                  convertCelsiusToFahrenheit)
                performs the respective unit conversion and prints the result.
                 */
                case 1:
                    convertKilometersToMiles(scanner);
                    break;
                case 2:
                    convertMilesToKilometers(scanner);
                    break;
                case 3:
                    convertFahrenheitToCelsius(scanner);
                    break;
                case 4:
                    convertCelsiusToFahrenheit(scanner);
                    break;
                default:
                    System.out.println("Invalid choice");
                    break;
            }

            scanner.close();
        }

        public static void convertKilometersToMiles(Scanner scanner) {
            System.out.print("Enter distance in kilometers: ");
            double kilometers = scanner.nextDouble();
            double miles = kilometers * 0.621371;
            System.out.println(kilometers + " kilometers is equal to " + miles + " miles");
        }

        public static void convertMilesToKilometers(Scanner scanner) {
            System.out.print("Enter distance in miles: ");
            double miles = scanner.nextDouble();
            double kilometers = miles * 1.60934;
            System.out.println(miles + " miles is equal to " + kilometers + " kilometers");
        }

        public static void convertFahrenheitToCelsius(Scanner scanner) {
            System.out.print("Enter temperature in Fahrenheit: ");
            double fahrenheit = scanner.nextDouble();
            double celsius = (fahrenheit - 32) / 1.8;
            System.out.println(fahrenheit + " degrees Fahrenheit is equal to " + celsius + " degrees Celsius");
        }

        public static void convertCelsiusToFahrenheit(Scanner scanner) {
            System.out.print("Enter temperature in Celsius: ");
            double celsius = scanner.nextDouble();
            double fahrenheit = (celsius * 1.8) + 32;
            System.out.println(celsius + " degrees Celsius is equal to " + fahrenheit + " degrees Fahrenheit");
        }
    }

