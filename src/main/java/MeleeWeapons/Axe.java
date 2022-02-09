package MeleeWeapons;

import Behaviours.IWeapon;
import Enemies.Enemy;

public class Axe implements IWeapon {


    public void attack(Enemy enemy) {
        enemy.takeDamage(25);
    }
}
