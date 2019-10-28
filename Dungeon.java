import java.util.Scanner;
import java.util.Random;
public class Dungeon{
    private Scanner input = new Scanner(System.in);
    private boolean runDungeon = true;
    private boolean inRoom = true;
    private String userInput = null;

    // add runDungeon so user can leave dungeon whenver, and arent forced to complete it
    // look at weapon damage and edit monster health where needed
    // coin system, drop when killed, gained when appropiate
    // randiomized dungeons 

    public Dungeon(int rooms){
        System.out.printf("You walk into the dungeon, in front of you are %d rooms.%n",rooms);

        while (runDungeon){
            userInput = getInput("What room do you want to explore? (1-"+rooms+") type 'exit' to leave dungeon");
            checkInput(userInput,rooms);
        }
    }

    public String getInput(String message){
        System.out.println(message);
        String returnMessage = input.nextLine();
        return returnMessage;
    }

    public void checkInput(String userInput,int roomCount){
        if(Integer.parseInt(userInput) == 1){
            createRoom();
        }
        else if(Integer.parseInt(userInput) == 2){
            createRoom();
        }
        else if(Integer.parseInt(userInput) == 3){
            createRoom();
        }
        else if(Integer.parseInt(userInput) == 4){
            createRoom();
        }
        else if(userInput.equalsIgnoreCase("exit")){
            System.out.println("Exiting Dungeon");
            runDungeon = false;
        }
    }

    public void createRoom(){
        Random r = new Random();
        int randomNumber = r.nextInt(4)+1;

        if (randomNumber == 1){
            while(inRoom){
                System.out.println("You walk into the room, the door behind you slams shut!");
                monsterSpawn();
            }
        }
        if(randomNumber == 2){
            while(inRoom){
                System.out.println("You walk into the room, a chest sits on the ground...");
                chestSpawn();
            }
        }
        if(randomNumber == 3){
            while(inRoom){
                System.out.println("You walk into the room, you see a weapon on the ground");
                weaponSpawn();
            }
        }
        if(randomNumber == 4){
            Random randNum = new Random();
            int npcNum = randNum.nextInt(101);
            if(npcNum >= 0 && npcNum <= 14)
            {
                userInput = getInput("You find an old soldier." + "\"Ive been lost for days!"  
                    + "Do you know the way out?\"" + " \nType yes to help or no to move on: ");
                if(userInput.equalsIgnoreCase("yes"))
                {
                    System.out.println("You showed the soldier the way out. ");
                }
                else if(userInput.equalsIgnoreCase("no"))
                {
                    System.out.println("You lied to the soldier and moved on, "
                        + "leaving him to look for the exit on his own. ");
                }
            }
            else if(npcNum >= 15 && npcNum <= 29)
            {
                userInput = getInput("A spider crawls up to you. You ready"
                    + " your weapon, but the spider \ndoes not attack you. Do you"
                    + " wish to pet the spider? Type yes to pet or no to move on: ");
                if(userInput.equalsIgnoreCase("yes"))
                {
                    System.out.println("You pet the spider. It waved its legs in the air "
                        + ", then returned to the darkness from whence it came. ");
                }
                else if(userInput.equalsIgnoreCase("no"))
                {
                    System.out.println("You ignored the spider and left the room. ");
                }
            }
            else if(npcNum >= 30)
            {
                System.out.println("You walk into the room, there's nothing here");
            }
        }
    }

    public void monsterSpawn(){
        Random r = new Random();
        int randomNumber = r.nextInt(4);

        Monster currMonster = new Monster(randomNumber);

        System.out.printf("A %s rushes towards you.%n",currMonster.getMonsterType());
        inRoom = false;
        /*while(!(userInput.equalsIgnoreCase("run"))){
        userInput = getInput("RUN or ATTACK");
        if(userInput.equalsIgnoreCase("attack"))
        //userFight(currMonster);
        if(userInput.equalsIgnoreCase("run"))
        System.out.println("You ran away");
        }*/
    }

    public void userFight(Monster currMonster){
        boolean userDead = false;
        boolean currMonsterDead = false;

        // get rid of int user = get, use setters instead... call lose hp
        // user hp + attack

        // monster hp + attack

        // fight takes place in while loop
        while(userDead == false || currMonsterDead == false){

        }

        if(userDead == true){
            System.out.println("You are dead");
            //User.setCoins(0);

        }
    }

    public void chestSpawn(){
        Random r = new Random();
        int randomNumber = r.nextInt(3);

        if(randomNumber == 0){
            randomNumber++;
            System.out.println("You found coins");
            //add coins to inventory
        }
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
        inRoom = false;
    }

    public void weaponSpawn(){
        System.out.println("There's a weapon on the ground...");
        inRoom = false;
    }
}