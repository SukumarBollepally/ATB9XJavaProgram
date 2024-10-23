package Ex22102024_While_Loop;

public class lab88_while_age_program {

    public static void main(String[] args) {

        String age_string = args[0];
//string -> int
        int age = Integer.parseInt(age_string);

        while (age > 0) {
            System.out.println("My age is " + age);
            age--;
        }
    }
}
