import java.util.Random;
public class Monster{
    private static int[] pickMoster = new int[]{1,2,3,4};
    private static String[] monsterType = new String[]{"spider","goblin","beast","golem" };
    private static int[] maxHP = new int[]{75,50,120,300};
    private static int[] currentHP = new int[]{75,50,120,300};
    private static int[] attackPower = new int[]{7,5,13,5};

    
    public Monster(int r){
        String ranMonsterType;
        ranMonsterType = monsterType[r];
        
        int ranMaxHP;
        ranMaxHP = maxHP[r];
        
        int ranCurrentHP;
        ranCurrentHP = currentHP[r];
        
        int ranAttackPower;
        ranAttackPower = attackPower[r];
        System.out.println(ranMonsterType+ ","+ranMaxHP+","+ranCurrentHP+","+ranAttackPower);
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
