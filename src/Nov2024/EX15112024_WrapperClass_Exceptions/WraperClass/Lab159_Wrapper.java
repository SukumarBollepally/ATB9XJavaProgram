package Nov2024.EX15112024_WrapperClass_Exceptions.WraperClass;

public class Lab159_Wrapper {

    public static void main(String[] args) {
        // Primitive to Wrapper class
        int x = 45;

        Integer y = x; //boxing the value
        y.intValue();
        System.out.println(y);

        Integer a2 = 42;
        int value = a2; // Unboxing - Integer -> int
        System.out.println(value);

    }
}
