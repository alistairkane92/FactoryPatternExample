package Weapons.WeaponLibrary;

public abstract class Weapon {
    private int defaultDamage;

    public Weapon(int defaultDamage) {
        this.defaultDamage = defaultDamage;
    }

    public int getDefaultDamage() {
        return defaultDamage;
    }

    public void setDefaultDamage(int defaultDamage) {
        this.defaultDamage = defaultDamage;
    }
}
