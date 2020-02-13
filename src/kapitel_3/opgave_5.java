package kapitel_3;

import java.util.Scanner;

public class opgave_5 {
    public static void main(String[] args) {
        String Now = null;
        String future = null;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter today's day: ");
        int now = scanner.nextInt();
        System.out.print("Enter the number of days elapsed since today: ");
        int Future = scanner.nextInt();
        if (now == 0) {
            Now = "Sunday";
        }
        if (Future == 0) {
            future = "Sunday";
        }
        if (now == 1) {
            Now = "Monday";
        }
        if (Future == 1) {
            future = "Monday";
        }
        if (now == 2) {
            Now = "Tuesday";
        }
        if (Future == 2) {
            future = "Tuesday";
        }
        if (now == 3) {
            Now = "Wednesday";
        }
        if (Future == 3) {
            future = "Wednesday";
        }
        if (now == 4) {
            Now = "Thursday";
        }
        if (Future == 4) {
            future = "Thursday";
        }
        if (now == 5) {
            Now = "Friday";
        }
        if (Future == 5) {
            future = "Friday";
        }
        if (now == 6) {
            Now = "Saturday";
        }
        if (Future == 6) {
            future = "Saturday";
        }
        System.out.println("Today is "+ Now +" and the future day is "+ future +".");
    }
}
