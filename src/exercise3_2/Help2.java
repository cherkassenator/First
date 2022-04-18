package exercise3_2;

import java.io.IOException;

public class Help2 {
    char choisea, ignore;
    public void mHelp() throws IOException {
        do {
            System.out.println("Справка:");
            System.out.println("1. IF");
            System.out.println("2. SWITCH");
            System.out.println("3. FOR");
            System.out.println("4. WHILE");
            System.out.println("5. DO-WHILE");
            System.out.println("Выберите раздел:");

            choisea = (char) System.in.read();

            do {
                ignore = (char) System.in.read();
            } while (ignore != '\n');

        } while (choisea < '1' | choisea > '5');


        SwitchAnswer(choisea);

    }

    private void SwitchAnswer(char choisea){

        switch (choisea) {
            case '1' :
                System.out.println("Оператор if:\'n");
                System.out.println(" if(условие) оператор;");
                System.out.println(" else(условие) оператор;");
                break;
            case '2' :
                System.out.println("Оператор switch:\'n");
                System.out.println("switch (выражение) {");
                System.out.println(" case константа:");
                System.out.println(" последовательность операторов");
                System.out.println(" break;");
                System.out.println(" // ...");
                System.out.println("}");
                break;
            case '3' :
                System.out.println("Оператор for:\'n");
                System.out.println("for (инициализация; условие; итерация)");
                System.out.println("оператор;");
                break;
            case '4' :
                System.out.println("Оператор while:\'n");
                System.out.println("while (условие) оператор;");
                break;
            case '5' :
                System.out.println("Оператор do-while:\'n");
                System.out.println("do {");
                System.out.println(" оператор;");
                System.out.println("} while (условие);");
                break;
        }
    }
}
