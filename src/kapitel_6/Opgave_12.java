package kapitel_6;

import java.util.Scanner;

public class Opgave_12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Skriv det første tal:");
        int num1 = scanner.nextInt();
        System.out.print("Skriv det andet tal:");
        int num2 = scanner.nextInt();
        System.out.print("Skriv hvor mange tal der skal være per linje:");
        int numberPerLine = scanner.nextInt();

        printNumbers(num1, num2, numberPerLine);
    }

    public static void  printNumbers(int num1, int num2, int numberPerLine) {
        for (; num1 < num2;) {
            System.out.println();
            for (int j = 0; j < numberPerLine; j++) {
                System.out.print(num1 + " ");
                num1++;
            }
        }
    }
}
