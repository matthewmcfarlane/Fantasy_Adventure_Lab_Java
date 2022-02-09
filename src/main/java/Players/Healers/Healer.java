package Players.Healers;

import Behaviours.IHeal;
import Players.Player;



public abstract class Healer extends Player {

    private IHeal heals;

    public Healer(String name, int healthPoints, IHeal heals) {
        super(name, healthPoints);
        this.heals = heals;
    }

    public IHeal getHeals() {
        return heals;
    }

    public void setHeals(IHeal heals) {
        this.heals = heals;
    }

    public void healPlayer(Player player){
        this.heals.heal(player);
    }
}
