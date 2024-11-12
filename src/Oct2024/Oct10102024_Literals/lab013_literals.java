package Oct2024.Oct10102024_Literals;

public class lab013_literals {
    public static void main(String[] args) {
        boolean sukumar_is_software_engineer = true;
       // boolean sukumar_name_is_invalid = 12;  invalid literal a boolean cane be true or false value
int abc = 12;
        // Binary Literal
        int age = 65; // Decimal System - Y, base will be 10

        // Binary Literal
        int binary_num = 0b1010;
            System.out.println(binary_num);
        // Octal base? -> 8
        int octal = 0101; // 0101 = (0 × 8³) + (1 × 8²) + (0 × 8¹) + (1 × 8⁰) = 65
            System.out.println(octal);
        // Hexadecimal Literals
        int hex = 0Xface; //base 16 color combination are in hex - #28a745
            System.out.println(hex);
/*
data_type variable_name = **variable_value**

- Literals are the actual values assigned.
- Literals can be Numeric and Non Numeric.


**Types of Literals**

1) Boolean Literals - true, false

2) Character Literals -

3) String Literals

4) Integral Literals

5) Floating Literals

6) null Literal


 */

        // Char

        char c1 = 'A';
        char c2 = 'B';
        char c3 = '@';
            System.out.println(c1+c2+c3);
        // Escape Char
        char new_line = '\n';
        char tab_line = '\t';
        char back_space = '\b';
        char car_r = '\r'; // delete the previous word

        System.out.println("SUKUMAR"+ new_line +  "BOLLEPALLY");
        //System.out.println("Pramod" +  "Dutta");
        System.out.println("SUKUMAR"+ tab_line +  "BOLLEPALLY");
        System.out.println("SUKUMAR"+ back_space +  "BOLLEPALLY");
        System.out.println("SUKUMAR"+ car_r +  "BOLLEPALLY");


        char c11  = '\u1F60';
        // ASCII ->
        // chinese - india, japense -> Unicode
        // /u09878

            System.out.println(c1+c11);
    }
}
