package Oct2024.Ex23102024_Functions;

public class lab96_user_defined_functions {

    /*
    ## Functions
- Functions, often referred to as methods in Java.
- Functions in Java are blocks of code designed to perform **specific tasks.**

## Key Components of Java Functions

1. Definition/ **Declaration** - A function must be declared within a class.
`public returnType functionName(parameterType parameterName) {
    // body of the function
}`

1. Calling - Until you call the function, You can run it.
    1. `functionName(arguments);`
1. Built In Fucntions - (Java Guys)
2. User Defined. - Created by Us.
```
Main is also a function, which is called by the JVM

public static void main(){}
```
String -> length, toLowerCase(), charAT(), toUpperCase(), Split(), SubString(), Trim()
Math -> max, min, auvg, cos, sin.

StringBuffer/ -> reverse(), trim()....

Interger.parseInt() ->

**User Defined Functions.**

1. Without Parameters and Without Return Type.
 2. Without Parameters but With Return Type
 3. With Parameters and Without Return Type
 4. With Parameters and With Return Type

     */
    public static void main(String[] args) {

    //  1. Without Argument / Parameters and Without Return Type.
    //        for (int i = 0; i < 99; i++) {
    //            greet();
    //        }
    greet();

    //  2. Without Parameters but With Return Type

    String returned_value = greet_with_hello();
        System.out.println(returned_value);

    int voting_age = age_of_vote();
        System.out.println(voting_age);
        if (voting_age >= 18) {
        System.out.println("You are allowed to vote!");
    } else {
        System.out.println("Not Allowed!");
    }

    //  3. With Parameters and Without Return Type ( 90%)

    greet_with_your_name("Pramod");
    greet_with_your_name("Amit");
    greet_with_your_name("Balaji");
    // greet_with_your_name(); without parameters
    greet_with_first_name_last_name("pramod","dutta");

    //  4. With Parameters and With Return Type

    int result = sum_of_two_number(3,4);
        System.out.println(result);

}

// 1. Without Parameters and Without Return Type. (Declare) /Define

static void greet() {
    System.out.println("Hi, How are you?");
}

//  2. Without Parameters but With Return Type

static String greet_with_hello() {
    // Write the code

    System.out.println("Hi, I am Type 2");
    return "Hi,You are awesome";
}

static int age_of_vote() {
    // Write the code
    System.out.println("Vote age Returned!");
    return 18;
}


//  3. With Parameters and Without Return Type (void)
static void greet_with_your_name(String name) {
    System.out.println("Hi Your name is " + name);
}

static void greet_with_first_name_last_name(String firstname,String lastname) {
    System.out.println("Hi Your name is " + firstname +" "+ lastname);
}


//  4. With Parameters and With Return Type

static int sum_of_two_number(int a, int b){
    return a+b;
}

}

