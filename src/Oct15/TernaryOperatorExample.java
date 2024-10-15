package Oct15;

public class TernaryOperatorExample {
    public static void main(String[] args) {
/*
- The **conditional operator**, commonly known as the **ternary operator** in Java.
- evaluate a condition and return one of two values based on the result.
- Very similar - `if-else` statement.
#### Syntax
- result = condition ? expression1 : expression2;


- **condition**: This is a boolean expression that is evaluated.
- **expression1**: This expression is executed if the condition is true.
- **expression2**: This expression is executed if the condition is false.

 */
        int my_age = 35;
        String actual_age = my_age>=35 ? "Sukumar Bollepally" : "Manish";
        //result = condition ? expression1 : expression2;
        System.out.println(actual_age);
    }
}
