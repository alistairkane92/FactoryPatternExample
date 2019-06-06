package Weapons.WeaponLibrary;

import Weapons.IAttack;

public class Dagger extends Weapon implements IAttack {
    public Dagger(int defaultDamage) {
        super(defaultDamage);
    }

    public String attack() {
        return "Dagger attack!";
    }
}
