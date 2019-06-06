package Weapons;

import Weapons.WeaponLibrary.Axe;
import Weapons.WeaponLibrary.Dagger;
import Weapons.WeaponLibrary.Sword;

public class WeaponFactory {

    public IAttack create(WeaponType type){
        if (type.equals(WeaponType.AXE)){
            return new Axe(50);
        } else if (type.equals(WeaponType.DAGGER)){
            return new Dagger(25);
        } else if (type.equals(WeaponType.SWORD)){
            return new Sword(40);
        }
        return null;
    }
}
