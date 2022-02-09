package Fighters;

import Enemies.Orc;
import MeleeWeapons.Axe;
import MeleeWeapons.Club;
import MeleeWeapons.Sword;
import Players.Fighters.Dwarf;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DwarfTest {

    private Dwarf dwarf;
    private Sword sword;
    private Axe axe;
    private Club club;
    private Orc orc;

    @Before
    public void before(){
        sword = new Sword();
        axe = new Axe();
        club = new Club();
        dwarf = new Dwarf("Thor", 100, sword);
        orc = new Orc(100);
    }

    @Test
    public void hasWeapon() {
        assertEquals(sword, dwarf.getWeapon());
    }

    @Test
    public void canSwitchWeapon(){
        dwarf.switchWeapon(axe);
        dwarf.switchWeapon(club);
        assertEquals(club, dwarf.getWeapon());
    }

    @Test
    public void canAttackEnemy(){
        dwarf.attackEnemy(orc);
        assertEquals(50, orc.getHealthPoints());


    }


}
