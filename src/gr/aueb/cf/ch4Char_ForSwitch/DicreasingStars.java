package gr.aueb.cf.ch4Char_ForSwitch;

import java.util.Scanner;

public class DicreasingStars {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Please insert number of stars: ");
        int num = in.nextInt();
        print(num);
    }

    public static void print(int n) {
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j<= i; j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}