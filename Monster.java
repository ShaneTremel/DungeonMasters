import java.util.Random;
public class Monster{
    private int[] pickMoster = new int[]{1,2,3,4};
    private String[] monsterType = new String[]{"spider","goblin","beast","golem" };
    private int[] maxHP = new int[]{75,50,120,300};
    private int[] currentHP = new int[]{75,50,120,300};
    private int[] attackPower = new int[]{7,5,13,5};
    private String ranMonsterType;
    private int ranMaxHP;
    private int ranCurrentHP;
    private int ranAttackPower;
    
    public Monster(int r){    
        ranMonsterType = monsterType[r]; 
        ranMaxHP = maxHP[r];
        ranCurrentHP = currentHP[r];
        ranAttackPower = attackPower[r];
    }
    
    // getters and setters
    public int[] getCurrentHP(){
        return currentHP;
    }
    public int[] getMaxHP(){
        return maxHP;
    }
    public int[] getAttackPower(){
        return attackPower;
    }
    public String[] getMonsterType(){
        return monsterType;
    }
    
    //DO WE NEED ANY FOF THESE SETTERS?
    public void setCurrentHP(int[] currentHP){
        this.currentHP = currentHP;
    }
    public void setMaxHP(int[] maxHP){
        this.maxHP = maxHP;
    }
    public void setAttackPower(int[] attackPower){
        this.attackPower = attackPower;
    }
    public void setMonsterType(String[] monsterType){
        this.monsterType = monsterType;
    }
    
    //To String
    @Override
    public String toString(){
        return ranMonsterType;
    }
}
