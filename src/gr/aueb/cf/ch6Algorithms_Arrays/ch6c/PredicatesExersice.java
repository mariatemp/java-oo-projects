package gr.aueb.cf.ch6Algorithms_Arrays.ch6c;

import java.util.Scanner;

public class PredicatesExersice {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Εισάγετε 6 αριθμούς από το 1 έως το 49");

        int[] num = new int[6];
        for (int i = 0; i < 6; i++) {
            int input = in.nextInt();

            if (input < 1 || input > 49) {
                System.out.println("Μη εγκυρος αριθμός");
                i--;
            } else {
                num[i] = input;
            }
        }


        if (checkFilter(num)) {
            System.out.println("Οι αριθμοί πληρούν τα φίλτρα");
        } else {
            System.out.println("Οι αριθμοί δεν πληρούν τα φίλτρα");
        }
    }

    public static boolean checkFilter(int[] num) {
        return numEven(num) &&
                numOdd(num) &&
                lessThanThreeConsecutive(num) &&
                lessThanThreeSameEnding(num) &&
                lessThanThreeSameDecade(num);
    }


    public static boolean numEven(int[] arr) {
        if (arr == null) return false;
        int evens = 0;

        for (int item : arr) {
            if (item % 2 == 0) {
                evens++;
            }
        }
        return evens <= 3;
    }

    public static boolean numOdd(int[] arr) {
        if (arr == null) return false;
        int odds = 0;

        for (int item : arr) {
            if (item % 2 != 0) {
                odds++;
            }
        }
        return odds <=3;
    }

    public static boolean lessThanThreeConsecutive (int[] arr) {
        if (arr == null) return false;
        int num = 0;

        for (int i = 0; i < arr.length - 1; i++) {
            if ((arr[i] == arr[i+1] -1)) {
                num++;
            }
        }
        return num <= 3;
    }


    public static boolean lessThanThreeSameEnding(int[] arr) {
        if (arr == null) return false;
        int[] endings = new int[10];
        boolean hasSameEndings = false;

        for(int item : arr) {
            endings[item % 10] ++;
        }
        for (int item : endings) {
            if (item <=3) {
                hasSameEndings = true;
                break;
            }
        }
        return hasSameEndings;
    }

    public static boolean lessThanThreeSameDecade(int[] arr) {
        if (arr == null) return false;
        int[] decades = new int[5];
        boolean hasSameDecades = false;

        for(int item : arr) {
            decades[item / 10] ++;
        }

        for (int item : decades) {
            if (item <= 3) {
                hasSameDecades = true;
                break;
            }
        }
        return hasSameDecades;
    }
}
