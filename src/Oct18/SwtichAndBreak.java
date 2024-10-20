package Oct18;

import java.util.Scanner;

public class SwtichAndBreak {
    public static void main(String[] args) {
/*
        Disadvantage - (if else)

        1. If we have multile condition - if else - complex.
        2. Break and Continue keywords - can't be used with the if and else.
### Switch Statement
        - Multiple Condition or statements.
                - Java switch statement executes one statement from multiple conditions.
                - Java switch expressions must be of** byte, short, int, long(with its Wrapper type), enums and String**.
        - Beginning with JDK7, it also works with enumerated types.
                -  The value for a case must be constant or literal. **Variables are not allowed.**


#### Syntax - Switch statement
        switch(expression)

`{`

` // case statements`

` // values must be of same type of expression`

` case value1 : expression = value 1 -> `

` // Statements`

` break; // break is optional`

` case value2 :`

` // Statements`

` break; // break is optional`

`default:`

`break;`

`}`


    }
}


 */

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Year from 1 to 12");
        int Month = sc.nextInt();
        switch (Month) {
            case 1:
                System.out.println("January");
                break;
            case 2:
                System.out.println("Febraury");
                break;
            case 3:
                System.out.println("March");
                break;
            case 4:
                System.out.println("April");
                break;
            case 5:
                System.out.println("May");
                break;
            case 6:
                System.out.println("June");
                break;
            case 7:
                System.out.println("July");
                break;
            case 8:
                System.out.println("August");
            case 9:
                System.out.println("September");
            case 10:
                System.out.println("October");
            case 11:
                System.out.println("November");
            case 12:
                System.out.println("December");
            default:
                System.out.println("No Idea, what Month it is!");
                break;
        }
        sc.close();
    }
}