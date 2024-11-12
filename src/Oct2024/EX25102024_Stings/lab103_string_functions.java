package Oct2024.EX25102024_Stings;

public class lab103_string_functions {

    public static void main (String[] args) {

        String a1 = "Sukumar"; // asignment operator string are created in String constant pool
            a1= a1.toUpperCase();  // Creates new
          a1 =  a1.toLowerCase();
          String a5 = "Bollepally";
          String a6 = "Sukumar";
          String a7 = "Bollepally";
        System.out.println(a1+a1);

        String a2 = new String("Sukumar");
        String a3 = new String("Bollepally");
        String a4 = new String("Sukumar Bollepally");

        // == Comparison operator  compare both stings with same literals

        System.out.println(a1==a2);
        System.out.println(a1==a6);
        System.out.println( a5 == a7);
        System.out.println(a2==a6);
        System.out.println(a1+a2+a3+a4+a5+a6+a7);

        // equals to function

// equals ( content) -> value
        // How can I check the values? equals == value

        System.out.println(a1.equals(a2));
        System.out.println(a1.equalsIgnoreCase(a2));
    }
}
