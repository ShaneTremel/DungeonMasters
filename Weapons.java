/*import java.io.*;
import java.util.*;

public class Weapons
{
    private int damage;     //Damage weapon does, randomly generated based on rarity
    private String type;   //Weapon type: Sword, Axe, Bow, etc
    private int rarity;      //Randomly generated spawn rate
    private int levelLock;   //Locks rare weapons until certain level is attained
    private int cost;

    //Constructor for all weapons
    public Weapons(String type, int damage, int rarity, int levelLock, int cost) 
    {
        this.type = type;
        this.damage = damage;
        this.rarity = rarity;
        this.levelLock = levelLock;
        this.cost = cost;
    }

    //Starting weapon
    public void Weapons(String type)
    {
        this.type = type;
        damage = 10;
        rarity = 0;
        levelLock = 0;
    }

    public void resetStats()
    {
        this.type = "";
        this.damage = 0;
        this.rarity = 1;
        this.levelLock = 0;
        this.cost = 0;
    }

    public String getType()
    {
        return type;
    }

    public int getDamage()
    {
        return damage;
    }

    public int getRarity()
    {
        return rarity;
    }

    public int getLevelLock()
    {
        return levelLock;
    }

    public int getCost()
    {
        return cost;
    }

    public void setStats()
    {
        Random randNum = new Random();
        int typeNum = randNum.nextInt(3);
        
        if(typeNum == 0)
        {
            type = "Sword";
        }
        else if(typeNum == 1)
        {
            type = "Axe";
        }
        else
        {
            type = "Bow";
        }
        
        int rarityNum = randNum.nextInt(101);
        
        //Tier 1 Weapons
        if(rarityNum > 0 && rarityNum <= 50)
        {
            rarity = 1;
            damage = randNum.nextInt(30);
            levelLock = 0;
            cost = randNum.nextInt(20);
            if(damage < 10)
            {
                damage = 10 + randNum.nextInt(15);
            }
            if(cost < 5)
            {
                cost = 10;
            }
        }
        //Tier 2 Weapons
        else if(rarityNum > 51 && rarityNum <=85)
        {
            rarity = 2;
            damage = randNum.nextInt(60);
            levelLock = 5;
            cost = randNum.nextInt(40);
            if(damage < 30)
            {
                damage = 30 + randNum.nextInt(30);
            }
            if(cost < 25)
            {
                cost = 25;
            }
        }
        //Tier 3 Weapons
        else if(rarityNum > 86 && rarityNum <= 100)
        {
            rarity = 3;
            damage = randNum.nextInt(90);
            levelLock = 10;
            cost = randNum.nextInt(75);
            if(damage < 60)
            {
                damage = 60 + randNum.nextInt(50);
            }
            if(cost < 50)
            {
                cost = 50;
            }
        }
        
    }
    
    public String print()
    {
        Weapons newWeapon1 = new Weapons("type", 0, 0, 0, 0);
        
        Shop shop[] = new Shop[3];
        for(int x = 0; x < 3; x++)
        {
            newWeapon1.resetStats();
            newWeapon1.setStats();
            shop[x].setWeapon(newWeapon1);
        }
    
        return shop[0].getType() + ", " + shop[0].getDamage() + "\n" + shop[1].getType() + ", " + shop[1].getDamage();
    }
}
*/