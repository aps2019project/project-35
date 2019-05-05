package Control;

import Model.Card;
import Model.Hero;
import Model.Item;
import Model.Minion;

import java.net.CacheRequest;
import java.util.ArrayList;

public class Shop {
    public static ArrayList<Item> items;
    public static ArrayList<Hero> heroes;
    public static ArrayList<Minion> minions;

    public static void createShop() {
        heroes.add(new Hero(50, 4, 1, 2, 8000, "White Devil", "melee", -1, 1001));
        heroes.add(new Hero(50, 4, 5, 8, 9000, "Phoenix", "melee", -1, 1002));
        heroes.add(new Hero(50, 4, 0, 1, 8000, "SevenHeaded Dragon", "melee", -1, 1003));
        heroes.add(new Hero(50, 4, 1, 2, 8000, "Rakhsh", "melee", -1, 1004));
        heroes.add(new Hero(50, 2, -1, -1, 10000, "Zahaak", "melee", -1, 1005));
        heroes.add(new Hero(50, 4, 1, 3, 8000, "Kaveh", "melee", -1, 1006));
        heroes.add(new Hero(30, 2, 2, 2, 10000, "Arash", "ranged", 6, 1007));
        heroes.add(new Hero(40, 3, 1, 2, 11000, "Legend", "ranged", 3, 1008));
        heroes.add(new Hero(35, 3, -1, -1, 12000, "Esfandiar", "hybrid", 3, 1009));
        heroes.add(new Hero(55, 7, -1, -1, 8000, "Rostam", "hybrid", 4, 1010));

        minions.add(new Minion(6, 4, 2, 300, "Persian Archer", "ranged", 7, false, false, 2001));
        minions.add(new Minion(6, 4, 2, 400, "Persian Swordsman", "melee", -1, true, false, 2002));
        minions.add(new Minion(5, 3, 1, 500, "Persian Lancer", "hybrid", 3, false, false, 2003));
        minions.add(new Minion(10, 6, 4, 200, "Persian Horseman", "melee", -1, false, false, 2004));
        minions.add(new Minion(24, 6, 9, 600, "Persian Champion", "melee", -1, true, false, 2005));
        minions.add(new Minion(12, 4, 7, 800, "Persian Commander", "melee", -1, true, true, 2006));
        minions.add(new Minion(3, 4, 1, 500, "Toorani Archer", "ranged", 5, false, false, 2007));
        minions.add(new Minion(4, 2, 1, 600, "Toorani Slinger", "ranged", 7, false, false, 2008));
        minions.add(new Minion(4, 4, 1, 600, "Toorani Lancer", "hybrid", 3, false, false, 2009));
        minions.add(new Minion(6, 6, 4, 700, "Toorani Spy", "melee", -1, true, false, 2010));
        minions.add(new Minion(3, 10, 2, 450, "Toorani Clubber", "melee", -1, false, false, 2011));
        minions.add(new Minion(6, 10, 6, 800, "Toorani Prince", "melee", -1, true, true, 2012));
        minions.add(new Minion(14, 10, 9, 300, "Black Devil", "hybrid", 7, false, false, 2013));
        minions.add(new Minion(12, 12, 9, 300, "Rocktrowing Devil", "ranged", 7, false, false, 2014));
        minions.add(new Minion(0, 2, 2, 200, "Eagle", "ranged", 3, true, false, 2015));
        minions.add(new Minion(16, 8, 6, 300, "BoarRiding Monster", "melee", -1, false, false, 2016));
        minions.add(new Minion(12, 11, 7, 500, "Cycolps", "hybrid", 3, true, false, 2017));
        minions.add(new Minion(5, 6, 4, 300, "Black Mamba", "ranged", 4, true, false, 2018));
        minions.add(new Minion(9, 5, 5, 300, "FireBreathing Dragon", "ranged", 4, false, false, 2019));
        minions.add(new Minion(1, 8, 2, 600, "Viscous Lion", "melee", -1, true, false, 2020));
        minions.add(new Minion(14, 7, 8, 500, "Anaconda", "ranged", 5, true, false, 2021));
        minions.add(new Minion(8, 2, 5, 400, "White Wolf", "melee", -1, true, false, 2022));
        minions.add(new Minion(6, 2, 4, 400, "Couger", "melee", -1, true, false, 2023));
        minions.add(new Minion(6, 1, 3, 400, "Normal Wolf", "melee", -1, true, false, 2024));
        minions.add(new Minion(5, 4, 4, 550, "Sorcerer", "ranged", 3, true, false, 2025));
        minions.add(new Minion(6, 6, 6, 550, "GrandMaster Sorcerer", "ranged", 5, true, false, 2026));
        minions.add(new Minion(10, 4, 5, 500, "Dejin", "ranged", 4, true, false, 2027));
        minions.add(new Minion(10, 14, 6, 500, "Wild Boar", "melee", -1, true, false, 2028));
        minions.add(new Minion(20, 12, 8, 400, "Piran", "melee", -1, true, false, 2029));
        minions.add(new Minion(5, 7, 4, 450, "Giv", "ranged", 5, true, false, 2030));
        minions.add(new Minion(16, 9, 8, 450, "Bahman", "melee", -1, true, false, 2031));
        minions.add(new Minion(14, 8, 7, 400, "Ashkboos", "melee", -1, true, false, 2032));
        minions.add(new Minion(6, 20, 4, 500, "Iraj", "ranged", 3, false, false, 2033));
        minions.add(new Minion(30, 8, 9, 600, "Giant", "hybrid", 2, false, false, 2034));
        minions.add(new Minion(10, 4, 4, 550, "TwoHeaded Monster", "melee", -1, true, false, 2035));
        minions.add(new Minion(3, 4, 3, 500, "Mother of the Coldness", "ranged", 5, true, false, 2036));
        minions.add(new Minion(1, 1, 3, 500, "IronMaiden", "melee", -1, true, false, 2037));
        minions.add(new Minion(8, 5, 4, 350, "Siavash", "melee", -1, true, false, 2038));
        minions.add(new Minion(10, 4, 5, 600, "The Great Giant", "melee", -1, true, true, 2039));
        minions.add(new Minion(6, 6, 3, 600, "Arzhang div", "melee", -1, true, true, 2040));
    }

