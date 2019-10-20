package kapitel_2;

import java.util.Scanner;

public class opgave_23 {
    public static void main(String[] args) {
        double distance, miles, price, cost;
        Scanner driving = new Scanner(System.in);
        System.out.println("Enter the driving distance: ");
        distance = driving.nextDouble();
        System.out.println("Enter miles per gallon: ");
        miles = driving.nextDouble();
        System.out.println("Enter price per gallon: ");
        price = driving.nextDouble();

        cost = (distance / miles) * price;

        System.out.println("The cost of driving is $" + cost);
    }

}
