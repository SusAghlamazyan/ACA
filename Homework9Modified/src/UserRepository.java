import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import java.util.Scanner;

/**
 * Created by Susanna.Aghlamazyan on 8/28/2016.
 */
public class UserRepository {

    public void addUser(User user){
        String fileName = "userList.txt";

        try{
            BufferedWriter bWriter = new BufferedWriter(new FileWriter(fileName, true));
            User.userId++;
            bWriter.write(user.toString());
            bWriter.newLine();
            bWriter.close();
        } catch(IOException e){
            System.out.println(e);
        }
    }
    public void editUser(User user){
        //Some Code Here
    }

    public void deleteUser(Integer userId){
        // Some Code Here
    }

    public void getUser(Integer userId){

    }

}
