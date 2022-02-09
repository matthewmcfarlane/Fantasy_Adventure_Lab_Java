package Players;

import Behaviours.IWeapon;
import MeleeWeapons.Axe;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BarbarianTest {

    private Barbarian barbarian;
    private Axe axe;

    @Before
    public void before(){
        axe = new Axe();
        barbarian = new Barbarian("Thor", 100, axe);
    }

    @Test
    public void hasWeapon() {
        assertEquals(axe, barbarian.getWeapon());
    }
}
