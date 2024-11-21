package Nov2024.EX18112024_Exception_Part2;

import java.util.Scanner;

public class Lab171_Fianlly_Explain {

    public static void main(String[] args) {
        Scanner sc = null;
        sc = new Scanner(System.in);
        int v = sc.nextInt();
        try {
            int a = 10 / 0;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        finally {
            sc.close();
            System.out.println("closing sc");

        }

    }
}
