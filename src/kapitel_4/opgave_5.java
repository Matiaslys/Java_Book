package kapitel_4;

import java.util.Scanner;

public class opgave_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of sides: ");
        double NumberOfSides = scanner.nextDouble();
        System.out.print("Enter the side: ");
        double LengthOfSides = scanner.nextDouble();
        double Area = ((NumberOfSides * (LengthOfSides * LengthOfSides)) / (4 * Math.tan(Math.PI/NumberOfSides)));
        System.out.println("The area of the polygon is " + Area);
    }
}
