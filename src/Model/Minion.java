package Model;

public class Minion extends Soldier {
    private boolean hasSpecialPower, combo;
    public Minion(int hp, int ap, int mp, int price, String name, String attackType, int attackRange,
                  boolean hasSpecialPower, boolean combo, int idNumber){
        super(hp, ap, mp, price, name, attackType, attackRange, idNumber);
        this.hasSpecialPower = hasSpecialPower;
        this.combo = combo;
    }
}
