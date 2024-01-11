package gr.aueb.cf.ch10StructuredProgrammingProjects;

/**
 * Demonstrates various operations on an array of numbers.
 *  Read from a file, including sorting, generating combinations,
 *  and applying filters.
 */
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Project01 {
    public static void main(String[] args) throws FileNotFoundException {
        ArrayList<Integer> numbers = readNumbersFromFile("C:/tmp/list.txt");
        PrintStream ps = new PrintStream("C:/tmp/sortedList.txt");

        int[] numbersArray = new int[numbers.size()];
        for (int i = 0; i < numbers.size(); i++) {
            numbersArray[i] = numbers.get(i);
        }

        numbersArray = mergeSort(numbersArray, 0, numbersArray.length);

        for (int num : numbersArray) {
            ps.print(num + " ");
        }
        ps.println();

        int n = 6;
        int[] row = new int[n];

        generateCombinations(numbers, n, ps, row, 0, 0);
    }

    public static ArrayList<Integer> readNumbersFromFile(String filePath) throws FileNotFoundException {
        Scanner sc = new Scanner(new File(filePath));
        ArrayList<Integer> numbers = new ArrayList<>();

        while (sc.hasNextInt()) {
            numbers.add(sc.nextInt());
        }
        return numbers;
    }

    public static int[] mergeSort (int[] arr, int s, int n) {
        if (s < n - 1) {
            int middle = (n + s) / 2;
            int[] left = mergeSort(arr, s, middle);
            int[] right = mergeSort(arr, middle, n);
            return merge(left,right);
        } else {
            return Arrays.copyOfRange(arr, s, n);
        }
    }


    public static int[] merge (int[] left, int[] right) {
        int[] merged = new int[left.length + right.length];
        int i = 0;
        int j = 0;
        int k = 0;

        while ((i < left.length) && (j < right.length)) {
            if (left[i] > right[j]) {
                merged[k++] = right[j++];
            } else { merged[k++] = left[i++];
            }
        }
        while (i < left.length) {
            merged[k++] = left[i++];
        } while (j < right.length) {
            merged[k++] = right[j++];
        } return merged;
    }

    public static void generateCombinations(ArrayList<Integer> numbers, int n, PrintStream ps, int[] row, int pos, int start) {
        if (pos == n) {
            if (passFilters(row)) {
                printRow(ps, row);
            }
            return;
        }

        for (int i = start; i < numbers.size(); i++) {
            row[pos] = numbers.get(i);
            generateCombinations(numbers, n, ps, row, pos + 1, i + 1);
        }
    }

    public static boolean passFilters(int[] row) {
        if (!moreThanFourEvens(row) && !moreThanFourOdds(row) && !moreThanTwoConsecutive(row) &&
                !moreThanThreeSameEnding(row) && !moreThanThreeSameDecade(row)) {
            return true;
        }
        return false;
    }

    public static void printRow(PrintStream ps, int[] row) {
        for (int i : row) {
            ps.print(i + " ");
        }
        ps.println();
    }

    public static boolean moreThanFourEvens(int[] arr) {
        if (arr == null) return false;
        int evens = 0;
        for (int item : arr) {
            if(item % 2 == 0 ) {
                evens++;
            }
        }
        return evens >= 4;
    }

    public static boolean moreThanFourOdds(int[] arr) {
        if (arr == null) return false;
        int odds = 0;
        for (int item : arr) {
            if(item % 2 !=0) {
                odds++;
            }
        }
        return odds >= 4;
    }

    public static boolean moreThanTwoConsecutive(int[] arr) {
        if (arr == null) return false;
        int cons = 0;
        for (int i = 0; i < arr.length - 2; i++) {
            if ((arr[i] == arr[i + 1] - 1) && (arr[i] == arr[i + 2] - 2)) {
                cons++;
            }
        }
        return cons >= 2;
    }

    public static boolean moreThanThreeSameEnding(int[] arr) {
        if (arr == null) return false;
        int[] endings = new int[10];
        boolean hasSameEndings = false;

        for (int item : arr) {
            endings[item % 10]++;
        }
        for (int item : endings) {
            if (item >= 3) {
                hasSameEndings = true;
                break;
            }
        }
        return hasSameEndings;
    }

    public static boolean moreThanThreeSameDecade(int[] arr) {
        if (arr == null) return false;
        int[] decade = new int[5];
        boolean hasSameDecades = false;

        for (int item : arr) {
            decade[item / 10]++;
        }
        for (int item : decade) {
            if (item >= 3) {
                hasSameDecades = true;
                break;
            }
        }
        return hasSameDecades;
    }
}
