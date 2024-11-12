package Oct2024.Oct15102024_Operators_in_Java;

public class lab020_MaxOfThree {
    public static void main(String[] args) {
        int a = 12;
        int b = 10;
        int c = 15;

        String max;

        max = (a>b) && (a>c) ? "a is greater than b and c": (b>c)? "b is greater than a and c": "c is greater than and a and b";

        System.out.println(max);

    }
}
