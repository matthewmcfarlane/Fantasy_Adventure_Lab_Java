package Mages;

import Behaviours.IDefence;
import Behaviours.ISpell;
import Defences.Dragon;
import Defences.Ogre;
import Enemies.Enemy;
import Enemies.Troll;
import Players.Mages.Warlock;
import Spells.Curse;
import Spells.Expelliarmus;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class WarlockTest {

    private Warlock warlock;
    private ISpell spell;
    private IDefence defence;
    private Enemy enemy;

    @Before
    public void before(){
        spell = new Expelliarmus();
        defence = new Ogre();
        warlock = new Warlock(spell, defence);
        enemy = new Troll(120);
    }

    @Test
    public void hasSpell(){
        assertEquals(spell, warlock.getSpell());
    }

    @Test
    public void hasDefence(){
        assertEquals(defence, warlock.getDefence());
    }

    @Test
    public void canCastSpell(){
        warlock.castSpell(enemy);
        assertEquals(110, enemy.getHealthPoints());
    }

    @Test
    public void canChangeSpell(){
        assertEquals(spell, warlock.getSpell());
        ISpell spell2 = new Curse();
        warlock.setSpell(spell2);
        assertEquals(spell2, warlock.getSpell());
    }

    @Test
    public void canUseDefence(){
        warlock.useDefence(enemy);
        assertEquals(105, enemy.getHealthPoints());
    }

    @Test
    public void canChangeDefence(){
        assertEquals(defence, warlock.getDefence());
        IDefence defence2 = new Dragon();
        warlock.setDefence(defence2);
        assertEquals(defence2,warlock.getDefence());
    }
}
