import java.util.Scanner;
import java.lang.Math;
public class Main{
    static Scanner input = new Scanner(System.in);
    static boolean RUNGAME = true;
    static User user = null;
    static boolean setClass = false;
    static String userInput = null;
    final static String PATH = "saveFile.csv";

    public static void main(String[] args){
        System.out.println("Welcome to Dungeon Masters Java.  This is a text-based RPG.");
        
        userInput = getInput("Would you like to load a save file?");
        if(userInput.equalsIgnoreCase("yes")){userInput = "true";}
        hasSaveFile(Boolean.parseBoolean(userInput));
        
        while (!setClass){
            System.out.println("You can be a warrior, thief, or mage.");
            String userInput = getInput("What class do you want?");
            setClass(userInput);
        }
        if (setClass)
            help();
        
        while (RUNGAME){
            userInput = getInput("What do you want to do?");
            checkInput(userInput);
        }
    }

    public static void hasSaveFile(boolean hasSaveFile){
        if(hasSaveFile){
            User user = SaveFileReader.readFromFile(PATH);
            if (user != null)
                setClass = true;
            System.out.println(user);
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
            User user = new User("warrior",25,25,50,15,15);
            setClass = true;
        }
        if (className.equalsIgnoreCase("thief")){
            User user = new User("thief",25,25,15,50,30);
            setClass = true;
        }
        if (className.equalsIgnoreCase("mage")){
            User user = new User("mage",35,35,25,25,15);
            setClass = true;
        }
    }

    public static String getInput(String message){
        System.out.println(message);
        String returnMessage = input.nextLine();
        return returnMessage;
    }

    public static void checkInput(String userInput){
        if (userInput.equalsIgnoreCase("quit"))
            quit();
        if (userInput.equalsIgnoreCase("shop"))
            shop();
        if (userInput.equalsIgnoreCase("dungeon"))
            dungeon();
        if (userInput.equalsIgnoreCase("help"))
            help();  
        if (userInput.equalsIgnoreCase("save"))
            save();  
    }
    
    public static void save(){
        SaveFileWriter.writeToFile(PATH,user);
    }
    
    public static void help(){
        System.out.println("You can type shop to visit the shop, or you can type dungeon to explore the dungeon.(type 'quit' to quit)");
    }

    public static void quit(){
        String areYouSure = getInput("Are you sure you want to quit?  Any unsaved data will be lost.");
        if(areYouSure.equalsIgnoreCase("yes") || areYouSure.equalsIgnoreCase("y")){
            RUNGAME = false;
            System.out.println("Thanks for playing!");
        }
    }

    public static void shop(){
        System.out.printf("You have this much gold: %d%n",User.getGold());
    }  
    
    public static void dungeon(){
        Dungeon dungeon = new Dungeon(4);        
    }   

}