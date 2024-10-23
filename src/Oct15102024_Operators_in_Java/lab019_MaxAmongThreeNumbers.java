package Oct15102024_Operators_in_Java;

public class lab019_MaxAmongThreeNumbers {

    public static void main(String[] args) {

        //result = condition1 ? expression1 : (condition2 ? expression2 : expression3);

        int a = 100;
        int b = 50;
        int c = 30;

        String max_among_three_numbers;

        max_among_three_numbers = (a > b) ? ((a > c) ? "a is greater than c and b" : "c is greater than a") : ((b > c) ? "b is greater than c" : "c is greater than b and a");

        System.out.println(max_among_three_numbers);
         //maximum among three numbers using Math.max mehtod an alternate to nested ternory operatory
        int Maths_marks = 98;
        int Physics_marks = 97;
        int chemistry_marks = 99;
        // alternate method using Math.max mehtod
        int max_number = Math.max(Math.max(Maths_marks,Physics_marks),chemistry_marks);
        System.out.printf("Maximum marks scored by Sukumar in subjects is  %d", max_number );
    }
}
