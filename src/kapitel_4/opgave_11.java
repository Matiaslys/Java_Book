package kapitel_4;

import java.util.Scanner;

public class opgave_11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter binary digits (0000 to 1111)");
        String Binary = scanner.nextLine();

//        if (Binary.length() != 4) {
//            System.out.println("you must enter less than 5 values");
//            System.exit(1);
//        }
        int decimal = Integer.parseInt(Binary,2);
        System.out.println("The decimal value is " + decimal );
    }
}
