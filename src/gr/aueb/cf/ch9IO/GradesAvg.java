package gr.aueb.cf.ch9IO;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

public class GradesAvg {
    public static void main(String[] args) {
        String line = " ";
        String [] students;

        File dir = new File ("C:/tmp/primOut.txt");


        if (!dir.exists()) {
            boolean success = dir.mkdir();
            if (!success) {
                System.err.println("Error in making dir");
                System.exit(1);
            }
        }

        try (BufferedReader bf = new BufferedReader(new FileReader("C:/tmp/grades.txt"));
             PrintStream psPrimOut = new PrintStream(new FileOutputStream("C:/tmp/primOut.txt"));
             PrintStream psLog = new PrintStream(new FileOutputStream("C:/tmp/log.txt"))) {

            while ((line = bf.readLine()) != null) {
                students = line.split(" ");
                studentProcess(students, psPrimOut, psLog);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static double avg(int grade1, int grade2) {
        return (grade1 + grade2) / 2.0;
    }

    public static boolean isValid(int grade) {
        return grade >= 0 && grade <= 10;
    }

    public static void studentProcess(String[] students, PrintStream psPrimOut, PrintStream pslog) {
        if (students.length == 4) {
            String firstname = students[0];
            String lastname = students[1];
            int grade1 = Integer.parseInt(students[2]);
            int grade2 = Integer.parseInt(students[3]);

            if (isValid(grade1) && isValid(grade2)) {
                double average = avg(grade1,grade2);
                printResults(psPrimOut, firstname, lastname, average);
            } else {
                logError(pslog, "Μη έγκυρος βαθμός: " + Arrays.toString(students));
            }
        } else {
            logError(pslog, "Μη έγκυρη καταχώρηση μαθητή: " + Arrays.toString(students));
        }
    }

    public static void printResults (PrintStream ps, String firstname, String lastname, double average) {
        ps.println(firstname + " " + lastname + " " + average);
    }

    public static void logError(PrintStream ps, String errorMsg) {
        ps.println(errorMsg);
    }
}
