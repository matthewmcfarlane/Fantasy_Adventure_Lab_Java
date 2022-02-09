package Spells;

import Behaviours.ISpell;
import Enemies.Enemy;

public class FireBlast implements ISpell {

    public void cast(Enemy enemy) {
        enemy.takeDamage(22);
    }
}
