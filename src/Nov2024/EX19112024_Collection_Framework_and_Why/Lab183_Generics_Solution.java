package Nov2024.EX19112024_Collection_Framework_and_Why;

public class Lab183_Generics_Solution {

    public static void main(String[] args) {

        temp_sum(23, 45);
        temp_sum("Pramod", "Dutta");
        temp_sum(true, false);
        // pramod -> any data Type.

    }

    public static <T> T temp_sum(T a, T b) {
        System.out.println(a);
        System.out.println(b);
        return null;
    }
}