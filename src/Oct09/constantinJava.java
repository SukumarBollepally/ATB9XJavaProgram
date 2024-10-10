package Oct09;

public class constantinJava {
    public static void main(String[] args) {
        final int a = 4;
       // a = 5;   we cannot  change the varaible value which is final within the program again(constant)
        System.out.println(a);
        System.out.println("a is the final value which is constant");
        char grade = 'A';
        grade = 'B';
        System.out.println(grade);
        final float PI = 3.14f;
         System.out.println(PI);
       // PI = 10; This is not possible

        //- Special variable whose **value can't be modified during the program execution.**
        //- One created and SET THE VALUE , we will not able to modify.
        //- PI - 3.14 , this value should be change during the execution of the program.
        //- Constant is also called as **final** variable
        //If you try to change the value - `java: cannot assign a value to final variable PI`
        //
        //
        //
        //**Rule : Default value of the Local variable is not assigned by the JVM. (Error)**
    }
}
