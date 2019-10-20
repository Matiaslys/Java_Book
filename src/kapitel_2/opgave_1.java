package kapitel_2;

import java.util.Scanner;

public class opgave_1 {
    public static void main(String[] args) {
        Scanner Mile = new Scanner (System.in);
        System.out.print("Enter miles ");
        double mile = Mile.nextDouble();
        double kilometers;
        kilometers = mile * 1.6;
        System.out.println(mile + " miles is " + kilometers + " kilometers");
    }
}
