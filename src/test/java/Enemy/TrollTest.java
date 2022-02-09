package Enemy;
import Enemies.Troll;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TrollTest {

    private Troll troll;

    @Before
    public void before(){
        troll = new Troll(25);
    }

    @Test
    public void canTakeDamagePastHealthPoints() {
        assertEquals("I am dead", troll.takeDamage(100));
        assertEquals(0, troll.getHealthPoints());
    }

    @Test
    public void canTakeDamageExactHealthPoints(){
        assertEquals("I am dead", troll.takeDamage(25));
        assertEquals(0, troll.getHealthPoints());
    }

    @Test
    public void canTakeDamageLessThanHealthPoints(){
        assertEquals("Ouch", troll.takeDamage(20));
        assertEquals(5, troll.getHealthPoints());
    }



}
