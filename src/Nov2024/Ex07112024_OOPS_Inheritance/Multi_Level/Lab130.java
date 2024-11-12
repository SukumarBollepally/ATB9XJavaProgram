package Nov2024.Ex07112024_OOPS_Inheritance.Multi_Level;

public class Lab130 {

    public static void main(String[] args) {
        Child c = new Child();
        c.home();
        c.gf();
        c.f();
        c.c();

        Father f1 = new Father();
        f1.gf();
        f1.f();
        f1.father_extra();

        GrandFather g1 = new GrandFather();
        g1.gf();
        g1.home();

    }
}
