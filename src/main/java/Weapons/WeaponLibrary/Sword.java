package Weapons.WeaponLibrary;

import Weapons.IAttack;

public class Sword extends Weapon implements IAttack {
    public Sword(int defaultDamage) {
        super(defaultDamage);
    }

    public String attack() {
        return "Sword attack!";
    }
}
