import java.util.*;
import java.io.*;
import java.Weapons.*;
public class Shop extends Weapons
{
    private static int numItems;
    private static Weapons weapon = new Weapons("Sword", 1, 0, 0, 0);
    
    //Generates shop item
    public Shop()
    {
        this.weapon = weapon;
    }
    
    public void setShop(Weapons[] shop)
    {
        Weapons shopWeaponTemp = new Weapons("", 0, 0, 0, 0);

        shopWeaponTemp.setStats();
        shop[0].setWeapon(shopWeaponTemp);
        shopWeaponTemp.resetStats();
        shopWeaponTemp.setStats();
        shop[1].setWeapon(shopWeaponTemp);
        shopWeaponTemp.resetStats();
        shopWeaponTemp.setStats();
        shop[2].setWeapon(shopWeaponTemp);
        
    }
    
    public Weapons setWeapon(Weapons myWeapon)
    {
        return myWeapon;
    }
    
}
