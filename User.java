public class User{
    //Instance Variables
    private int maxHP;
    private int currentHP;
    private int attackPower;
    private int runSpeed;
    
    //Constructor
    /*public Movie(String myTitle, String myDirector, int myYear, double myRating){
        title = myTitle;
        director = myDirector;
        year = myYear;
        rating = myRating;
    }*/
    
    public User(int maxHP, int currentHP, int attackPower, int runSpeed){
        this.maxHP = maxHP;
        this.currentHP = currentHP;
        this.attackPower = attackPower;
        this.runSpeed = runSpeed;
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
    
    //Methods
}
