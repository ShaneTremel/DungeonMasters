import java.util.Scanner;
import java.lang.Math;
public class Main{
    static Scanner input = new Scanner(System.in);
    static boolean RUNGAME = true;
    static boolean setClass = false;
    static String userInput = null;
    final static String PATH = "saveFile.csv";
    static boolean fightState = false;

    static int numberOfRooms = 4;//(int)Math.floor(Math.random()*5+1);

    public static void main(String[] args){
        System.out.println("Welcome to Dungeon Masters Java.  This is a text-based RPG.  Would you like to load a save file?");
        userInput = getInput("Would you like to load a save file?");
        if(userInput.equalsIgnoreCase("yes")){userInput = "true";}
        hasSaveFile(Boolean.parseBoolean(userInput));

        while (RUNGAME){
            System.out.println("You can type shop to visit the shop, or you can type dungeon to explore the dungeon.(type 'quit' to quit)");
            userInput = getInput("What do you want to do?");
            checkInput(userInput);
            RUNGAME = false;
            if(userInput.equalsIgnoreCase("shop"))
                System.out.println("You have this much gold"+User.getGold());
        }
    }

    public static void hasSaveFile(boolean hasSaveFile){
        if(hasSaveFile){
            setClass = true;
            User user = SaveFileReader.readFromFile(PATH);;
        }
    }

    public static void trySetClass(){
        while (!setClass){
            System.out.println("You can be a warrior, thief, or mage.");
            userInput = getInput("What class do you want?");
            setClass(userInput);
        }
    }

    public static void setClass(String className){
        if (className.equalsIgnoreCase("warrior")){
            User user = new User(25,25,50,15);
            setClass = true;
        }
        if (className.equalsIgnoreCase("thief")){
            User user = new User(25,25,15,50);
            setClass = true;
        }
        if (className.equalsIgnoreCase("mage")){
            User user = new User(35,35,25,25);
            setClass = true;
        }
    }

    public static String getInput(String message){
        System.out.println(message);
        String returnMessage = input.nextLine();
        return returnMessage;
    }

    public static void checkInput(String userInput){
        if (userInput.equalsIgnoreCase("quit")){
            quit();
        }
        if (userInput.equalsIgnoreCase("shop")){
            shop();
        }
        if (userInput.equalsIgnoreCase("dungeon")){
            dungeon();
        }
    }

    public static void quit(){
        String areYouSure = getInput("Are you sure you want to quit?  Any unsaved data will be lost.");
        if(areYouSure.equalsIgnoreCase("yes") || areYouSure.equalsIgnoreCase("y")){
            RUNGAME = false;
            System.out.println("Thanks for playing!");
        }
    }

    public static void shop(){

    }  
    // 4 rooms - filled with treasure, weapons, potions, or monsters

    public static void dungeon(){
        // ask user for action
        System.out.println("You walk into the dungeon, infront of you are "+
            numberOfRooms + " rooms.");
        System.out.println("What room do you want to explore? (Type a number)");
        int userRoomNumber = input.nextInt();
        // defualt room 1 (needs to be random eventually)
        if(userRoomNumber == 1){
            System.out.println("You walk into the first room, a monster attacks you!");
            fightState = true;
        }
        // defualt room 2 (needs to be random eventually)
        if(userRoomNumber == 2){
            System.out.println("You walk into the second room, a chest sits on the ground, but it's locked...");

        }
        // defualt room 3 (needs to be random eventually)
        if(userRoomNumber == 3){
            System.out.println("You walk into the third room, you see a weapon on the ground");
            
        }
        // defualt room 4 (needs to be random eventually)
        if(userRoomNumber == 4){
            System.out.println("You walk into the fourth room, there's nothing here");

        }
    }   

}