package Control;

import Model.*;

import java.util.ArrayList;

public class Deck {



    public String name;
    private ArrayList<Card> cards = new ArrayList<Card>();
    private Item item;
    private Hero hero;

    public Item getItem(){
        return item;
    }
    public ArrayList<Card> getCards(){
        return cards;
    }
    public Hero getHero(){return hero;}
    public Deck(String name){
        this.name = name;
    }
     public void setHero(Hero hero){
        this.hero = hero;
     }
     public void setItem(Item item){
        this.item = item;
     }
     public void addCard (Card card){

        cards.add(card);
     }
     public void addMinion(Minion minion){

     }
     public void removeCard (String cardName){
         for (Card card:cards
              ) {
             if(cardName.equals(card.getName())){
                 cards.remove(card);
                 return;
             }
         }
         System.out.println("card not found");
     }
     public boolean isValid(){
        if(cards.size() == 20 && hero != null){
            return true;
        }
        return false;
     }
//     public Deck findDeck(String name){
//         for (Deck deck:
//              ) {
//
//         }
//     }




    //public static void deleteDeck(Deck deck){}
}
