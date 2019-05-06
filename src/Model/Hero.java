package Model;

import Control.Match.Match;

import java.util.ArrayList;

public class Hero extends Soldier {
    private ArrayList<Spell> possitiveBuffs = new ArrayList<>();
    private ArrayList<Spell> negativeBuffs = new ArrayList<>();
    private int coolDown;
    public Hero(int hp, int ap, int mp, int coolDown, int price, String name, String attackType, int attackRange
    , int idNumber){
        super(hp, ap, mp, price, name, attackType, attackRange, idNumber);
        this.coolDown = coolDown;
    }
    public void attack(Soldier myCard, int opponentCardID, Match match) {
        if (attacked) {
            System.out.println("Error : you can't attack until next turn");
            return;
        }
        boolean cardExists = false;
        Soldier opponentCard = null;
        outerloop:
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 9; j++) {
                if (match.getSquares()[i][j].getIsFull() && match.getSquares()[i][j].getCard().getIdNumber() == opponentCardID
                        && match.getSquares()[i][j].getCard().getAccount().getId() == match.enemy().getId()) {
                    cardExists = true;
                    opponentCard =(Soldier) match.getSquares()[i][j].getCard();
                    break outerloop;
                }
            }
        }
        if (!cardExists) {
            System.out.println("Error : there isn't any card with this ID!");
            return;
        }
        if (!checkMeleeAttack(myCard, opponentCard)){
            System.out.println("Error : you can't attack this card !");
            return;
        }
        opponentCard.decreaseHP(myCard.hp);
        if (opponentCard.activeCounterAttack){
            myCard.decreaseHP(opponentCard.hp);
        }
        myCard.checkDeath();
        opponentCard.checkDeath();
    }

    private boolean checkMeleeAttack(Soldier myCard, Soldier opponentCard) {
        if (Math.abs(myCard.x - opponentCard.x) + Math.abs(myCard.y - opponentCard.y) >= 2) {
            return false;
        }
        return true;
    }
}
