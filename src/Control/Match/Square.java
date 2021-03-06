package Control.Match;

import Model.Card;
import Model.Spell;

import java.util.ArrayList;

public class Square {
    private boolean isFull;
    private Card card;
    private ArrayList<Spell> spells;
    public Square(){
        isFull = false;
        spells = new ArrayList<>();
        card = null;
    }
    public boolean getIsFull(){
        return isFull;
    }
    public Card getCard(){
        return card;
    }
    public ArrayList<Spell> getSpells(){
        return spells;
    }
    public void setFull(boolean bool){
        this.isFull = bool;
    }
    public void setCard(Card card){
        this.card = card;
    }

    public void putCard(Card card){
        this.setCard(card);
        this.setFull(true);
    }
}
