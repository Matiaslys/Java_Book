package kapitel_2;

import java.util.Scanner;

public class opgave_17 {
    public static void main(String[] args) {
        double twc, ta, v;
        Scanner temperature = new Scanner(System.in);
        System.out.println("Enter the temperature in Fahrenheit between -58F and 41F: ");
        ta = temperature.nextDouble();
        System.out.println("Enter the wind speed (> = 2) in miles per hour: ");
        v = temperature.nextDouble();

        twc = 35.74 + 0.6215 * ta - 35.75 * Math.pow(v, 0.16) + 0.4275 * ta * Math.pow(v, 0.16);
        System.out.println("The wind chill index is " + twc);
    }
}
