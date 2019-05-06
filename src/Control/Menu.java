package Control;

import Model.Card;
import Model.Item;
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
                Account loggedInAccount;
                    command = scanner.nextLine();
                    command = command.toLowerCase();
                    loggedInAccount = Account.getAccounts().get(Account.getIndexOfLogined());
                    if (command.equals("exit")){
                        accountMenu = 0;
                    }
                    else if (command.equals("show")){
                        View.showCollection();
                    }
                    else if (command.matches("search [a-zA-Z]+")){
                        String[] commands = command.split(" ");
//                        for(int i=1;i<Account.getItems.size();i++){
//                            if(commands[1].equals(Collection.collectionCards.get(i))){
//                                System.out.println(Collection.collectionCards.get(i).getIdNumber());
//                            }
//
//                        }
                        // items = loggedInAccount.getItems();
                        //Card[] cards = Account.getCards();
                        for (Item item:loggedInAccount.getItems()
                             ) {
                            if(commands[1].equals(item.getName())){
                                System.out.println(item.getID());
                            }
                        }
                        for (Card card:loggedInAccount.getCards()
                             ) {
                            if(commands[1].equals(card.getName())){
                                System.out.println(card.getIdNumber());
                            }
                        }
                    }
                    else if (command.equals("save")){}
                    else if (command.matches("create deck [a-zA-Z]+")){
                        String[] commands = command.split(" ");

                    }
                    else if (command.matches("delete deck [a-zA-Z]+")){
                        String[] commands = command.split(" ");
                        for (Deck deck: loggedInAccount.getDecks()
                             ) {
                            if(deck.name.equals(commands[2])){
                                loggedInAccount.deleteDeck(deck);
                            }
                        }
                        System.out.println("deck not found");
                    }
                    else if (command.matches("add [a-zA-Z]+ to deck [a-zA-Z]+")){
                        String[] commands = command.split(" ");

                    }
                    else if (command.matches("remove [a-zA-Z]+ from deck [a-zA-Z]+")){
                        String[] commands = command.split(" ");
                        for (Deck deck: loggedInAccount.getDecks()
                        ) {
                            if(deck.name.equals(commands[3])){
                                for (:
                                     ) {

                                }
                            }
                        }
                    }
                    else if (command.matches("validate deck [a-zA-Z]+")){
                        String[] commands = command.split(" ");
                        for (Deck deck: loggedInAccount.getDecks()
                             ) {
                            if(deck.name.equals(commands[2])){
                                if (deck.isValid()){
                                    System.out.println("Deck Is Valid");
                                }
                                else{
                                    System.out.println("Deck Is Not Valid");
                                }
                            }
                        }
                        System.out.println("Deck Not Found");
                    }
                    else if (command.matches("select deck [a-zA-Z]+")){
                        String[] commands = command.split(" ");
                        for (Deck deck: loggedInAccount.getDecks()
                             ) {
                            if (deck.name.equals(commands[2])){
                                loggedInAccount.setMainDeck(deck);
                            }
                        }

                    }
                    else if (command.equals("show all decks")){}
                    else if (command.matches("show deck [a-zA-Z]+")){
                        String[] commands = command.split(" ");
                        for (Deck deck:loggedInAccount.getDecks()
                             ) {
                            if(deck.name.equals(commands[2])){
                                View.showDeck(deck);
                            }
                        }
                    }
                    else if (command.equals("help")){
                        System.out.println("create account [username] : makes an account");
                        System.out.println("login [username] : logins your account");
                        System.out.println("show leaderboard : shows the account by the number of wins");
                        System.out.println("save : saves your info");
                        System.out.println("logout : logout your account");
                        //System.out.println("exit, show, search, create deck, delete deck, add to deck, remove from deck, validate deck, select deck, show all decks, show deck");
                    }
                    else {
                        System.out.println("invalid command");
                    }











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
