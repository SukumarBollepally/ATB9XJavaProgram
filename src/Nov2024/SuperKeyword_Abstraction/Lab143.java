package Nov2024.SuperKeyword_Abstraction;

import java.sql.SQLOutput;

public class Lab143 {

    public static void main(String[] args) {
        WagonR r  = new WagonR();
        r.drive();

        Tesla t  = new Tesla();
        t.run();

        // Engine e = new Engine();
    }
}

class WagonR extends Engine{

    void drive(){
        startEngine();
        stopEngine();
    }



    @Override
    void startEngine() {
        System.out.println("starting car");
    }

    @Override
    void stopEngine() {
        System.out.println("stopping car");
    }
}
class Tesla extends Engine {

    void run()
    {
        startEngine();
        stopEngine();
    }
    @Override
    void startEngine() {
        System.out.println("It is Electic Engine");
    }

    @Override
    void stopEngine() {

        System.out.println("off the push button to stop the engine");

    }
}
abstract class Engine {
    abstract void startEngine();
    abstract void stopEngine();
}