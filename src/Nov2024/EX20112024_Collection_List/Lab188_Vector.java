package Nov2024.EX20112024_Collection_List;

import java.util.Vector;

public class Lab188_Vector {

    public static void main(String[] args) {
        Vector v = new Vector();
        v.add("Pramod");
        v.add("Amit");
        v.add("Lucky");
        System.out.println(v);
        v.remove("Amit");
        System.out.println(v.contains("Lucky"));
        System.out.println(v);
    }
}
