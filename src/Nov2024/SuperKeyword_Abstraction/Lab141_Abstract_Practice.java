package Nov2024.SuperKeyword_Abstraction;

public class Lab141_Abstract_Practice {

    public void main(String[] args) {
        System.out.println("Execute the abstract class");
        beginer b = new beginer();
        b.beginer1();
        b.beginer3();
        b.beginer2();

    }

    class beginer extends new_joiner {
        private int a = 23;

beginer()
{
    int b = 45;
    String my_name = "Sukumar";
    System.out.println("I am default");
    System.out.println(this.a);

}

        @Override
        void beginer1() {
            System.out.println("Joined on 8th november 2024");
        }

        @Override
        void beginer2() {
            System.out.println("Joined on 9th november");
        }

    }


    abstract class new_joiner {

        abstract void beginer1();

        abstract void beginer2();

        void beginer3() {
            System.out.println("I am a new joiner");
        }
    }
}