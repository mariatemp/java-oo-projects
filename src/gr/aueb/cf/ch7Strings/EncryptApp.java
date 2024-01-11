package gr.aueb.cf.ch7Strings;

import java.util.Scanner;

public class EncryptApp {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Enter a string to encrypt");

        String s = in.nextLine();
        StringBuilder encryptedStr = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            char encryptedChar = (char) (ch + 1);
            encryptedStr.append(encryptedChar);
        }
        System.out.println("String: " + s);
        System.out.println("Encrypted String: " + encryptedStr.toString());
        in.close();
    }
}
