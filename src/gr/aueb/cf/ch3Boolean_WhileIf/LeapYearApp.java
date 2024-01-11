package gr.aueb.cf.ch3Boolean_WhileIf;

import java.util.Scanner;

/**
 *Δίνει ο χρήστης ένα έτος και εμφανίζεται εάν
 * είναι δίσεκτο ή όχι.
 */
public class LeapYearApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputNum = 0;
        boolean isLeap = false ;

        System.out.println("Please insert year: ");
        inputNum = scanner.nextInt();

        if (inputNum % 4 == 0 && (inputNum % 100 != 0 || inputNum %400 == 0)) {
            System.out.println("Δίσεκτο Έτος");
            isLeap = true;
        } else {
            System.out.println("Δεν είναι δίσεκτο έτος");}

    }
}
