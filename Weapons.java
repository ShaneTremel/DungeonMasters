import java.io.*;
import java.util.*;
//Create level lock for weapon based on stats
//Create randomly generated stats
//

public class Weapons
{
    private int damage = 0;      //Damage weapon does, randomly generated based on rarity
    private String type = "";    //Weapon type: Sword, Axe, Bow, etc
    private int rarity = 0;      //Randomly generated spawn rate
    private int levelLock = 0;   //Locks rare weapons until certain level is attained

    //Constructor for all weapons
    public Weapons(String type, int damage, int rarity, int levelLock) 
    {
        this.type = type;
        this.damage = damage;
        this.rarity = rarity;
        this.levelLock = levelLock;
    }

    //Starting weapon
    public void Weapons(String type)
    {
        this.type = type;
        damage = 10;
        rarity = 0;
        levelLock = 0;
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
        if(rarityNum > 0 && rarityNum <= 45)
        {
            rarity = 1;
            damage = randNum.nextInt(30);
            levelLock = 0;
            if(damage < 10)
            {
                damage = 10 + randNum.nextInt(15);
            }
            
        }
        //Tier 2 Weapons
        else if(rarityNum > 46 && rarityNum <=80)
        {
            rarity = 2;
            damage = randNum.nextInt(60);
            levelLock = 5;
            if(damage < 30)
            {
                damage = 30 + randNum.nextInt(30);
            }
        }
        //Tier 3 Weapons
        else if(rarityNum > 81 && rarityNum <= 100)
        {
            rarity = 3;
            damage = randNum.nextInt(90);
            levelLock = 10;
            if(damage < 60)
            {
                damage = 60 + randNum.nextInt(50);
            }
        }
    }

}