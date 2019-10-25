import java.util.Scanner;
import java.util.Random;
public class Dungeon{
    static Scanner input = new Scanner(System.in);
    static boolean runDungeon = true;
    static String userInput = null;
    // add runDungeon so user can leave dungeon whenver, and arent forced to complete it
    // look at weapon damage and edit monster health where needed
    // coin system, drop when killed, gained when appropiate
    // randiomized dungeons 

    public Dungeon(int roomCount){
        // creates rooms 
        System.out.printf("You walk into the dungeon, in front of you are %d rooms.%n",roomCount);

        while (runDungeon){
            userInput = getInput("What room do you want to explore? (one,two,three,four)");
            checkInput(userInput);
        }
    }

    public static String getInput(String message){
        System.out.println(message);
        String returnMessage = input.nextLine();
        return returnMessage;
    }

    public void checkInput(String userInput){
        //System.out.println("Type 'exit' to exit current dungeon");
        while(!(userInput.equalsIgnoreCase("exit"))){
            if(userInput.equalsIgnoreCase("one")){
                System.out.println("You walk into the first room, the door behind you slams shut!");
                monsterSpawn();
            }
            if(userInput.equalsIgnoreCase("two")){
                System.out.println("You walk into the second room, a chest sits on the ground, but it's locked...");
            }
            if(userInput.equalsIgnoreCase("three")){
                System.out.println("You walk into the third room, you see a weapon on the ground");
            }
            if(userInput.equalsIgnoreCase("four")){
                System.out.println("You walk into the fourth room, there's nothing here");
            }
            if(userInput.equalsIgnoreCase("exit")){
                System.out.println("Exiting Dungeon");
                runDungeon = false;
            }
        }
    }

    public void monsterSpawn(){
        Random r = new Random();
        int randomNumber = r.nextInt(4);

        Monster currMonster = new Monster(randomNumber);

        System.out.println(randomNumber);
        System.out.println("A "+Monster.getMonsterType()+ " rushes towards you.");

        while(!(userInput.equalsIgnoreCase("run"))){
            userInput = null;
            userInput = getInput("RUN or ATTACK");
            if(userInput.equalsIgnoreCase("attack"))
                userFight(currMonster);
            // add run option
        }
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
}