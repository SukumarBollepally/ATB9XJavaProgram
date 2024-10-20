package Oct17;

import java.util.Scanner;

public class TriangleClassifier {

    public static void main(String[] args) {
/*
// ✅ Triangle Classifier:
        //Write a program that classifies a triangle based on its side lengths.
        //Given three input values representing the lengths of the sides,
        // determine if the triangle is equilateral (all sides are equal),
        // isosceles (exactly two sides are equal),
        // or scalene (no sides are equal).
        // Use an if-else statement to classify the triangle.
        // side1, side2, side2 → eq, iso, scalene

        // Logic Building
        // Step 1
        // Find the inputs / outputs
        // Input | side1,side2,side3 -> data type -> double
        // Output | SOP -> String or message -> Equilateral, Isosceles, Scalene.
 */
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Side1;>");
        double side1 = sc.nextInt();
        System.out.println("Enter the Side2;>");
        double side2 = sc.nextInt();
        System.out.println("Enter the Side3;>");
        double side3 = sc.nextInt();
if (side1<=0 || side2<=0 || side3<=0)
{
    System.out.println("Invalid Input: Side of a traingle must be positive number always");
}
else if (side1 == side2 && side2 == side3 && side3 == side1) {
            System.out.println("It is Equilateral Triangle");
        } else if (side1 == side2 || side2 == side3 || side3 == side1) {
            System.out.println("Two sides are equal It is Isosoles Traingle");
        } else
            System.out.println(" No side is equal It is Scalene Triangle");
        {
        }
    }
}
