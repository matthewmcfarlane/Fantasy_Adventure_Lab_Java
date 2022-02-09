package Healers;

import HealingItems.Herb;
import HealingItems.Potion;
import MeleeWeapons.Axe;
import Players.Fighters.Dwarf;
import Players.Healers.Cleric;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ClericTest {

    private Dwarf dwarf;
    private Potion potion;
    private Cleric cleric;
    private Axe axe;
    private Herb herb;

    @Before
    public void before(){
        axe = new Axe();
        dwarf = new Dwarf("ABC", 10,axe);
        herb = new Herb();
        potion = new Potion();
        cleric = new Cleric("Raj", 100, potion);
    }

    @Test
    public void canGetHeals() {
        assertEquals(potion, cleric.getHeals());
    }

    @Test
    public void canSwitchHeals() {
        cleric.setHeals(herb);
        assertEquals(herb, cleric.getHeals());

    }

    @Test
    public void canHealPlayer() {
        cleric.healPlayer(dwarf);
        assertEquals(30, dwarf.getHealthPoints());
    }
}
