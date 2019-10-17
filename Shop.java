import java.util.*;
import java.io.*;
public class Shop 
{
    private static int numItems = 3;
    private int itemCost = 0;
    private String shopName = "";

    public static Weapons[] setShop()
    {
        Weapons[] shop = new Weapons[numItems];

        Weapons shopWeaponTemp = new Weapons("Name", 0, 0, 0, 0);
        
        for(int i = 0; i < shop.length; i++)
        {
            if(shopWeaponTemp.getDamage() != 0)
            {
                shopWeaponTemp.resetStats();
                shopWeaponTemp.setStats();
                shop[i] = shopWeaponTemp;
            }
            else
            {
                shopWeaponTemp.setStats();
                shop[i] = shopWeaponTemp;
            }
        }

        return shop;
    }

}
