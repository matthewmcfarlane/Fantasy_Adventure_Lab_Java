package MeleeWeapons;

import Behaviours.IWeapon;
import Enemies.Enemy;

public class Club implements IWeapon {


    public void attack(Enemy enemy) {
        enemy.takeDamage(15);
    }
}
