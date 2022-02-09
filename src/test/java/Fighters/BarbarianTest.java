package Fighters;

import Enemies.Orc;
import MeleeWeapons.Axe;
import MeleeWeapons.Club;
import MeleeWeapons.Sword;
import Players.Fighters.Barbarian;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BarbarianTest {

    private Barbarian barbarian;
    private Sword sword;
    private Axe axe;
    private Club club;
    private Orc orc;

    @Before
    public void before(){
        sword = new Sword();
        axe = new Axe();
        club = new Club();
        barbarian = new Barbarian("Thor", 100, sword);
        orc = new Orc(100);
    }

    @Test
    public void hasWeapon() {
        assertEquals(sword, barbarian.getWeapon());
    }

    @Test
    public void canSwitchWeapon(){
        barbarian.switchWeapon(axe);
        barbarian.switchWeapon(club);
        assertEquals(club, barbarian.getWeapon());
    }

    @Test
    public void canAttackEnemy(){
        barbarian.attackEnemy(orc);
        assertEquals(50, orc.getHealthPoints());


    }


}
