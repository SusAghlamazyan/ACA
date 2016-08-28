import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 * Created by Susanna.Aghlamazyan on 8/26/2016.
 */
public class User {
    private String userName;
    private String password;
    private String filePath;

    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void addUser(String userName, String password, String filePath){
        if(userName != null && password !=null){
            this.userName = userName;
            this.password = password;
            this.filePath = filePath;

            try{
                BufferedWriter bWriter = new BufferedWriter(new FileWriter(filePath + "\\userList.txt", true));
                bWriter.write(userName + "-" + password);
                Scanner sc = new Scanner(System.in);
                System.out.println("You have successfully created user. Please write down one of this commands \"Sign In\" or \"Sign Up\".");
                String inseretedValue = sc.nextLine();
                if(inseretedValue.equals("SignIn")){
                    Main.signIn();
                } else if(inseretedValue.equals("SignUp")){
                    Main.signUp();
                } else{
                    System.out.println("Please inseret Right Value");
                }


                bWriter.newLine();
                bWriter.close();
            } catch(IOException e){
                System.out.println(e);
            }
        } else if(userName == null){
            System.out.println("Please insert correct Username.");

        } else{
            System.out.println("Please insert correct Password.");

        }


    }

}
