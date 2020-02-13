package kapitel_3;

import java.util.Scanner;

public class opgave_6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter wight in pounds:");
        double pounds = scanner.nextDouble();
        System.out.print("Enter feet:");
        double feet = scanner.nextDouble();
        System.out.print("Enter inches:");
        double inches = scanner.nextDouble();

        // calculate
        double height = feet * 12 + inches;
        double bmi = ((705 * pounds) / height) /height;
        // I used this homepage to see how to calculate BMI https://www.sharecare.com/health/body-mass-index-bmi/how-body-mass-index-calculated.

        //Result
        System.out.println("BMI is " + bmi);
        if (bmi < 18.5)
            System.out.println("Underweight");
        else if (bmi < 25)
            System.out.println("Normal");
        else if (bmi < 30)
            System.out.println("Overweight");
        else
            System.out.println("Obese");
    }
}
