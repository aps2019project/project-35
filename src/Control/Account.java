package Control;

import Control.Match.Match;
import Model.Card;
import Model.Hero;
import Model.Item;
import View.View;

import java.util.ArrayList;
import java.util.Scanner;

public class Account {
    private static ArrayList<Account> accounts = new ArrayList<>();
    private static int indexOfLogined = -1;
    private static int indexOfSecondPlayer = -1;
    private static int idSetter = 0;
    private static boolean logined = false;
    private int id;
    private ArrayList<Hero> heroes = new ArrayList<>();
    private ArrayList<Item> items = new ArrayList<>();
    private ArrayList<Card> cards = new ArrayList<>();
    private ArrayList<Card> graveYard = new ArrayList<>();
    private ArrayList<MatchHistory> matchHistories = new ArrayList<>();
    private ArrayList<Deck> decks = new ArrayList<>();
    private int daric;
    private int mana;
    private int maxMana;
    private int wins;
    private int cardIdCounter;
    private int itemIdCounter;
    private String password;
    private String username;

    private Account(String username, String password) {
        daric = 15000;
        wins = 0;
        cardIdCounter = 0;
        itemIdCounter = 0;
        this.username = username;
        this.password = password;
    }

    public static boolean handleEvent(String command, Scanner scanner) {
        String[] splitedCommand = command.split(" ");
        if (command.matches("create account.*")) {
            createAccount(command, scanner);
        } else if (command.matches("login.*")) {
            loginAccount(command, scanner, false);
        } else if (command.equals("show leaderboard")) {
            View.showLeaderboard();
        } else if (command.equals("help")) {
            System.out.println("create account [username] : makes an account");
            System.out.println("login [username] : logins your account");
            System.out.println("show leaderboard : shows the account by the number of wins");
            System.out.println("save : saves your info");
            System.out.println("logout : logout your account");
        } else if (command.equals("exit")) {
            return true;
        }
        return false;
    }

    //this function returns 1 for entering battle,
    //2 for entering shop
    // and 3 for collection, exit and help.
    public static int handleLogin(String command, Scanner scanner) {
        command = scanner.nextLine();
        if (command.equals("logout") || command.equals("exit")) {
            indexOfLogined = -1;
            return 0;
        } else if (command.equals("enter battle")) {
            return 1;
        } else if (command.equals("Enter shop")) {
            return 2;
        }
        return 0;
    }

    public static void handleShop(String command) {

    }

    private static void createAccount(String command, Scanner scanner) {
        if (command.trim().equals("create account")) {
            System.out.println("Error : please select a username for your account !");
            return;
        }
        for (int i = 0; i < accounts.size(); i++) {
            if (command.equals("create account " + accounts.get(i).username)) {
                System.out.println("Error : an account with this username exists !");
                System.out.println("Please select another username !");
                return;
            }
        }
        System.out.println("Please select a password for your account :");
        String password = scanner.nextLine();
        if (password.trim().equals("")) {
            System.out.println("Error : you have to enter a password for your account");
            return;
        }
        Account account = new Account(command.substring(15), password);
        accounts.add(account);
        System.out.println("Account created successfully");
//        System.out.println(accounts.get(idSetter).username + " " + accounts.get(idSetter).password);
        idSetter++;
    }

    public static boolean loginAccount(String command, Scanner scanner, boolean first) {
        if (command.trim().equals("login")) {
            System.out.println("Error : please enter a username to login !");
            return false;
        }
        boolean accountExists = false;
        for (int i = 0; i < accounts.size(); i++) {
            if (accounts.get(i).username.equals(command.substring(6))) {
                System.out.println("Please enter your password :");
                String password = scanner.nextLine();
                if (!password.equals(accounts.get(i).password)) {
                    System.out.println("Error : Wrong password !");
                    return false;
                }
                if (!first)
                    indexOfLogined = i;
                else
                    indexOfSecondPlayer = i;
                accountExists = true;
            }
        }
        if (!accountExists) {
            System.out.println("Error : username not found !");
        }
        System.out.println("Login successful");
        return true;
    }

    public static int getNumberOfAccounts() {
        return accounts.size();
    }

    public static String getUsernameByIndex(int i) {
        return accounts.get(i).getUsername();
    }

    public static int getWinsByIndex(int i) {
        return accounts.get(i).getWins();
    }

    public String getUsername() {
        return username;
    }

    public int getWins() {
        return wins;
    }

    public int getId() {
        return id;
    }

    public ArrayList<Card> getGraveYard() {
        return graveYard;
    }

    public static int getIndexOfLogined() {
        return indexOfLogined;
    }

    public static ArrayList<Account> getAccounts() {
        return accounts;
    }

    public static int getIndexOfSecondPlayer() {
        return indexOfSecondPlayer;
    }

    public static boolean getLeogined() {
        return logined;
    }
}
