package Nov2024.EX14112024_Static_Enum;

public class Lab149 {

    public static void main(String[] args) {
        A a = new A();
        A a1 = new A();
        new A();
        A a2; // Rule 1- Only Ref creation doesn't call the SIB
    }
}

class A {
    static {
        System.out.println("SIB");
    }

    {
        System.out.println("IIB");
    }

}
