package Control;

import Control.Match.Match;
import Control.Match.Mode1;
import Control.Match.Mode2;
import Control.Match.Mode3;

import java.util.Scanner;

public class Main {
    public static int menu = 0;
    public static void main(String[] args) {
        Shop.createShop();
        Mode1 mode1;
        Mode2 moode2;
        Mode3 mode3;
        Scanner scanner = new Scanner(System.in);
        String command = null;
        Menu.handleMenu(command, scanner);
//        while (inMainMenu) {
//            System.out.println(Account.getIndexOfLogined());
//            if (Account.getIndexOfLogined() != -1){
//                if (Account.handleLogin(command, scanner) == 1){
//                    Match.createMatch(command, scanner);
//                }
////                Account.handleLogin(command);
//                continue;
//            }
//            command = scanner.nextLine();
//            command = command.trim();
//             if (Account.handleEvent(command, scanner))
//                inMainMenu = false;
//        }
    }
}
