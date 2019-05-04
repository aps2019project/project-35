package Model;

import Model.Card;

public class Spell extends Card {
    private String description;
    public Spell(int a, int b, String c, int d){
        super(a, b, c, d);
    }
    public  String getDescription(){
        return description;
    }
}
