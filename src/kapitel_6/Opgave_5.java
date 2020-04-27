package kapitel_6;

import java.util.Scanner;

public class Opgave_5 {


    public static String Rækkefølge(double first, double second, double third) {
        double mindst = 0;
        double mellem = 0;
        double størst = 0;

        if (first > second && first > third){
            størst = first;
            if (second > third) {
                mellem = second;
                mindst = third;
            } else {
                mellem = third;
                mindst = second;
            }
        }

        if (second > first && second > third){
            størst = second;
            if (first > third) {
                mellem = first;
                mindst = third;
            } else {
                mellem = third;
                mindst = first;
            }
        }

        if (third > first && third > second){
            størst = third;
            if (first > second) {
                mellem = second;
                mindst = first;
            } else {
                mellem = first;
                mindst = second;
            }
        }



        return "" + størst + " " + mellem + " " + mindst;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double first = scanner.nextDouble();
        double second = scanner.nextDouble();
        double third = scanner.nextDouble();

        System.out.println("Dine tal i rækkefølge er " + Rækkefølge(first,second,third));


    }
}