    public static int search(String command) {
        command = command.substring(7);
        for (int i = 0; i < heroes.size(); i++) {
            Hero hero = heroes.get(i);
            if (hero.getName().equals(command)) {
                return hero.getIdNumber();
            }
        }
        for (int i = 0; i < minions.size(); i++) {
            Minion minion = minions.get(i);
            if (minion.getName().equals(command)) {
                return minion.getIdNumber();
            }
        }
        for (int i = 0; i < items.size(); i++) {
            Item item = items.get(i);
            if (item.getName().equals(command)) {
                return item.getID();
            }
        }
        return -1;
    }

    public static void buy(String command) {
        Account account = Account.getAccounts().get(Account.getIndexOfLogined());
        for (int i = 0; i < heroes.size(); i++) {
            Hero hero = heroes.get(i);
            if (hero.getName().equals(command)) {
                if (account.getDaric() < hero.getPrice()) {
                    System.out.println("Error : you don't have enough daric to buy this card !");
                    return;
                }
                account.getHeroes().add(hero);
                account.getCards().add(hero);
                account.setDaric(account.getDaric() - hero.getPrice());
            }
        }
        for (int i = 0; i < minions.size(); i++) {
            Minion minion = minions.get(i);
            if (minion.getName().equals(command)) {
                if (account.getDaric() < minion.getPrice()) {
                    System.out.println("Error : you don't have enough daric to buy this card !");
                    return;
                }
                account.getMinions().add(minion);
                account.getCards().add(minion);
                account.setDaric(account.getDaric() - minion.getPrice());
            }
        }
        for (int i = 0; i < items.size(); i++) {
            Item item = items.get(i);
            if (item.getName().equals(command)) {
                if (account.getDaric() < item.getPrice()) {
                    System.out.println("Error : you don't have enough daric to buy this card !");
                    return;
                }
                if (account.getItems().size() == 3){
                    System.out.println("you can't have more than 3 items in your collection concurrently !");
                    return;
                }
                account.getItems().add(item);
                account.setDaric(account.getDaric() - item.getPrice());
            }
        }
    }
    public static void sell(int id){
        if (!Account.searchCollectionById(id)){
            System.out.println("you don't have an item\\card with this id number");
            return;
        }
        Account account = Account.getAccounts().get(Account.getIndexOfLogined());
        for (int i = 0; i < account.getCards().size(); i++) {
            Card card  = account.getCards().get(i);
            if (card.getIdNumber() == id){
                account.getCards().remove(i);
                break;
            }
        }
        for (int i = 0; i < account.getHeroes().size(); i++) {
            Hero hero = account.getHeroes().get(i);
            if (hero.getIdNumber() == id){
                account.getHeroes().remove(i);
                break;
            }
        }
        for (int i = 0; i < account.getMinions().size(); i++) {
            Minion minion = account.getMinions().get(i);
            if (minion.getIdNumber() == id){
                account.getMinions().remove(i);
                break;
            }
        }
        for (int i = 0; i < account.getItems().size(); i++) {
            Item item = account.getItems().get(i);
            if (item.getID() == id){
                account.getItems().remove(i);
                break;
            }
        }
    }
}
