package Oct2024.EX25102024_Stings;

public class lab104_String_Immutable_Example {

    public static void main(String[] args) {
        String name = "pramod";
        name = name.toUpperCase(); // Converts all of the characters in this String to upper case using the rules of the default locale.
        // pramod -> PRAMOD
        System.out.println(name);
    }
}
