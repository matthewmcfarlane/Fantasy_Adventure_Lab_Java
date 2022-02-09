package Spells;

import Behaviours.ISpell;
import Enemies.Enemy;

public class Expelliarmus implements ISpell {

    public void cast(Enemy enemy) {
        enemy.takeDamage(10);
    }
}
