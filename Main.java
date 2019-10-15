import java.util.Scanner;
public class Main{
    static Scanner input = new Scanner(System.in);
    static boolean RUNGAME = true;
    static boolean setClass = false;
    static String userInput = null;
    final static String PATH = "saveFile.csv";
    
    public static void main(String[] args){
        System.out.println("Welcome to Dungeon Masters Java.  This is a text-based RPG.  Would you like to load a save file?");
        userInput = getInput("Would you like to load a save file?");
        if(userInput.equalsIgnoreCase("yes")){userInput = "true";}
        hasSaveFile(Boolean.parseBoolean(userInput));
       
        while (RUNGAME){
            System.out.println("You can type shop to visit the shop, or you can type dungeon to explore the dungeon.(type 'quit' to quit)");
            userInput = getInput("What do you want to do?");
            checkInput(userInput);
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
    public static void dungeon(){
        
    }    
}
