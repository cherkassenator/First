package Other;

public class OtherPrint {
    public static void main(String[] args) {
        double x, y;
        byte b;
        char ch;
        int i;


        x = 10.0;
        y = 3.0;
        i = (int) (x / y);
        System.out.println(i);

        i = 100;
        b = (byte) i;
        System.out.println(i);

        i = 257;
        b = (byte) i;
        System.out.println(b);

        b = 50;
        ch = (char)  b;
        System.out.println(ch);

    }
}
