package Mages;

import Behaviours.IDefence;
import Behaviours.ISpell;
import Defences.Dragon;
import Defences.Ogre;
import Enemies.Enemy;
import Enemies.Orc;
import Players.Mages.Wizard;
import Spells.Curse;
import Spells.FireBlast;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class WizardTest {

    private Wizard wizard;
    private ISpell spell;
    private IDefence defence;
    private Enemy enemy;

    @Before
    public void before(){
        spell = new Curse();
        defence = new Dragon();
        wizard = new Wizard(spell, defence);
        enemy = new Orc(100);
    }

    @Test
    public void hasSpell(){
        assertEquals(spell, wizard.getSpell());
    }

    @Test
    public void hasDefence(){
        assertEquals(defence, wizard.getDefence());
    }

    @Test
    public void canCastSpell(){
        wizard.castSpell(enemy);
        assertEquals(60, enemy.getHealthPoints());
    }

    @Test
    public void canChangeSpell(){
        assertEquals(spell, wizard.getSpell());
        ISpell spell2 = new FireBlast();
        wizard.setSpell(spell2);
        assertEquals(spell2, wizard.getSpell());
    }

    @Test
    public void canUseDefence(){
        wizard.useDefence(enemy);
        assertEquals(50, enemy.getHealthPoints());
    }

    @Test
    public void canChangeDefence(){
        assertEquals(defence, wizard.getDefence());
        IDefence defence2 = new Ogre();
        wizard.setDefence(defence2);
        assertEquals(defence2,wizard.getDefence());
    }
}
