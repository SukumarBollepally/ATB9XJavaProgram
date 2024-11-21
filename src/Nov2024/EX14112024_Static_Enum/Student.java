package Nov2024.EX14112024_Static_Enum;

public class Student{
        int age; // Non static variable // Instance Variable
        static String school_name = "ABC"; // Static Variable

        public Student(int age) {
            this.age = age;
        }

        {
            System.out.println("IIB");
            System.out.println("Here you can write a code what you want to do when Object is created");
            System.out.println("Read a MySQL db()");
        }

        static {
            System.out.println("SIB");
            System.out.println("Loaded Once, When Class is Loaded.");
            System.out.println("Read the excel file");
        }


        public Student(String amit, String number) {
        }

    public void printDetails() {

        System.out.println("ABC");
    }
}
