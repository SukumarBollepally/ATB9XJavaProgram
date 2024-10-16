package Oct16;

public class UserInputusingArgument {

    public static void main(String[] args) {

        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        System.out.println((a>b) ? "a is greater than b": "b is greater than a");
    }
}
