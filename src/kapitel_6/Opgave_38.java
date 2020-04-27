package kapitel_6;

import java.util.Random;
import java.util.Scanner;

public class Opgave_38 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);



//        for (int i = 0; i < 200; i++) {
//            char c = (char) (random.nextInt(26) + 'a');
//            char f = Character.toUpperCase(c);
//            System.out.println(f);
//        }

        System.out.print("Skriv hvor mange tal der skal være per linje: ");
        int numberPerLine = scanner.nextInt();

        printCharAndNumbers(numberPerLine);
    }

    public static void  printCharAndNumbers(int numberPerLine) {
        Random random =  new Random();
        for (int i = 0; i < 20; i++) {
            System.out.println();
            for (int j = 0; j < numberPerLine; j++) {
                char c = (char) (random.nextInt(26) + 'a');
                char f = Character.toUpperCase(c);
                System.out.print(f + " ");
            }
        }
        System.out.println("\n\n\n");
        for (int i = 0; i < 20; i++) {
            System.out.println();
            for (int j = 0; j < numberPerLine; j++) {
                int c =  random.nextInt(10);
                System.out.print(c + " ");
            }
        }
        System.out.println("\n");
    }

}
