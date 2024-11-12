package Oct2024.EX25102024_Stings;

public class Lab102_string_creation {

    public static void main(String[] args) {
        String name = "pramod";
        name = "dutta";
        name = "pramoddutta";
        name = "pramod"; // SCP

        // String -> data type
        // name -> Ref
        // = -> assignment operator
        // "Pramod" - Literal(String)

        System.out.println(name);



        String name2 = new String("Pramod");
        String name3 = new String("Pramod");
        String name5 = name2;
    }
}
