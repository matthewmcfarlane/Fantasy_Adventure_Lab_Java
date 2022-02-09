package Players.Fighters;

import Behaviours.IWeapon;
import Players.Player;

public abstract class Fighter extends Player {

    private IWeapon weapon;

    public Fighter(String name, int healthPoints, IWeapon weapon) {
        super(name, healthPoints);
        this.weapon = weapon;
    }

    public IWeapon getWeapon() {
        return weapon;
    }

    public void setWeapon(IWeapon weapon) {
        this.weapon = weapon;
    }


}
