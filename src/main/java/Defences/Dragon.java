package Defences;

import Behaviours.IDefence;
import Enemies.Enemy;

public class Dragon implements IDefence {

    public void defend(Enemy enemy) {
        enemy.takeDamage(50);
    }
}
