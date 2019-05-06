package Control;

import Control.Match.Match;
import Model.Card;
import Model.Hero;
import Model.Item;
import Model.Minion;
import View.View;

import java.io.CharArrayReader;
import java.lang.management.MonitorInfo;
import java.util.ArrayList;
import java.util.Scanner;

public class Account {
    private static ArrayList<Account> accounts = new ArrayList<>();
    private static int indexOfLogined = -1;
    private static int indexOfSecondPlayer = -1;
    private static int idSetter = 0;
    private static boolean logined = false;
    private int id;
    private int nextCard;
    private ArrayList<Hero> heroes = new ArrayList<>();
    private ArrayList<Item> items = new ArrayList<>();
    private ArrayList<Card> cards = new ArrayList<>();
    private ArrayList<Minion> minions = new ArrayList<>();
    private ArrayList<Card> graveYard = new ArrayList<>();
    private ArrayList<Minion> minionsInPlayYard = new ArrayList<>();
    private ArrayList<MatchHistory> matchHistories = new ArrayList<>();
    private ArrayList<Deck> decks = new ArrayList<Deck>();
    private ArrayList<Card> hand = new ArrayList<>();
    private Deck mainDeck;
    private int daric;
    private int mana;
    private int maxMana;
    private int wins;
    private int cardIdCounter;
    private int itemIdCounter;
    private String password;
    private String username;

    private Account(String username, String password, int idSetter) {
        daric = 15000;
        wins = 0;
        cardIdCounter = 0;
        itemIdCounter = 0;
        this.username = username;
        this.password = password;
        id = idSetter;
        mainDeck = new Deck();
    }
    public ArrayList<Hero> getHeroes(){
        return heroes;
    }
    public ArrayList<Item> getItems(){
        return  items;
    }
    public ArrayList<Minion> getMinions(){
        return minions;
    }
    public ArrayList<Card> getCards(){
        return cards;
    }
    public ArrayList<Deck> getDecks(){ return decks;}

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

    public static void createAccount(String command, Scanner scanner) {
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
        Account account = new Account(command.substring(15), password, idSetter);
        accounts.add(account);
        System.out.println("Account created successfully");
//        System.out.println(accounts.get(idSetter).username + " " + accounts.get(idSetter).password);
        idSetter++;
    }

    public static boolean loginAccount(String command, Scanner scanner, boolean first) {
        if (command.trim().equals("")) {
            System.out.println("Error : please enter a username to login !");
            return false;
        }
        boolean accountExists = false;
        for (int i = 0; i < accounts.size(); i++) {
            if (accounts.get(i).username.equals(command)) {
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
        Menu.increaseMenu();
        return true;
    }
    public static void searchCollection(String command){
        boolean exists = false;
        command = command.substring(18);
        Account account = Account.getAccounts().get(Account.getIndexOfLogined());
        for (int i = 0; i < account.getCards().size(); i++) {
            Card card = account.getCards().get(i);
            if (card.getName().equals(command)){
                System.out.println(card.getIdNumber());
                exists = true;
            }
        }
        for (int i = 0; i < account.getItems().size(); i++) {
            Item item = account.getItems().get(i);
            if (item.getName().equals(command)){
                System.out.println(item.getID());
                exists = true;
            }
        }
        if (!exists)
            System.out.println("there isn't any card with this name in your collection");
    }
    public static boolean searchCollectionById(int id){
        Account account  = Account.getAccounts().get(Account.getIndexOfLogined());
        for (int i = 0; i < account.getCards().size(); i++) {
            Card card  = account.getCards().get(i);
            if (card.getIdNumber() == id){
                return true;
            }
        }
        for (int i = 0; i < account.getItems().size(); i++) {
            Item item =  account.getItems().get(i);
            if (item.getID() == id){
                return true;
            }
        }
        return  false;
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
    public int getDaric(){
        return daric;
    }
    public void setDaric(int daric){
        this.daric = daric;
    }
    public void setGraveYard(ArrayList<Card> graveYard){
        this.graveYard = graveYard;
    }
    public void setMana(int mana){
        this.mana = mana;
    }
    public int getMana(){
        return mana;
    }
    public void setMaxMana(int maxMana){
        this.maxMana = maxMana;
    }
    public int getMaxMana(){
        return maxMana;
    }
    public Deck getMainDeck() {
        return mainDeck;
    }
    public  ArrayList<Minion> getMinionsInPlayYard(){
        return minionsInPlayYard;
    }
    public int getNextCard(){
        return nextCard;
    }
    public void setNextCard(int nextCard){
        this.nextCard = nextCard;
    }
    public ArrayList<Card> getHand(){
        return hand;
    }

}
