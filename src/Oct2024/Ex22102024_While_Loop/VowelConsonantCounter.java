package Oct2024.Ex22102024_While_Loop;

    import java.util.Scanner;

    public class VowelConsonantCounter {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter a string: ");
            String str = scanner.nextLine();
            str = str.toLowerCase(); // Convert the string to lowercase

            int vcount = 0, ccount = 0; // Initialize counters

            for (int i = 0; i < str.length(); i++) {
                char ch = str.charAt(i);
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    vcount++; // Increment vowel counter
                } else if (ch >= 'a' && ch <= 'z') {
                    ccount++; // Increment consonant counter
                }
            }

            System.out.println("Number of Vowels: " + vcount);
            System.out.println("Number of Consonants: " + ccount);
            scanner.close();
        }
    }

