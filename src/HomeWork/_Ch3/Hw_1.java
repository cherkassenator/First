package HomeWork._Ch3;

import java.io.IOException;

public class Hw_1 {
    char line;
    int countspase = 0;
    boolean dot;

    {
        dot = true;
    }

    public void CountSpase() throws IOException {

        do {
            System.out.println("Введите строку или символ:");

            do {
                line = (char) System.in.read();

                if (line == ' ') {
                    countspase += 1;
                }

                if (line == '.') {
                    dot = false;
                    break;
                }

            } while (line != '\n');

        } while (dot);

        System.out.println("Количество пробелов: " + countspase);

    }

}
