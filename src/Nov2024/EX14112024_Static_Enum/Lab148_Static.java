package Nov2024.EX14112024_Static_Enum;

public class Lab148_Static {
    public static void main(String[] args) {


            Student s1 = new Student(23);
            Student s2 = new Student(33);

            System.out.println(Student.school_name);
            Student.school_name = "XYZ";
            System.out.println(Student.school_name);
            System.out.println(s1.school_name);
            System.out.println(s2.school_name);

        }

    }


