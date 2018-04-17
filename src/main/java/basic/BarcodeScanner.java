package basic;

import java.util.Scanner;

public class BarcodeScanner {

    static Scanner scanner;

    public static String getInput() {

        scanner = new Scanner(System.in);
        System.out.println("Enter products bar code");
        return scanner.next();
    }

    public static void consoleMessage(String message) {
        System.out.println(message);
    }
}
