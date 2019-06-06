package Weapons.WeaponLibrary;

import Weapons.IAttack;

public class Axe extends Weapon implements IAttack {
    public Axe(int defaultDamage) {
        super(defaultDamage);
    }

    public String attack() {
        return "Axe attack!";
    }
}
