package Model;

public abstract class Soldier extends Card {
    public Soldier(int hp, int ap, int mp, int price, String name, String attackType, int attackRange, int idNumber){
        super(mp, price, name, attackRange, idNumber);
        this.ap = ap;
        this.hp = hp;
        this.attackType = attackType;
    }
    protected boolean isMoved;
    protected boolean attacked;
    protected boolean activeCounterAttack;
    protected boolean isStunned;
    protected int hp;
    protected int ap;
    protected int moves;
    protected final String attackType;
    private String specialPower;
    private boolean activeSpecialPower;
    public String getSpecialPower(){
        return specialPower;
    }
    protected void checkDeath(){
        if (hp <= 0){
            this.getAccount().getGraveYard().add(this);
            this.square.setFull(false);
            this.square.setCard(null);
            this.square = null;
        }
    }
    protected void decreaseHP(int ap) {
        this.hp -= ap;
    }
    public void setActiveCounterAttack(boolean bool){
        activeCounterAttack = bool;
    }
    public int getAp(){
        return ap;
    }
    public int getHp(){
        return hp;
    }
    public int getMoves(){
        return  moves;
    }
    public String getAttackType(){
        return attackType;
    }
}
