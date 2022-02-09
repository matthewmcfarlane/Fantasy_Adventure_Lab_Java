package Players;

import Enemies.Orc;
import MeleeWeapons.Axe;
import MeleeWeapons.Club;
import MeleeWeapons.Sword;
import Players.Fighters.Knight;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class KnightTest {

    private Knight knight;
    private Sword sword;
    private Axe axe;
    private Club club;
    private Orc orc;

    @Before
    public void before(){
        sword = new Sword();
        axe = new Axe();
        club = new Club();
        knight = new Knight("Thor", 100, sword);
        orc = new Orc(100);
    }

    @Test
    public void hasWeapon() {
        assertEquals(sword, knight.getWeapon());
    }

    @Test
    public void canSwitchWeapon(){
        knight.switchWeapon(axe);
        knight.switchWeapon(club);
        assertEquals(club, knight.getWeapon());
    }

    @Test
    public void canAttackEnemy(){
        knight.attackEnemy(orc);
        assertEquals(50, orc.getHealthPoints());


    }


}
