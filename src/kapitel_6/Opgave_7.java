package kapitel_6;

import java.util.Scanner;

public class Opgave_7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Scanner tal = new Scanner(System.in);
        System.out.print("Investeringsbeløb: ");
        double investmentAmount = scanner.nextDouble();
        System.out.print("Månedsly rentesats: ");
        double monthlyInterestRate = scanner.nextDouble() / 12;
        // dette er kode jeg har taget ud for at lave sidste del af projektet fordi jeg brugte det til at se om min kode virkede
//        System.out.print("År: ");
//        int years =  tal.nextInt();

//        System.out.println(futureInvestmentValue(investmentAmount, monthlyInterestRate, years));

        for (int i = 0; i < 30; i++) {
            System.out.println(futureInvestmentValue(investmentAmount, monthlyInterestRate, i));
        }

    }

    public static double futureInvestmentValue(double investmentAmount, double monthlyInterestRate, int years){
        return investmentAmount * Math.pow(1 + monthlyInterestRate, years * 12);
    }

}
