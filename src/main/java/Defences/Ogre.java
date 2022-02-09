package Defences;

import Behaviours.IDefence;
import Enemies.Enemy;

public class Ogre implements IDefence {

    public void defend(Enemy enemy) {
        enemy.takeDamage(15);
    }
}
