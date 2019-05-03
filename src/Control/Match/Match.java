package Control.Match;

import Control.Account;
import Model.Spell;

import java.util.ArrayList;

public abstract class Match {
    private Account firstAccount;
    private Account secondAccount;
    private int turn = 0;
    private Square[][] squares = new Square[5][9];
    ArrayList<Spell> activeSpells;
    public Match(){

    }
    public Match(Account firstAccount, Account secondAccount){
        this.firstAccount = firstAccount;
        this.secondAccount = secondAccount;
    }
    public Account whoseTurn(){
        if (turn % 2 == 0){
            return firstAccount;
        }
            return secondAccount;
    }
    public Account enemy(){
        if (turn % 2 == 0){
            return secondAccount;
        }
        return firstAccount;
    }
    public Square[][] getSquares(){return squares;}
}
