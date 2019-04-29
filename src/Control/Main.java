package Control;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean InMainMenu = true;
        while (InMainMenu) {
            Scanner scanner = new Scanner(System.in);
            String command = scanner.nextLine();
            command = command.trim();
            Account.handleEvent(command);
        }
    }
}
