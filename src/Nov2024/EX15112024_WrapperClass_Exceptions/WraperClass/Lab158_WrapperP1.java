package Nov2024.EX15112024_WrapperClass_Exceptions.WraperClass;

public class Lab158_WrapperP1 {


    public static void main(String[] args) {


        int a = 12;
        float f = 1.2f;
        short s = 123;
        long l = 34l;
        double d = 4563;
        // Primitive Data type
        // Java hates it ->
        // Java Loves - class and Object.

        String s1=  new String("Sukumar");
// a1.intValue(); - Class and Object - Java loves.

        // Why Java is not pure OOPs? - Becoz -> primitive data types.

        // Wrapper class variables


        Integer a1 =12;

        System.out.println(a1.intValue());
        System.out.println(Integer.max(2,4));
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
        Float f1 = 3.23f;
        System.out.println(f1.floatValue());
        Short sh = 342;

        System.out.println(sh.shortValue());
        Long l1 = 234l;

        System.out.println(l1.longValue());
        Double d1 = 1245.0;

        System.out.println(d1.doubleValue());

        Boolean b = true;

        System.out.println(b.booleanValue());

    }
}
