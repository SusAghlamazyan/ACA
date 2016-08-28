/**
 * Created by Susanna.Aghlamazyan on 8/26/2016.
 */
import java.util.Scanner;


public class Main {
    static final String FILE_DIR = System.getProperty("user.dir");

    public static void main(String[] args){
        //String insertedFilePath = FILE_DIR + "\\Homework9";

        Scanner sc = new Scanner(System.in);
        System.out.print("SignUp or SignIn:?");
        String insertedValue  = sc.nextLine();

        if (insertedValue.equals("SignUp")){

            Main.signUp();

        }else if(insertedValue.equals("SignIn")){
            Main.signIn();// Code

        } else {
           System.out.println("Insert right value.");

        }

    }

    public  static void signUp(){
        String insertedFilePath = FILE_DIR + "\\Homework9";

        Scanner sc = new Scanner(System.in);

        System.out.print("Please provide your username:");
        String insertedUserName = sc.nextLine();

        System.out.print("Please provide your password:");
        String insertedPassword = sc.nextLine();
        User user = new User();

        user.addUser(insertedUserName, insertedPassword, insertedFilePath);

    }

    public static void signIn(){


    }
}
