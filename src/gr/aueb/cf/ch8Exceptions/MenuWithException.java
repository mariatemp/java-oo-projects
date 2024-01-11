package gr.aueb.cf.ch8Exceptions;

import java.util.Scanner;

public class MenuWithException {
    public static void main(String[] args) {
        int userChoice;

        do {
            menu();
            userChoice = getChoice();

            try {
                printChoice(userChoice);
            } catch (IllegalArgumentException e) {
                System.out.println("Σφάλμα: " + e.getMessage());
                System.out.println("Παρακαλώ επιλέξτε έναν αριθμό από το 1 έως το 5");
            }
        } while (userChoice != 5);
    }

    public static void menu() {
        System.out.println("Επιλέξτε μία επιλογή: ");
        System.out.println("1. Επιλογή 1");
        System.out.println("2. Επιλογή 2");
        System.out.println("3. Επιλογή 3");
        System.out.println("4. Επιλογή 4");
        System.out.println("5. Έξοδος");
    }

    public static int getChoice() {
        Scanner in = new Scanner(System.in);

        while (true) {
            System.out.println("Εισάγετε τον αριθμό της επιλογής σας");

            if(in.hasNextInt()) {
                int choice = in.nextInt();
                in.nextLine();
                if(choice >= 1 && choice <=5){
                    return choice;
                } else {
                    System.out.println("Μη έγκυρη επιλογή");
                }
            } else {
                System.out.println("Μη έγκυρη είσοδος");
                in.nextLine();
            }
        }
    }

    public static void printChoice(int choice) {
        if(choice >= 1 && choice <= 4) {
            System.out.println("Επιλέξατε την επιλογή: " + choice);
        }else if (choice == 5) {
            System.out.println("Έξοδος από το πρόγραμμα");
        } else {
            throw new IllegalArgumentException("Μη έγκυρη επιλογή: " + choice);
        }
    }
}
