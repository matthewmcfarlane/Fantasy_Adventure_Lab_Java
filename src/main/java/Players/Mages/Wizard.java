package Players.Mages;

import Behaviours.IDefence;
import Behaviours.ISpell;

public class Wizard extends Mage{

    public Wizard(ISpell spell, IDefence defence) {
        super(spell, defence);
    }
}
