package kapitel_4;

import java.util.Scanner;

public class opgave_23 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter employee's name: ");
        String Name = scanner.nextLine();
        System.out.print("Enter number of hours worked in a week: ");
        double hours = scanner.nextDouble();
        System.out.print("Enter hourly pay rate: ");
        double pay_rate = scanner.nextDouble();
        System.out.print("Enter federal tax withholding rate: ");
        double frate = scanner.nextDouble();
        System.out.print("Enter state tax withholding rate: ");
        double srate = scanner.nextDouble();
        double Gross_Pay = hours * pay_rate;
        double Frate = (frate*100)/100 * Gross_Pay;
        double Srate = (srate*100)/100 * Gross_Pay;
        System.out.println("Employee Name: " + Name);
        System.out.println("Hours Worked: " + hours);
        System.out.println("Pay Rate: " + pay_rate);
        System.out.println("Gross Pay:" + Gross_Pay);
        System.out.println("Deductions:");
        System.out.println("  Federal Withholding (" +frate * 100+"%): " + Frate);
        System.out.println("  State Withholding (" +srate * 100+ "%): " + Srate);
        double Total = Frate + Srate;
        System.out.println("  Total Deduction: " + Total);
        double pay = Gross_Pay - Total;
        System.out.println("Net Pay: " + pay);
    }
}
