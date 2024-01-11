package gr.aueb.cf.ch2DataTypeInt;

import java.util.Scanner;

/**
 * Demonstrates the Date.
 */
public class DateApp {
    public static void main(String[] args) {

        //Δήλωση και αρχικοποίηση μεταβλητών
        Scanner in = new Scanner(System.in);
        int day;
        int month;
        int year;

        //Εντολές
        System.out.println("Please insert date");
        day = in.nextInt();
        month = in.nextInt();
        year = in.nextInt();

        // Εμφάνιση αποτελεσμάτων
        System.out.printf("%02d/ %02d/ %02d\n", day, month, year%100);
    }
}
