package Nov2024.Ex05112024_OOPS;

public class LAB123_Object_Class {

    public static void main(String[] args) {
        Cat c1= new Cat();
        c1.name = "rosey";
        c1.sleep();
        System.out.println(c1.name);
    }
}

class Cat{
    String name;


    void sleep(){
        System.out.println("Sleeping");
    }
}
