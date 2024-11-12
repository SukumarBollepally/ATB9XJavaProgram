package Oct2024.Oct15102024_Operators_in_Java;

public class lab018_IncrementAndDecrementOperator {

    public static void main(String[] args) {


       // example of increment operator Post and pre


        int X = 10;
       // System.out.println(++X);
        System.out.println(X++ + ++X);
        System.out.println(++X + X++ + ++X);

        /*
        int X = 10;
System.out.println("First operation:");
int result1 = X;
X++;
result1 += ++X;
System.out.println(result1);  // Prints 22

System.out.println("Second operation:");
int result2 = ++X;
result2 += X++;
result2 += ++X;
System.out.println(result2);  // Prints 41

System.out.println("Final value of X: " + X);  // Prints 15
         */
//decrement example

        int a = 123;

        System.out.println(--a -a++ - --a);
    }
}
