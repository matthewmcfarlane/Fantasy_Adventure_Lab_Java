package MeleeWeapons;

import Behaviours.IWeapon;
import Enemies.Enemy;

public class Sword implements IWeapon {


    public void attack(Enemy enemy) {
        enemy.takeDamage(50);
    }
}
