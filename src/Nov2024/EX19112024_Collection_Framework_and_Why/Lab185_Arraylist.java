package Nov2024.EX19112024_Collection_Framework_and_Why;

import java.util.ArrayList;

public class Lab185_Arraylist {

    public static void main(String[] args) {

//        Collection list = new ArrayList(); // Dynamic Dispatch -
//        List list1 = new ArrayList(); // Dynamic Dispatch -
        ArrayList studentList = new ArrayList();
        studentList.add("Pramod");
        studentList.add("Dutta");
        studentList.add("Dutta"); // Duplicate is allowed.
        studentList.add("Anil");
        studentList.add("Amit");
        studentList.add(true); // Different data type is allowed.
        studentList.add(123);
        studentList.add(null);


        System.out.println(studentList);



    }
}
