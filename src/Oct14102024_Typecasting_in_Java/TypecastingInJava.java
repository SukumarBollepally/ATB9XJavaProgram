package Oct14102024_Typecasting_in_Java;

public class TypecastingInJava {

            public static void main(String[] args) {
                // 1. Implicit Casting (Widening)
                int intValue = 100;
                long longValue = intValue; // Implicit cast from int to long
                System.out.println("Implicit cast (int to long): " + longValue);

                // 2. Explicit Casting (Narrowing)
                double price = 19.99;
                int roundedPrice = (int) price; // Explicit cast from double to int
                System.out.println("Explicit cast (double to int): " + roundedPrice);
                int totalvalue = (int)longValue + roundedPrice;
                System.out.println("Explicit Casting Result:" +totalvalue);
                // 3. Char to Int (ASCII value)
                char ch = 'A';
                int asciiValue = ch;
                System.out.println("ASCII value of 'A': " + asciiValue);

                // 4. String to Primitive Types
                String strNumber = "123";
                int parsedInt = Integer.parseInt(strNumber);
                System.out.println("Parsed int: " + parsedInt);

                // 5. Primitive to String
                double doubleValue = 3.14159;
                String strDouble = String.valueOf(doubleValue);
                System.out.println("Double to String: " + strDouble);

                // 6. Object Casting (Polymorphism)
                Animal myDog = new Dog();
                Dog castedDog = (Dog) myDog;
                castedDog.bark();

                // 7. Casting in Mathematical Operations
                int numerator = 10;
                int denominator = 3;
                double result = (double) numerator / denominator;
                System.out.println("Division result: " + result);

                // 8. Boxing and Unboxing
                Integer boxedInt = Integer.valueOf(42); // Boxing
                int unboxedInt = boxedInt.intValue();   // Unboxing
                System.out.println("Unboxed int: " + unboxedInt);
            }
        }

        class Animal {
            void makeSound() {
                System.out.println("Animal makes a sound");
            }
        }

        class Dog extends Animal {
            void bark() {
                System.out.println("Dog barks");
            }
        }


