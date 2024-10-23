package Oct16102024_Scanner_Class;

public class lab022_Max_Of_Two_Numbers_Using_Command_line_arguments {

    public static void main(String[] args) {

        if (args.length != 2) {
            System.out.println("Could you please provide the exact number of arguments to run the program");
            return;
        }

        try {
            int x = Integer.parseInt(args[0]);
            int y = Integer.parseInt(args[1]);

            if (x > y) {
                System.out.println("x is greater than y");

            } else {
                System.out.println("y is greater than x");
            }
        } catch (NumberFormatException e) {
            System.out.println("Please provide valid intigers in the arguments:");
        }
    }
}
