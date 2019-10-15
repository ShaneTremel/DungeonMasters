public class User{
    //Instance Variables
    private int maxHP;
    private int currentHP;
    private int attackPower;
    private int runSpeed;
    private static int gold;
    
    //Constructor
    public User(int maxHP, int currentHP, int attackPower, int runSpeed){
        this.maxHP = maxHP;
        this.currentHP = currentHP;
        this.attackPower = attackPower;
        this.runSpeed = runSpeed;
    }
    public User(int maxHP, int currentHP, int attackPower, int runSpeed, int gold){
        this.maxHP = maxHP;
        this.currentHP = currentHP;
        this.attackPower = attackPower;
        this.runSpeed = runSpeed;
        this.gold = gold;
    }
    
    //Getters and Setters
    public int getCurrentHP(){
        return currentHP;
    }
    public int getMaxHP(){
        return maxHP;
    }
    public int getAttackPower(){
        return attackPower;
    }
    public int getRunSpeed(){
        return runSpeed;
    }
    public static int getGold(){
        return gold;
    }
    
    //Methods
}
