package Model;

import Control.Account;
import Control.Match.Square;

public abstract class Card {
    protected int x , y , mp , price , idNumber, attackRange;
    protected String type, desc , id, name;
    Account account;
    Square square;
    public Card(int mp, int price, String name, int attackRange, int idNumber){
        this.mp = mp;
        this.price = price;
        this.name = name;
        this.attackRange = attackRange;
        this.idNumber = idNumber;
    }
    public int getIdNumber(){
        return idNumber;
    }
    public Account getAccount(){
        return account;
    }
    public String getName(){
        return name;
    }
    public  int getPrice(){
        return  price;
    }
    public  int getMp(){
        return mp;
    }
    public int getX(){
        return x;
    }
    public int getY(){
        return y;
    }
}