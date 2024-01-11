package gr.aueb.cf.ch2DataTypeInt;

/**
 * Fahrenheit to Celsius Converter.
 */
import java.util.Scanner;

public class FahrenheitToCelsious {
    public static void main(String[] args) {

        //Δήλωση και αρχικοποίηση μεταβλητών
        Scanner in = new Scanner(System.in);
        int farhenheit;
        int celsius;


        //Εντολές
        System.out.println("Please insert the temperature in Fahrenheit");
        farhenheit = in.nextInt();

        celsius = 5 * ( farhenheit - 32) / 9;


        //Εκτύπωση αποτελεσμάτων
        System.out.printf("%d fahrenheit = %d celsius\n" , farhenheit, celsius);
    }
}
