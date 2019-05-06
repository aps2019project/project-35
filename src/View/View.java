package View;

import Control.Account;
import Control.Match.Match;
import Model.*;

import java.util.ArrayList;

public class
View {
    public static void showLeaderboard() {
        ArrayList<String> usernames = new ArrayList<>();
        ArrayList<Integer> wins = new ArrayList<>();
        for (int i = 0; i < Account.getNumberOfAccounts(); i++) {
            usernames.add(Account.getUsernameByIndex(i));
            wins.add(Account.getWinsByIndex(i));
        }
        for (int i = 0; i < wins.size(); i++) {
            for (int j = 0; j < wins.size() - 1; j++) {
                if (wins.get(j) < wins.get(j + 1)) {
                    String string = usernames.get(j);
                    usernames.set(j, usernames.get(j + 1));
                    usernames.set(j + 1, string);
                    int flag = wins.get(j);
                    wins.set(j, wins.get(j + 1));
                    wins.set(j + 1, flag);
                }
            }
        }
        for (int i = 0; i < wins.size(); i++) {
            System.out.println("UserName : " + usernames.get(i) + "- Wins : " + wins.get(i));
        }
    }
    public static void showCollection(){
        Account account = Account.getAccounts().get(Account.getIndexOfLogined());
        System.out.println("Heroes :");
        for (int i = 0; i < account.getHeroes().size(); i++) {
            Hero hero = account.getHeroes().get(i);
            System.out.println(i + 1 +  " : Name : " + hero.getName() +
                    " - AP : " +  hero.getAp() + " -  HP : " + hero.getHp() + " - Class : " + hero.getAttackType()
            + " - Special power : " + hero.getSpecialPower() +  " - Sell cost : "  + hero.getPrice());
        }
        System.out.println("Items : ");
        for (int i = 0; i < account.getItems().size(); i++) {
            Item item = account.getItems().get(i);
            System.out.println(i + 1 + " : Name : " + item.getName() + " Dec : " + item.getDesc() +
                    "Sell cost : " + item.getPrice());
        }
        System.out.println("Cards : ");
        for (int i = 0; i < account.getCards().size(); i++) {
            Card card = account.getCards().get(i);
            if (card instanceof Minion){
                System.out.println(i + 1 + " : Type : Minion - Name : "  + card.getName() +
                        " - Class : " + ((Minion) card).getAttackType() + " - AP : " +
                        ((Minion) card).getAp() + " - HP : " + ((Minion) card).getHp() +
                " - MP  : " + card.getMp() + " Special Power : " + ((Minion) card).getSpecialPower()
            + " - Sell cost : " + card.getPrice());
            }
            else if (card instanceof Spell){
                System.out.println(i + 1 + " : Type : Spell - Name : " + card.getName() + "MP : "
                + card.getMp() + "Descrption : " + ((Spell) card).getDescription() +
                        " - Sell cost : " + card.getPrice());

            }
        }
    }
    public static void showGame(){
        Match match = Match.mode1;
        if (Match.getMode() == 2){
            match = Match.mode2;
        }
        else if (Match.getMode() == 3){
            match = Match.mode3;
        }
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 9; j++) {
                if (!match.getSquares()[i][j].getIsFull()){
                    System.out.print("-\t\t");
                }
                else{
                    System.out.print(match.getSquares()[i][j].getCard().getName() + "\t");
                }
            }
            System.out.print("\n");
        }
    }
    public static void showGameInfo(){
        Match match = Match.mode1;
        if (Match.getMode() == 2){
            match = Match.mode2;
        }
        else if (Match.getMode() == 3){
            match = Match.mode3;
        }
        System.out.println(match.getFirstAccount().getUsername() + " Mana : " + match.getFirstAccount().getMana());
        System.out.println(match.getSecondAccount().getUsername() + " Mana : " + match.getSecondAccount().getMana());
    }
    public static void showMinionsInPlayYard(Account account){
        for (int i = 0; i < account.getMinionsInPlayYard().size(); i++) {
            Minion minion = account.getMinionsInPlayYard().get(i);
            System.out.printf("%d : %s, health : %d, location : [(%d,%d)], power : %d", minion.getIdNumber()
                    , minion.getName(), minion.getHp(), minion.getX(), minion.getY(), minion.getAp());
        }
    }
}
