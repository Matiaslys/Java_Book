package kapitel_3;

import java.util.Random;
import java.util.Scanner;

public class opgave_14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        // random generator
        int Coin = random.nextInt(2);
        System.out.println("Write 0 for heads and 1 for tails");
        System.out.print("Guess the coin, was it head or tails");
        // user input
        int Guess = scanner.nextInt();
        // correct/ incorrect
        if (Coin == Guess){
            System.out.println("correct");
        }
        else {
            System.out.println("incorrect");
        }
    }
}
