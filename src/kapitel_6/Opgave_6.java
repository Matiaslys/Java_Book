package kapitel_6;

import java.util.Scanner;

public class Opgave_6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter line number: ");
        int lineNumber = scanner.nextInt();

        displayPattern(lineNumber);
    }

    public static void displayPattern(int n) {
        for (int row = 1; row <= n; row++) {
            // Print numbers
            for (int i = 1; i <= row; i++)
                System.out.print(" " + i);

            System.out.println();

        }

    }
}
