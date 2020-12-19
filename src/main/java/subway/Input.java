package subway;

import java.util.Scanner;

public class Input {
    private static Scanner scanner;

    public static void init(Scanner sc) {
        scanner = sc;
    }

    public static String getUserInput() {
        return scanner.next();
    }
}
