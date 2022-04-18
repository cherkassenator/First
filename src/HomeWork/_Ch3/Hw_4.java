package HomeWork._Ch3;

public class Hw_4 {

    public static void main(String[] args) throws java.io.IOException {
        int i;
/*
//task 4
        for (i = 10; i >= 0; i -=2){
            System.out.println(i);
        }

//task 8
        for (i = 0; i < 10; i++){
            System.out.print(i + " ");
            if((i%2) == 0) {
                continue;
            }
            System.out.println();
        }

//task 9
        for (i = 1; i <= 100; i+=i){
            System.out.print(i + " ");
        }

*/
//task 10
        char ch;
        String str = "";
        boolean dot = false;

        do {

            int counter = 0;
            System.out.println("Введите символы: ");

            do {
                ch = (char) System.in.read();

                if (ch >= 65 & ch <= 90) {
                    ch = (char) ((char) ch + 32);
                    counter = counter + 1;
                } else if (ch >= 97 & ch <= 122) {
                    ch = (char) ((char) ch - 32);
                    counter = counter + 1;
                }

                str = str + ch;

                if (ch == '.') {
                    dot = true;
                }

            } while (ch != '\n');

            System.out.println(str);
            System.out.println("Количество преобразований: " + counter);
        } while (dot);
    }
}
