package Nov2024.EX18112024_Exception_Part2;

public class Lab171_finally {

    public static void main(String[] args) {
        int a = 1;
        int c = 0;
        try {
            c = 10 / a;
            System.out.println(c);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("I will be always executed");
        }
    }
}
