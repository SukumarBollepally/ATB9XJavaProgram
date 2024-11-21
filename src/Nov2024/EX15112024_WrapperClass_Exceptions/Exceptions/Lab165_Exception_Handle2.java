package Nov2024.EX15112024_WrapperClass_Exceptions.Exceptions;

public class Lab165_Exception_Handle2 {

    public static void main(String[] args) {

            int c = 0;
            int b = 0;
            try {
                b = 10/c;
            } catch (Exception e) {
                System.out.println(e.getMessage());
                e.printStackTrace();
            }
            System.out.println(b);
        }
    }

