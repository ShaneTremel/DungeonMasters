import java.util.Scanner;
import java.util.Random;
public class Dungeon{
    private Scanner input = new Scanner(System.in);
    private boolean runDungeon = true;
    private String userInput = null;
    private boolean fightState = false;

    // add runDungeon so user can leave dungeon whenver, and arent forced to complete it
    // look at weapon damage and edit monster health where needed
    // coin system, drop when killed, gained when appropiate
    // randiomized dungeons 

    public Dungeon(){
        System.out.println("You walk into the dungeon... explore or exit?");

        while (runDungeon){
            userInput = getInput("What do you want to do?");
            checkInput(userInput);
        }
    }

    public String getInput(String message){
        System.out.println(message);
        String returnMessage = input.nextLine();
        return returnMessage;
    }

    public void checkInput(String userInput){
        if(userInput.equalsIgnoreCase("explore")){
            createRoom();
        }

        if(userInput.equalsIgnoreCase("exit")){
            System.out.println("Exiting Dungeon");
            runDungeon = false;
        }
    }

    public void createRoom(){
        Random r = new Random();
        int randomNumber = r.nextInt(4)+1;

        if (randomNumber == 1){
                System.out.println("You walk into the room, the door behind you slams shut!");
                monsterSpawn();
        }
        if(randomNumber == 2){
                System.out.println("You walk into the room, a chest sits on the ground...");
                chestSpawn();
        }
        if(randomNumber == 3){
                System.out.println("You walk into the room, you see a weapon on the ground");
                weaponSpawn();
        }
        if(randomNumber == 4){
            Random randNum = new Random();
            int npcNum = randNum.nextInt(101);
            if(npcNum >= 0 && npcNum <= 14)
            {
                userInput = getInput("You find an old soldier." + "\"Ive been lost for days!"  
                    + "Do you know the way out?\"" + " \nType yes to help or no to move on: ");
                boolean NPC = true;
                while(NPC){
                    userInput = getInput("You have to respond.");
                    if(userInput.equalsIgnoreCase("yes"))
                    {
                        System.out.println("You showed the soldier the way out. ");
                        NPC =false;
                    }
                    if(userInput.equalsIgnoreCase("no"))
                    {
                        System.out.println("You lied to the soldier and moved on, "
                            + "leaving him to look for the exit on his own. ");
                        NPC = false;
                    }
                }
            }
            else if(npcNum >= 15 && npcNum <= 29)
            {
                userInput = getInput("A spider crawls up to you. You ready"
                    + " your weapon, but the spider \ndoes not attack you. Do you"
                    + " wish to pet the spider? Type yes to pet or no to move on: ");
                boolean NPC = true;
                while(NPC){
                    userInput = getInput("So... You want to pet the spider?");
                    if(userInput.equalsIgnoreCase("yes"))
                    {
                        System.out.println("You pet the spider. It waved its legs in the air "
                            + ", then returned to the darkness from whence it came. ");
                        NPC = false;
                    }
                    if(userInput.equalsIgnoreCase("no"))
                    {
                        System.out.println("You ignored the spider and left the room. ");
                        NPC = false;
                    }
                }
            }
            else if(npcNum >= 30)
            {
                System.out.println("You walk into the room, there's nothing here");
            }
        }
    }

    public void monsterSpawn(){
        fightState = true;
        Random r = new Random();
        int randomNumber = r.nextInt(4);

        Monster currMonster = new Monster(randomNumber);

        System.out.printf("A %s rushes towards you.%n",currMonster.getMonsterType());
        userFight(currMonster,randomNumber);
    }

    public void userFight(Monster currMonster, int number){
        boolean userDead = false;
        boolean currMonsterDead = false;

        // fight takes place in while loop
        while(fightState){
            userInput = getInput("Fight or Run");
            if(userInput.equalsIgnoreCase("fight")){
                System.out.println("You attack the "+currMonster+" for "+User.getAttackPower()+" damage...");
                Monster.getCurrentHP()[number] = Monster.getCurrentHP()[number] - User.getAttackPower();
                System.out.println("Monsters health: "+Monster.getCurrentHP()[number]);
                
                System.out.println("The "+currMonster+"attacks back for "+Monster.getAttackPower()[number]+"!");
                User.loseHP(Monster.getAttackPower()[number]);
                System.out.println("Your health: "+User.getCurrentHP());
                if(Monster.getCurrentHP()[number] <= 0){
                    System.out.println("You've defeated the "+currMonster);
                    currMonsterDead = true;
                    fightState = false;
                }
                if(User.getCurrentHP() <= 0){
                    System.out.println("You were knocked out...\nYou wake up hours later in a barrack, your health has been restored.");
                    User.gainHP();
                    // User.setCoins(0);
                    fightState = false;
                    runDungeon = false;
                }
            }
            if(userInput.equalsIgnoreCase("run")){
                System.out.println("Leaving dungeon...");
                fightState = false;
                runDungeon = false;
            }
                
        }

    }

    public void chestSpawn(){
        Random r = new Random();
        int randomNumber = r.nextInt(3)+1;

        if(randomNumber == 1){ 
            System.out.println("You found coins");
            //add coins to inventory
        }
        if(randomNumber == 2){
            System.out.println("You found a weapon");
            //add weapon to inventory
            //get random weapon
        }
        if(randomNumber == 3){
            System.out.println("You found a potion"); 
            //add potion to inventory
            //get random potion
        }
    }

    public void weaponSpawn(){
        System.out.println("There's a weapon on the ground...");
    }
}