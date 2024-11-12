package Nov2024.EX06112024_Constructors;

import java.util.Scanner;

public class Lab126_Constructors {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Car2 t1 = new Car2("tesla", 2015);
        System.out.println(t1.model);
        System.out.println(t1.year);

        t1.display();


        Car2 t2 = new Car2("nano", 2013);
        System.out.println(t2.model);
        System.out.println(t2.year);
        // t2.model

        t2.display();

        System.out.println("Enter the model name");
        String model_name_input = sc.next();
        System.out.println("Enter the year ");
        int year_input = sc.nextInt();

        Car2 t3 = new Car2(model_name_input, year_input);

        System.out.println(t3.year);
        System.out.println(t3.model);

        t3.display();


    }
}
