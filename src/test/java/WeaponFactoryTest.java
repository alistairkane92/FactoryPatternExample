import Weapons.IAttack;
import Weapons.WeaponFactory;
import Weapons.WeaponLibrary.Axe;
import Weapons.WeaponLibrary.Dagger;
import Weapons.WeaponLibrary.Sword;
import Weapons.WeaponType;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class WeaponFactoryTest {
    private WeaponFactory weaponFactory;

    @Before
    public void setUp() {
        weaponFactory = new WeaponFactory();
    }

    @Test
    public void canCreateAxe() {
        IAttack weapon = weaponFactory.create(WeaponType.AXE);
        assertEquals("Axe attack!", weapon.attack());
        assertEquals(50, ((Axe) weapon).getDefaultDamage());
    }

    @Test
    public void canCreateDagger() {
        IAttack weapon = weaponFactory.create(WeaponType.DAGGER);
        assertEquals("Dagger attack!", weapon.attack());
        assertEquals(25, ((Dagger) weapon).getDefaultDamage());
    }

    @Test
    public void canCreateSword() {
        IAttack weapon = weaponFactory.create(WeaponType.SWORD);
        assertEquals("Sword attack!", weapon.attack());
        assertEquals(40, ((Sword) weapon).getDefaultDamage());
    }
}
