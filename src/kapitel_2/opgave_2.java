package kapitel_2;

import java.util.Scanner;

public class opgave_2 {
    public static void main(String[] args) {
        Scanner Length = new Scanner(System.in);
        System.out.println("Enter length of the sides ");
        double length = Length.nextDouble();
        System.out.println("Enter height of the Equilateral ");
        double height = Length.nextDouble();
        double area = Math.sqrt(3)/4 * (Math.pow(length , 2));
        double volume = area * height;
        System.out.println("The area is " + area);
        System.out.println("The volume of the Triangular prism is " + volume);
    }
}
