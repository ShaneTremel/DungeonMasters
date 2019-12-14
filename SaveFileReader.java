import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;

public class SaveFileReader{
    public static User readFromFile(String path){
        BufferedReader reader = null;
        User user = null;
        int[] userInfo = {0,0,0,0,0};
        try{ 
            reader = new BufferedReader(new FileReader(path)); String line = reader.readLine();
            String[] data = line.split(",");
            for(int i = 0; i<5; i++){
                userInfo[i] = Integer.parseInt(data[i]);
            }
            user = new User(data[5],userInfo[0],userInfo[1],userInfo[2],userInfo[3],userInfo[4]);
            reader.close();
        }
        catch(FileNotFoundException e){System.out.println("Could not read from save file.");}
        catch(IOException e){System.out.println("Error while reading from save file.");}
        catch(NumberFormatException e){System.out.println("Save file not valid.");}
        catch(Exception e){System.out.println("Something went wrong");}
        finally{return user;}
    }
}