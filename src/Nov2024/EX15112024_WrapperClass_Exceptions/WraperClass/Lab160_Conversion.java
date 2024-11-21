package Nov2024.EX15112024_WrapperClass_Exceptions.WraperClass;

public class Lab160_Conversion {

    public static void main(String[] args) {

        String num = "10";
        // String -> Wrapper(Integer) -> Primitive Int
        Integer a = Integer.valueOf(num);
        int a2 = a;// unboxing


        String number = "123";

        Integer i = Integer.valueOf(number);
        System.out.println(i);
        // String to Primitive
        int a3  = Integer.parseInt(num);

        System.out.println(a3);
        Long l = 10l;
        Short s= 23;
        Boolean bb = true;

    }
}
