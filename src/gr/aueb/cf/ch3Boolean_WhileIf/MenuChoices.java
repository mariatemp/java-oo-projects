package gr.aueb.cf.ch3Boolean_WhileIf;

import java.util.Scanner;

/**
 * Εμφανίζει ένα μενού όπου
 * ο χρήστης επιλέγει από το 1-5 και
 * εμφανίζεται το ανάλογο feedback.
 */
public class MenuChoices {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice = 0;

        do {
            System.out.println("Επιλέξτε ένα από τα παρακάτω:");
            System.out.println("1.Εισαγωγή");
            System.out.println("2.Διγραφή");
            System.out.println("3.Ενημέρωση");
            System.out.println("4.Αναζήτηση");
            System.out.println("5.Έξοδος");

            choice = scanner.nextInt();


            if (choice == 1) {
                System.out.println("Επιλέξατε Εισαγωγή");
            }
            if (choice == 2) {
                System.out.println("Επιλέξατε Διαγραφή");
            }
            if (choice == 3) {
                System.out.println("Επιλέξατε Ενημέρωση");
            }
            if (choice == 4) {
                System.out.println("Επιλέξατε Αναζήτηση");
            }
            if (choice == 5) {
                System.out.println("Επιλέξατε Έξοδο");
            }
            if (choice <= 0 || choice >5 ) {
                System.out.println("Μη έγκυρος αριθμός");
            }

        } while  (choice != 5);
    }
}
