package Nov2024.SuperKeyword_Abstraction;

public class Lab145_Interfacep1 {

    public static void main(String[] args) {
        P p  = new P();
        p.f1();

        //I i = new I();

    }
}

class P implements I1{
    @Override
    public void f1() {
    }
    @Override
    public void f2() {
    }

    @Override
    public void f3() {

    }
}

interface I1{
    void f1();
    void f2();
    void f3();
}

