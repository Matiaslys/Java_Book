package Kapitel_5;

import java.util.ArrayList;
import java.util.Scanner;

public class Opgave_9 {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        ArrayList<Integer> scores = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many students do you have?");
        int students = scanner.nextInt();
        System.out.println("You have " + students + " students");
        for (int i = 1; i < students + 1; i++) {
            System.out.println(i + "/" + students);
            System.out.print("Name:");
            // Maybe you dont understand why i use 2 String scanners. It is because when i made this exercise it wouldn't accept a user input if i only wrote 1 scanner.
            // So i wrote the one i dont use first and the one i use second.
//            String yes = scanner.nextLine();
            String name = scanner.nextLine();
            names.add(name);
            System.out.print("Score:");
            int score = scanner.nextInt();
            scores.add(score);
        }
        //Sort
        if (scores.size() > 1) {
            for (int f = 0; f < scores.size() - 1; f++) {
                for (int i = 1; i < scores.size() - i ; i++) {
                    if (scores.get(i - 1) > scores.get(i)) {
                        int temp = scores.get(i - 1);
                        System.out.println(i);
                        scores.set(i - 1, scores.get(i));
                        scores.set(i, temp);
                    }
                }
            }
        }
        System.out.println("Your students, sorted from lowest to highest is:");
        for (int i = 0; i < students; i++) {
            System.out.println("| Name:" + names.get(i) +"  Score:"+ scores.get(i) + " |");
        }
    }
}
