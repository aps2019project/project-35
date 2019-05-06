package Control.Match;

import Control.Account;
import Model.Card;
import Model.Minion;
import Model.Soldier;
import Model.Spell;
import View.View;

import java.util.ArrayList;
import java.util.Scanner;

public abstract class Match {
    private static boolean matchIsOn = false;
    private static int mode = 0;
    public static Mode1 mode1;
    public static Mode2 mode2;
    public static Mode3 mode3;
    private static Match match;
    private Account firstAccount;
    private Account secondAccount;
    private int turn = 0;
    private Square[][] squares = new Square[5][9];
    ArrayList<Spell> activeSpells;

    public Match(Account firstAccount, Account secondAccount) {
        this.firstAccount = firstAccount;
        this.secondAccount = secondAccount;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 9; j++) {
                squares[i][j] = new Square();
            }
        }
    }

    public static void createMatch(String command, Scanner scanner) {
        boolean inCreatingMatchMenu = true;
        while (inCreatingMatchMenu) {
            command = scanner.nextLine();
            if (command.equals("help")) {
                System.out.println("single player : play with computer");
                System.out.println("multi player : play with another account");
            } else if (command.equals("single player")) {

            } else if (command.equals("multi player")) {
                System.out.println("please select second user to play :");
                command = scanner.nextLine();
                if (command.matches("select user .+")) {
                    command = command.substring(12);
                    if (Account.loginAccount(command, scanner, true)) {
                        System.out.println("please select a mode for playing");
                        System.out.println("1 : if a team's hero die, you lose !");
                        System.out.println("2 : you have to pick the flag ! ");
                        System.out.println("3 : you have to pick half of the flags");
                        command = scanner.nextLine();
                        if (command.matches("\\d")) {
                            if (Integer.parseInt(command) == 1) {
                                mode1 = new Mode1(Account.getAccounts().get(Account.getIndexOfLogined())
                                        , Account.getAccounts().get(Account.getIndexOfSecondPlayer()));
                                mode = 1;
                                matchIsOn = true;
                                match = mode1;
                                inCreatingMatchMenu = false;
                            } else if (Integer.parseInt(command) == 2) {
                                mode2 = new Mode2(Account.getAccounts().get(Account.getIndexOfLogined())
                                        , Account.getAccounts().get(Account.getIndexOfSecondPlayer()));
                                mode = 2;
                                matchIsOn = true;
                                match = mode2;
                                inCreatingMatchMenu  =false;
                            } else if (Integer.parseInt(command) == 3) {
                                mode3 = new Mode3(Account.getAccounts().get(Account.getIndexOfLogined())
                                        , Account.getAccounts().get(Account.getIndexOfSecondPlayer()));
                                mode = 3;
                                matchIsOn = true;
                                match = mode3;
                                inCreatingMatchMenu = false;
                            }
                        }
                    }
                }
            } else  if (command.equals("exit")) {
                inCreatingMatchMenu = false;
            }
        }
    }
    public static void setAttributesForStartingGame(){
        match.firstAccount.setGraveYard(new ArrayList<>());
        match.firstAccount.setMana(2);
        match.firstAccount.setMaxMana(2);
        match.firstAccount.getMainDeck().getHero().setActiveCounterAttack(false);
        match.firstAccount.getMainDeck().getHero().setIsAttacked(false);
        match.firstAccount.getMainDeck().getHero().setIsMoved(false);
        match.firstAccount.setNextCard(1);
        for (int i = 0; i < match.firstAccount.getMainDeck().getCards().size()
                && match.firstAccount.getNextCard() < 6; i++) {
            match.firstAccount.getHand().add(match.firstAccount.getMainDeck().getCards().get(i));
        }
        match.secondAccount.setGraveYard(new ArrayList<>());
        match.secondAccount.setMaxMana(2);
        match.secondAccount.setMana(2);
        match.secondAccount.getMainDeck().getHero().setActiveCounterAttack(false);
        match.secondAccount.getMainDeck().getHero().setIsAttacked(false);
        match.secondAccount.getMainDeck().getHero().setIsMoved(false);
        match.secondAccount.setNextCard(1);
        for (int i = 0; i < match.secondAccount.getMainDeck().getCards().size()
                && match.secondAccount.getNextCard() < 6; i++) {
            match.secondAccount.getHand().add(match.secondAccount.getMainDeck().getCards().get(i));
        }
        match.squares[2][0].putCard(match.firstAccount.getMainDeck().getHero());
        match.squares[2][8].putCard(match.secondAccount.getMainDeck().getHero());

    }
    public static boolean playMatch(String command){
        if (command.equals("game info")){
            View.showGameInfo();
        }else if (command.equals("show my minions")){

        }
        return true;
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

    public static int getMode() {
        return mode;
    }

    public static boolean getMatchIsOn() {
        return matchIsOn;
    }
    public Square[][] getSuares(){
        return squares;
    }


    public Account getFirstAccount(){
        return firstAccount;
    }
    public  Account getSecondAccount(){
        return secondAccount;
    }
}
