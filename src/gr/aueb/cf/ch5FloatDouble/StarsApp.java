package gr.aueb.cf.ch5FloatDouble;

import java.util.Scanner;

public class StarsApp {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Please insert size of table (*): ");
        int num = in.nextInt();
        print(num);
    }

    public static void print(int n){
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}
