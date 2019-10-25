
public class Monster{
    private static int[] pickMoster = new int[]{1,2,3,4};
    private static String[] monsterType = new String[]{"spider","goblin","beast","golem" };
    private static int[] maxHP = new int[]{75,50,120,300};
    private static int[] currentHP = new int[]{75,50,120,300};
    private static int[] attackPower = new int[]{7,5,13,5};
    public Monster(String monsterType[], int maxHP[], int currentHP[],int attackPower[]){
        this.monsterType = monsterType;
        this.maxHP = maxHP;
        this.currentHP = currentHP;
        this.attackPower = attackPower;
    }
    
    // getters and setters
    public static int[] getCurrentHP(){
        return currentHP;
    }
    public static int[] getMaxHP(){
        return maxHP;
    }
    public static int[] getAttackPower(){
        return attackPower;
    }
    public static String[] getMonsterType(){
        return monsterType;
    }
    
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
}
