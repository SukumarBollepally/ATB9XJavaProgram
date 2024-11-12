package Oct2024.Ex22102024_While_Loop;

import java.util.Scanner;

public class lab87_Vowels_and_constants {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the string of interest");

        char ch =  scanner.next().charAt(0);

        for (int i = 0; i < ch; i++) {
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                System.out.println("Vowel");
            } else {
                System.out.println("Consonant");
            }
        }
    }
}
