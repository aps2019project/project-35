package Control;

import Model.Card;
import Model.Hero;
import Model.Item;
import Model.Minion;

import java.util.ArrayList;

public class Deck {



    private ArrayList<Card> cards = new ArrayList<Card>();
    private Item item;
    private Hero hero;
    public Deck(){
    }
    public Hero getHero(){
        return hero;
    }
    public Item getItem(){
        return item;
    }
    public ArrayList<Card> getCards(){
        return cards;
    }
    public void setHero(Hero hero){
        this.hero = hero;
    }
    //public static void deleteDeck(Deck deck){}

}
