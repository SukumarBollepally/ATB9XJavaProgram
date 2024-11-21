package Nov2024.SuperKeyword_Abstraction;

public class Lab146_Interface_Practice {

    public static void main(String[] args) {

experiment e = new experiment();

e.i1();
e.i2();

    }

}

class experiment implements practice
{
    @Override
   public void i1()
    {
        System.out.println("I am new");
    }
    @Override
    public void i2()
    {
        System.out.println("I am second");
    }
}
interface practice {

    void i1();
    void i2();

}