import java.util.Scanner;
public class Main{
    static Scanner input = new Scanner(System.in);
    static boolean RUNGAME = true;
    public static void main(String[] args){
        System.out.println("Welcome to Dungeon Masters Java.  This is a text-based RPG.");
        while (RUNGAME){
            System.out.println("You can type shop to visit the shop, or you can type dungeon to explore the dungeon.");
            String userInput = getInput("What do you want to do?");
            checkInput(userInput);
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
