package HealingItems;

import Behaviours.IHeal;
import Players.Player;

public class Herb implements IHeal {

    public void heal(Player player) {
        player.setHealthPoints((player.getHealthPoints())+10);
    }
}
