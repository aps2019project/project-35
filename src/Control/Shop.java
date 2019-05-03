package Control;

import Control.Item.Item;
import Model.Hero;
import Model.Minion;

import java.util.ArrayList;

public class Shop {
    public static ArrayList<Item> items;
    public static ArrayList<Hero> heroes;
    public static ArrayList<Minion> minions;
    public static void createShop(){
        heroes.add(new Hero(50, 4, 1, 2, 8000, "White Devil", "melee", -1));
        heroes.add(new Hero(50, 4, 5, 8, 9000, "Phoenix", "melee", -1));
        heroes.add(new Hero(50, 4, 0, 1, 8000, "SevenHeaded Dragon", "melee", -1));
        heroes.add(new Hero(50, 4, 1, 2, 8000, "Rakhsh", "melee", -1));
        heroes.add(new Hero(50, 2, -1, -1, 10000, "Zahaak", "melee", -1));
        heroes.add(new Hero(50, 4, 1, 3, 8000, "Kaveh", "melee", -1));
        heroes.add(new Hero(30, 2, 2, 2, 10000, "Arash", "ranged", 6));
        heroes.add(new Hero(40, 3, 1, 2, 11000, "Legend", "ranged", 3));
        heroes.add(new Hero(35, 3, -1, -1, 12000, "Esfandiar", "hybrid", 3));
        heroes.add(new Hero(55, 7, -1, -1, 8000, "Rostam", "hybrid", 4));

        minions.add(new Minion(6, 4, 2, 300, "Persian Archer", "ranged", 7, false, false));
        minions.add(new Minion(6, 4, 2, 400, "Persian Swordsman", "melee", -1, true, false));
        minions.add(new Minion(5, 3, 1, 500, "Persian Lancer", "hybrid", 3, false, false));
        minions.add(new Minion(10, 6, 4, 200, "Persian Horseman", "melee", -1, false, false));
        minions.add(new Minion(24, 6, 9, 600, "Persian Champion", "melee", -1, true, false));
        minions.add(new Minion(12, 4, 7, 800, "Persian Commander", "melee", -1, true, true));
        minions.add(new Minion(3, 4, 1, 500, "Toorani Archer", "ranged", 5, false, false));
        minions.add(new Minion(4, 2, 1, 600, "Toorani Slinger", "ranged", 7, false, false));
        minions.add(new Minion(4, 4, 1, 600, "Toorani Lancer", "hybrid", 3, false, false));
        minions.add(new Minion(6, 6, 4, 700, "Toorani Spy", "melee", -1, true, false));
        minions.add(new Minion(3, 10, 2, 450, "Toorani Clubber", "melee", -1, false, false));
        minions.add(new Minion(6, 10, 6, 800, "Toorani Prince", "melee", -1, true, true));
        minions.add(new Minion(14, 10, 9, 300, "Black Devil", "hybrid", 7, false, false));
        minions.add(new Minion(12, 12, 9, 300, "Rocktrowing Devil", "ranged", 7, false, false));
        minions.add(new Minion(0, 2, 2, 200, "Eagle", "ranged", 3, true, false));
        minions.add(new Minion(16, 8, 6, 300, "BoarRiding Monster", "melee", -1, false, false));
        minions.add(new Minion(12, 11, 7, 500, "Cycolps", "hybrid", 3, true, false));
        minions.add(new Minion(5, 6, 4, 300, "Black Mamba", "ranged", 4, true, false));
        minions.add(new Minion(9, 5, 5, 300, "FireBreathing Dragon", "ranged", 4, false, false));
        minions.add(new Minion(1, 8, 2, 600, "Viscous Lion", "melee", -1, true, false));
        minions.add(new Minion(14, 7, 8, 500, "Anaconda", "ranged", 5, true, false));
        minions.add(new Minion(8, 2, 5, 400, "White Wolf", "melee", -1, true, false));
        minions.add(new Minion(6, 2, 4, 400, "Couger", "melee", -1, true, false));
        minions.add(new Minion(6, 1, 3, 400, "Normal Wolf", "melee", -1, true, false));
        minions.add(new Minion(5, 4, 4, 550, "Sorcerer", "ranged", 3, true, false));
        minions.add(new Minion(6, 6, 6, 550, "GrandMaster Sorcerer", "ranged", 5, true, false));
        minions.add(new Minion(10, 4, 5, 500, "Dejin", "ranged", 4, true, false));
        minions.add(new Minion(10, 14, 6, 500, "Wild Boar", "melee", -1, true, false));
        minions.add(new Minion(20, 12, 8, 400, "Piran", "melee", -1, true, false));
        minions.add(new Minion(5, 7, 4, 450, "Giv", "ranged", 5, true, false));
        minions.add(new Minion(16, 9, 8, 450, "Bahman", "melee", -1, true, false));
        minions.add(new Minion(14, 8, 7, 400, "Ashkboos", "melee", -1, true, false));
        minions.add(new Minion(6, 20, 4, 500, "Iraj", "ranged", 3, false, false));
        minions.add(new Minion(10, 4, 4, 550, "TwoHeaded Monster", "melee", -1, true, false));
        minions.add(new Minion(3, 4, 3, 500, "Mother of the Coldness", "ranged", 5, true, false));
        minions.add(new Minion(1, 1, 3, 500, "IronMaiden", "melee", -1, true, false));
        minions.add(new Minion(8, 5, 4, 350, "Siavash", "melee", -1, true, false));
        minions.add(new Minion(10, 4, 5, 600, "The Great Giant", "melee", -1, true, true));
        minions.add(new Minion(6, 6, 3, 600, "Arzhang div", "melee", -1, true, true));
    }
}
