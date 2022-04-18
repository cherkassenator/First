package Other;

import java.io.IOException;

public class Other3 {

    public static void main(String[] args) throws IOException {

        char ch, answer;
        answer = 'S';

        do {
            System.out.println("Задумана буква в диапазоне A-Z");
            System.out.println("Порробуйте угадать её.");
            ch = (char) System.in.read();
        } while (ch != answer);

        System.out.println("Правильно!");
    }
}
