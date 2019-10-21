import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.FileNotFoundException;
import java.io.IOException;

public class SaveFileWriter{
    public static void writeToFile(String path, User user){
        BufferedWriter writer = null;
        try{ 
            writer = new BufferedWriter(new FileWriter(path, false)); 
            String line = String.join(",",Integer.toString(user.getMaxHP()),Integer.toString(user.getCurrentHP()),Integer.toString(user.getAttackPower()),
                Integer.toString(user.getRunSpeed()),Integer.toString(user.getGold()));
            writer.write(line);
            writer.close();
        }
        catch(IOException e){System.out.println("Couldn't save file.");}
    }
}
