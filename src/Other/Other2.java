package Other;

import java.io.IOException;

public class Other2 {

    public static void main(String[] args) throws IOException {

        char ch;

        System.out.println("Нажмите клавишу:");

        ch = (char) System.in.read();

        System.out.println("Нажата клавиша: " + ch);


    }
}
