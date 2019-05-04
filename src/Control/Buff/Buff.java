package Control.Buff;

import Model.Card;
import Model.Soldier;
enum BuffType{
    Disarm,
    DeactiveNegativeBuffs,
    DeactivePossitveBuffs;
}
public class Buff {
        boolean possitive;
        Soldier soldier;
//        protected void active();
        public void setCard(Soldier soldier){
            this.soldier = soldier;
        }
        Buff(){

        }

        public void disarm(){
            soldier.setActiveCounterAttack(false);
        }
        public void deactiveDisarm(){

        }
}
//    protected Soldier soldier;
//    public abstract void active();
//    public abstract void deactive();
