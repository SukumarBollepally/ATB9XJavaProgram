package Nov2024.SuperKeyword_Abstraction;

public class Lab146_Multiple_Inheritance {

    public void  main(String[] args) {

     kids k = new kids();

     k.same();
    // k.D2();
     k.M1();
     k.D1();

    }

   static class kids implements Dady, Mummy {

        kids() {
            System.out.println("I am children of Dady and Mummy");
        }


        @Override
        public void D1() {
            System.out.println("I am Father");
        }

        @Override
        public void M1() {
            System.out.println("I am Mother");
        }

        @Override
        public void same() {
            System.out.println("We are parents of kids");
        }
    }

    interface Dady {

        void D1();

        void same();
   /*     default void  D2()
{
    System.out.println("I am default father to Kids");
}

    */
static void D3()
{
   System.out.println("I am static father to kids");
}
   }

    interface Mummy {

        void M1();

        void same();

     //  default void M2()
    //    {
     //       System.out.println("I am default mother to kids");
    //    }
static void M3()
{
    System.out.println("I am static to kids");
}
    }
}