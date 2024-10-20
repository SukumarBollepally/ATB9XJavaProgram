package Oct17;

import java.sql.SQLOutput;
import java.util.Scanner;

public class GradeCaluculatorLiveexample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the Score:>");
        int My_Score = sc.nextInt();
        char My_Grade = 'F';
        if (My_Score >= 90 && My_Score <= 100) {
            My_Grade = 'A';
        } else if (My_Score >= 80 && My_Score <= 89) {
            My_Grade = 'B';
        } else if (My_Score >= 70 && My_Score <= 79) {
            My_Grade = 'c';
        } else if (My_Score >= 60 && My_Score <= 69) {
            My_Grade = 'D';
        } else if (My_Score < 0 || My_Score > 100) {

            System.out.println("Please enter valid Socre to validate the Grade");

        } else {
            My_Grade = 'F';
        }
        System.out.println("Your Grade is -> "  + My_Grade);
        sc.close();
    }
}
