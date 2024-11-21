package Nov2024.EX14112024_Static_Enum;

public class Lab155_ENUM_Example2 {

    public static void main(String[] args) {

        System.out.println(Color.RED.getHexcode());

        if (Color.GREEN.getHexcode() == "#61FF33") {
            System.out.println("Color is Green");
        }


    }

}

enum Color{
    RED("#FF0000"),
    GREEN("#61FF33"),
    BLUE("#3377FF"),
    YELLOW("#4477FF");



    private String hexcode;

    Color(String hexcode){
        this.hexcode = hexcode;
    }

    String getHexcode() {
        return this.hexcode;
    }


}