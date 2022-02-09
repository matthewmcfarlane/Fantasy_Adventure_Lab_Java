package Spells;

import Behaviours.ISpell;
import Enemies.Enemy;

public class Curse implements ISpell {

    public void cast(Enemy enemy) {
        enemy.takeDamage(40);
    }
}
