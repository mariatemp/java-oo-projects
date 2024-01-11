package gr.aueb.cf.ch7Strings;

import java.util.Scanner;

public class DecryptApp {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Enter a String to decrypt");

        String s = in.nextLine();
        StringBuilder decryptedStr = new StringBuilder();

        for (int i = s.length() -1; i > 0; i--) {
            char ch = s.charAt(i);
            char decryptedChar = (char) (ch - 1);

            decryptedStr.append(decryptedChar);
        }
        System.out.println("String: " + s);
        System.out.println("Decrypted String: " + decryptedStr.toString());
        in.close();
    }
}
