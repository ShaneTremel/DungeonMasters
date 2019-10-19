import java.util.Scanner;
public class Dungeon{
    static Scanner input = new Scanner(System.in);
    public Dungeon(int roomCount, boolean fightState){
        // creates rooms 
        System.out.println("You walk into the dungeon, infront of you are "+
            roomCount + " rooms.");
        System.out.println("What room do you want to explore? (Type a number)");
        int userRoomNumber = input.nextInt();
        if(userRoomNumber == 1){
            System.out.println("You walk into the first room, a monster attacks you!");
            fightState = true;
        }
        if(userRoomNumber == 2){
            System.out.println("You walk into the second room, a chest sits on the ground, but it's locked...");
        }
        if(userRoomNumber == 3){
            System.out.println("You walk into the third room, you see a weapon on the ground");
        }
        if(userRoomNumber == 4){
            System.out.println("You walk into the fourth room, there's nothing here");
        }
        

    }
}