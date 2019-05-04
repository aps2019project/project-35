package Control.Match;

import Control.Account;
import Model.Spell;

import java.util.ArrayList;
import java.util.Scanner;

public abstract class Match {
    private static int mode = 0;
    public static Mode1 mode1;
    public static Mode2 mode2;
    public static Mode3 mode3;
    private Account firstAccount;
    private Account secondAccount;
    private int turn = 0;
    private Square[][] squares = new Square[5][9];
    ArrayList<Spell> activeSpells;

    public Match(Account firstAccount, Account secondAccount) {
        this.firstAccount = firstAccount;
        this.secondAccount = secondAccount;
    }

    public static void createMatch(String command, Scanner scanner) {
        boolean inCreatingMatchMenu = true;
        while (inCreatingMatchMenu) {
            command = scanner.nextLine();
            if (command.equals("help")) {
                System.out.println("single player : play with computer");
                System.out.println("multi player : play with another account");
            } else if (command.matches("select user .*")) {
                command = command.substring(12);
                command = scanner.nextLine();
                if (Account.loginAccount(command, scanner, true)) {
                    System.out.println("please select a mode for playing");
                    System.out.println("1 : if a team's hero die, you lose !");
                    System.out.println("2 : you have to pick the flag ! ");
                    System.out.println("3 : you have to pick half of the flags");
                    command = scanner.nextLine();
                    if (Integer.parseInt(command) == 1) {
                        mode1 = new Mode1(Account.getAccounts().get(Account.getIndexOfLogined())
                                , Account.getAccounts().get(Account.getIndexOfSecondPlayer()));
                        mode = 1;
                    }
                }
            }
        }
    }

    public Account whoseTurn() {
        if (turn % 2 == 0) {
            return firstAccount;
        }
        return secondAccount;
    }

    public Account enemy() {
        if (turn % 2 == 0) {
            return secondAccount;
        }
        return firstAccount;
    }

    public static void handleMatch(Match match) {

    }

    public Square[][] getSquares() {
        return squares;
    }

    public int getMode() {
        return mode;
    }
}
