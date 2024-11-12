package Oct2024.Oct21_for_Loop;

public class lab_print_stars {

    public static void main(String[] args) {

        int n = 6;

        for (int i = 1; i<=n;i++)
            for (int j = 1; j<=i;j++) {
                System.out.print("*");
            }
        System.out.println();
    }
}
