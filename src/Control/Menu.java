package Control;

import View.View;

import java.util.Scanner;

public class Menu {
    public static int menu = 0;

    public static void handleMenu(String command, Scanner scanner) {
        boolean inGame = true;
        while (inGame)
        while (menu == 0) {
            command = scanner.nextLine();
            command = command.toLowerCase();
            if (command.equals("help")) {
                System.out.println("create account [username] : makes an account");
                System.out.println("login [username] : logins your account");
                System.out.println("show leaderboard : shows the account by the number of wins");
                System.out.println("save : saves your info");
                System.out.println("logout : logout your account");
            } else if (command.matches("create account.*")) {
                Account.createAccount(command, scanner);
            } else if (command.matches("login .*")) {
                Account.loginAccount(command, scanner, false);
            } else if (command.equals("show leaderboard")) {
                View.showLeaderboard();
            } else if (command.equals("exit")) {
                return;
            }
        }
        while (menu ==  1){
            int accountMenu = 0;
            command = scanner.nextLine();
            command =  command.toLowerCase();
            if (command.equals("enter collection")){
                accountMenu = 1;
            }
            while (accountMenu == 1){

            }
        }
    }
    public static void increaseMenu(){
        menu++;
    }
    public static void decreaseMenu(){
        menu--;
    }
}
