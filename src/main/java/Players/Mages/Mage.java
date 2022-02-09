package Players.Mages;

import Behaviours.IDefence;
import Behaviours.ISpell;
import Enemies.Enemy;

public abstract class Mage {

    private ISpell spell;
    private IDefence defence;

    public Mage(ISpell spell, IDefence defence) {
        this.spell = spell;
        this.defence = defence;
    }

    public ISpell getSpell() {
        return spell;
    }

    public IDefence getDefence() {
        return defence;
    }

    public void setSpell(ISpell spell) {
        this.spell = spell;
    }

    public void setDefence(IDefence defence) {
        this.defence = defence;
    }

    public void castSpell(Enemy enemy){
        spell.cast(enemy);
    }

    public void useDefence(Enemy enemy) {
        defence.defend(enemy);
    }
}
