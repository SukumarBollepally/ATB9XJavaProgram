package Nov2024.EX18112024_Exception_Part2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Lab177_throws {

    public static void main(String[] args) throws FileNotFoundException,Exception {
        // Throws - Checked
        FileInputStream fileInputStream = new FileInputStream("C://a.log");

    }
}
