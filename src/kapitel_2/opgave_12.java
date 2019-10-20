package kapitel_2;

import java.util.Scanner;

public class opgave_12 {
    public static void main(String[] args) {
        double acceleration, speed, length;
        Scanner runway_length = new Scanner(System.in);
        System.out.println("Enter speed and acceleration: ");
        speed = runway_length.nextDouble();
        acceleration = runway_length.nextDouble();
        length = Math.pow(speed , 2) / (2 * acceleration);
        System.out.println("The minimum runway length for this airplane is " + length);
    }
}
