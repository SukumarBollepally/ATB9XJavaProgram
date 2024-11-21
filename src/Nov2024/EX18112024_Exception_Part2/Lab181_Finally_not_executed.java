package Nov2024.EX18112024_Exception_Part2;

public class Lab181_Finally_not_executed {

    public static void main(String[] args) {
        try {
            int a = 10/10;
            System.exit(0);
        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            System.out.println("Not Printed");
        }

    }
}
