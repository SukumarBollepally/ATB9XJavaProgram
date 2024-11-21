package Nov2024.EX15112024_WrapperClass_Exceptions.Exceptions;

public class Lab161_Exceptions1 {

    public static void main(String[] args)  {

        System.out.println("Start of program");

        String ip = null;
        try {
            ip = args[0];
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        int a = 0;
        try {
            a = Integer.parseInt(ip);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        int b = 0;
        try {
            b = 1000 / a;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.println(b);

        System.out.println("End of program");


        //JVM will be Initialized (From RAM)
        //Creates and Starts the main Thread. - Main Called
        //1) Collects the Command Line Arguments - 10
        // String[] args = {10} ->
        // 2) Lab174_Exception.main()
        //Now Control will be transferred from main Thread to main method
        // When problem comes in main -> JVM


    }
}
