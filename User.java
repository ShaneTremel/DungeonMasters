public class User{
    //Instance Variables
    private String className;
    private int maxHP;
    private int currentHP;
    private int attackPower;
    private int runSpeed;
    private int gold;
    
    //Constructor
    public User(String className, int maxHP, int currentHP, int attackPower, int runSpeed, int gold){
        this.maxHP = maxHP;
        this.currentHP = currentHP;
        this.attackPower = attackPower;
        this.runSpeed = runSpeed;
        this.gold = gold;
        this.className = className;
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
    public int getGold(){
        return gold;
    }
    public String getClassName(){
        return className;
    }
    
    //Methods
    public String toString(){
        return String.format("Welcome back!  You are a %s with %d/%d HP, a weapon that inflicts %d damage"+
            ", a running speed of up to %d kilometers/hour, and %d gold.%n", className, currentHP,maxHP,
            attackPower,runSpeed,gold);
    }
    public void loseHP(int damage){
        currentHP = currentHP - damage;
    }
}
