package Model;

public class Minion extends Soldier {
    private boolean hasSpecialPower, combo;
    public Minion(int hp, int ap, int mp, int price, String name, String attackType, int attackRange,
                  boolean hasSpecialPower, boolean combo){
        super(hp, ap, mp, price, name, attackType, attackRange);
        this.hasSpecialPower = hasSpecialPower;
        this.combo = combo;
    }
}
