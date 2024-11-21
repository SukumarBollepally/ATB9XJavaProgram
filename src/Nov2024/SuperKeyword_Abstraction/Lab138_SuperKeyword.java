package Nov2024.SuperKeyword_Abstraction;

public class Lab138_SuperKeyword {

    public static void main(String[] args) {
        Car c = new Car();

    }


}

class Car extends Vehicle{
    private int maxSpeed = 281;
    private String message = "My Name is Sukumar";

    @Override
    void display() {
        System.out.println("Child");
    }

    Car(){

        super(10);

        System.out.println("DC Car");
        System.out.println(this.maxSpeed);
        System.out.println(super.maxSpeed);
        System.out.println(this.message);
        this.display();
        super.display();
        this.message();
        super.message();
    }

}



class Vehicle{
    public int maxSpeed = 180;

    void display(){
        System.out.println("Parent");
    }


    Vehicle(){
        System.out.println("DC Vehicle");
    }

    Vehicle(int a){
        System.out.println("PC Vehicle");
    }

    void message() {
        System.out.println("Hello Vehicle");
    }

    void message(int b) {
        System.out.println("Hello Vehicle");
    }
}
