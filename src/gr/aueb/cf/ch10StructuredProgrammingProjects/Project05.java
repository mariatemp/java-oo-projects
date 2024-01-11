package gr.aueb.cf.ch10StructuredProgrammingProjects;

import java.util.Scanner;

/**
 * Manages seat reservations in a venue
 * with specified rows and columns.
 */
public class Project05 {
    public static int rows = 30;
    public static int cols = 12;
    public static boolean[][] seats = new boolean[rows][cols];

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {

            System.out.println("Επιλέξτε ενέργεια:");
            System.out.println("1. Κράτηση");
            System.out.println("2. Ακύρωση");
            System.out.println("3. Έξοδος");

            int choice = scanner.nextInt();

            if (choice == 3) {
                System.out.println("Έξοδος από το πρόγραμμα. Ευχαριστούμε!");
                break;
            }

            System.out.print("Εισάγετε τη στήλη (A-L): ");
            char col = scanner.next().charAt(0);
            System.out.print("Εισάγετε τη σειρά (1-30): ");
            int row = scanner.nextInt();

            if (choice == 1) {
                book(col, row);
            } else if (choice == 2) {
                cancel(col, row);
            } else {
                System.out.println("Μη έγκυρη επιλογή.");
            }
        }
    }

    public static void book(char col, int row) {
        int colIndex = col - 'A';

        if (isValidSeat(colIndex, row)) {
            if (!seats[row - 1][colIndex]) {
                seats[row - 1][colIndex] = true;
                System.out.println("Επιτυχής κράτηση θέσης: " + col + row);
            } else {
                System.out.println("Η θέση " + col + row + " είναι ήδη κρατημένη.");
            }
        } else {
            System.out.println("Μη έγκυρη θέση");
        }
    }

    public static void cancel(char col, int row) {
        int colIndex = col - 'A';

        if (isValidSeat(colIndex, row)) {
            if (seats[row - 1][colIndex]) {
                seats[row - 1][colIndex] = false;
                System.out.println("Ακύρωση κράτησης θέσης: " + col + row);
            } else {
                System.out.println("Η θέση " + col + row + " δεν είναι κρατημένη.");
            }
        } else {
            System.out.println("Μη έγκυρη θέση");
        }
    }

    public static boolean isValidSeat(int col, int row) {
        return row >= 1 && row <= rows && col >= 0 && col < cols;
    }
}
