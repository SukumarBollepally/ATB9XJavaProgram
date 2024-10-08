package Oct08;

import java.sql.SQLOutput;

public class VariablesAndDataTypes {
    public static void main(String[] args) {
         /*
    Variable -> Store the value (which can be changed in the program)

- A variable is a container (storage area) used to hold data.
- Each variable should be given a** unique name (**identifier).
- Memory will be allocated for the variable while executing the program.
- Value of the variable can be changed any number of times during the program execution.

### **Variable Name (identifier) | Rules to follow when you define an Identifier:**

1. Identifier can contain Alphabets, Digits, and two special symbol i.e. Dollar ($).
2. Underscore (_).
3. First character of an identifier must be an Alphabet or Dollar ($) or Underscore (_).
4. Keywords or Reserved words can't be used as Identifiers.

Data Types

Value they can store, Size(Range) -

1. Primitive Types - Pre defined java guys - size, max,min they can store,
    1. Boolean Type - true, false
    2. Numeric Type
        1. Integral Type
        2. Floating Type
2. Reference | Non primitive | User Defined

     */
        //Learned what are variables and Different types of data types in Java
    /*
    We will start working with the data types like
    integer
    characters  a to z A to Z  can be special characters: !@#$%^&*
     */

        int myNum = 5;               // Integer (whole number)
        float myFloatNum = 5.99f;    // Floating point number
        char myLetter = 'D';         // Character
        boolean myBool = true;       // Boolean
        String myText = "Hello";     // String
        int My_Age = 34; // int can be byte, float, short, double

        System.out.println(myLetter);
        System.out.println(myText);
        System.out.println(myBool);


    }
    }

