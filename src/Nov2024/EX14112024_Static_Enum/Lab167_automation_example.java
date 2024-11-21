package Nov2024.EX14112024_Static_Enum;

public class Lab167_automation_example {


    public static void main(String[] args) {
        Automation t1 = new Automation();
        Automation t2 = new Automation();
        System.out.println(t1.driver);
        System.out.println(t2.driver);
    }
}

class Automation{
    static String driver = "Chrome";

}

