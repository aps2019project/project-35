package Model;

import Model.Card;

public class Spell extends Card {
    private String description;
    public Spell(int a, int b, String c, int d, int e){
        super(a, b, c, d, e);
    }
    public  String getDescription(){
        return description;
    }
}
