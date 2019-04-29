package Control.Match;

import Control.Account;
import Model.Spell;

import java.util.ArrayList;

public class Match {
    private Account firstAccount;
    private Account secondAccount;
    private int turn = 0;
    private Square[][] squares = new Square[5][9];
    ArrayList<Spell> activeSpells;
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
}
