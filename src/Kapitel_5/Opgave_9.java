package Kapitel_5;

import java.util.ArrayList;
import java.util.Scanner;

public class Opgave_9 {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        ArrayList<Integer> scores = new ArrayList<>();
        Scanner number = new Scanner(System.in);
        Scanner Name = new Scanner(System.in);
        System.out.println("How many students do you have?");
        int students = number.nextInt();
        System.out.println("You have " + students + " students");
        for (int i = 1; i < students + 1; i++) {
            System.out.println(i + "/" + students);
            System.out.print("Name:");
            String name = Name.nextLine();
            names.add(name);
            System.out.print("Score:");
            int score = number.nextInt();
            scores.add(score);
        }

        //Sort
        if (scores.size() > 1) {
            for (int f = 0; f < scores.size() - 1; f++) {
                for (int i = 1; i < scores.size(); i++) {
                    if (scores.get(i - 1) > scores.get(i)) {
                        int temp = scores.get(i - 1);
                        scores.set(i - 1, scores.get(i));
                        scores.set(i, temp);
                        String backup = names.get(i - 1);
                        names.set(i - 1, names.get(i));
                        names.set(i, backup);
                    }
                }
            }
        }

        System.out.println("Your students, sorted from lowest to highest is:");
        for (int i = 0; i < students; i++) {
            System.out.println("| Name:"+ names.get(i)+"  Score:"+ scores.get(i) + " |");
        }
    }
}
