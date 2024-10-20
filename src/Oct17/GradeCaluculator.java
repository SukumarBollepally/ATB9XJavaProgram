package Oct17;

import java.sql.SQLOutput;
import java.util.Scanner;

public class GradeCaluculator {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the score:>");
        int Score = scanner.nextInt();

        if (Score>=90 && Score<=100)
        {
            System.out.println("The Grade is :> A");
        }
else if (Score>=80 && Score <=89)
        {
            System.out.println("The Grade is :> B");

        } else if (Score>=70 && Score<=79) {
            System.out.println("The Grade is:> C");

        } else if (Score>=60 && Score<=69) {
            System.out.println("The Grade is :> D");

        } else if (Score>=0 && Score<=59) {
            System.out.println("The Grade is :> Fail");


        }
        else if (Score<0 || Score> 100)
        {
            System.out.println("Please enter a valid number within the range between 0 to 100");
        }
else
        {
            System.out.println("Very Poor");
        }
        scanner.close();
    }
}
