package gr.aueb.cf.ch4Char_ForSwitch;

import java.util.Scanner;

public class HorizontalStars {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Please insert the number of stars (*): ");

        int num = in.nextInt();
        print(num);
    }

    public static void print(int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(" * ");
        }
    }
}
