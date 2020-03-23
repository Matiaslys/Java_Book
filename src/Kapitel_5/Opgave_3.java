package Kapitel_5;

public class Opgave_3 {
    public static void main(String[] args) {
        System.out.printf("%15s    |  %15s\n", "Celsius", "Fahrenheit");
        for (int i = 0; i < 102; i = i+2) {
            System.out.printf("%9d          |  %15.1f\n", i, i  * 9.0/5.0+32.0);
        }
    }
}
