package Nov2024.EX18112024_Exception_Part2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Lab177_checked_and_unvhecked {

    public static void main(String[] args) {
        try {
            int a = 10 / 0;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Unchecked!");
        }

        try {
            FileReader f = new FileReader(new File("C://abc.txt"));
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Finally Checked Exception");
        }





    }
}
