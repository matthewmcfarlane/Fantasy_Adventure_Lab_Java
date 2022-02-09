package Enemy;

import Enemies.Orc;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class OrcTest {

    private Orc orc;

    @Before
    public void before(){
        orc = new Orc(25);
    }

    @Test
    public void canTakeDamagePastHealthPoints() {
        assertEquals("I am dead", orc.takeDamage(100));
        assertEquals(0, orc.getHealthPoints());
    }

    @Test
    public void canTakeDamageExactHealthPoints(){
        assertEquals("I am dead", orc.takeDamage(25));
        assertEquals(0, orc.getHealthPoints());
    }

    @Test
    public void canTakeDamageLessThanHealthPoints(){
        assertEquals("Ouch", orc.takeDamage(20));
        assertEquals(5, orc.getHealthPoints());
    }



}
