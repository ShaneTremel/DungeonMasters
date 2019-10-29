import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.FileNotFoundException;
import java.io.IOException;

public class SaveFileWriter{
    public static void writeToFile(String path, User user){
        BufferedWriter writer = null;
        System.out.println("Saving...");
        try{ 
            writer = new BufferedWriter(new FileWriter(path, false)); 
            String line = String.join(",",String.valueOf(user.getMaxHP()),String.valueOf(user.getCurrentHP()),String.valueOf(user.getAttackPower()),
                String.valueOf(user.getRunSpeed()),String.valueOf(user.getGold()),user.getClassName());
            writer.write(line);
            writer.close();
            System.out.println("Save Complete.");
        }
        catch(IOException e){System.out.println("Couldn't save file.");}
        catch(Exception e){System.out.println("Something went wrong.");}
    }
}
