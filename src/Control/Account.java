package Control;

import Control.Match.Match;
import Model.Card;
import Model.Item;
import Model.Soldier.Hero;
import View.View;

import java.util.ArrayList;
import java.util.Scanner;

public class Account {
    private static ArrayList<Account> accounts = new ArrayList<>();
    private static int indexOfLogined =  -1;
    private static int idSetter = 0;
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
    public static void handleEvent(String command) {
        Scanner scanner = new Scanner(System.in);
        String[] splitedCommand = command.split(" ");
        if (indexOfLogined != -1){
            handleLogin(command);
        }
        else if (command.matches("create account.*")) {
            createAccount(command, scanner);
        }
        else if (command.matches("login.*")) {
            loginAccount(command, scanner);
        }
        else if (command.equals("show leaderboard")){
            View.showLeaderboard();
        }
        else if (command.equals("help")){
            System.out.println("create account [username] : makes an account");
            System.out.println("login [username] : logins your account");
            System.out.println("show leaderboard : shows the account by the number of wins");
            System.out.println("save : saves your info");
            System.out.println("logout : logout your account");
        }
    }
    public static void handleLogin(String command){
        if (command.equals("logout")){
            indexOfLogined = -1;
            return;
        }
    }
    private static void createAccount(String command, Scanner scanner){
        if (command.trim().equals("create account")){
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
        if (password.trim().equals("")){
            System.out.println("Error : you have to enter a password for your account");
            return;
        }
        Account account = new Account(command.substring(15), password);
        accounts.add(account);
        System.out.println("Account created successfully");
//        System.out.println(accounts.get(idSetter).username + " " + accounts.get(idSetter).password);
        idSetter++;
    }
    private static void loginAccount(String command, Scanner scanner){
        if (command.trim().equals("login")){
            System.out.println("Error : please enter a username to login !");
            return;
        }
        boolean accountExists = false;
        for (int i = 0; i < accounts.size(); i++) {
            if (accounts.get(i).username.equals(command.substring(6, command.length()))) {
                System.out.println("Please enter your password :");
                String password = scanner.nextLine();
                if (!password.equals(accounts.get(i).password)) {
                    System.out.println("Error : Wrong password !");
                    return;
                }
                indexOfLogined = i;
                accountExists = true;
            }
        }
        if (!accountExists){
            System.out.println("Error : username not found !");
        }
        System.out.println("Login successful");
    }
    public static int getNumberOfAccounts(){
        return accounts.size();
    }
    public static String getUsernameByIndex(int i){
        return accounts.get(i).getUsername();
    }
    public static int getWinsByIndex(int i){
        return accounts.get(i).getWins();
    }
    public String getUsername(){
        return username;
    }
    public int getWins(){
        return wins;
    }
}
