import java.util.ArrayList;
import java.util.List;

/**
 * Created by Susanna.Aghlamazyan on 8/28/2016.
 */
public class User {
    private String userName;
    private String password;
    public static int userId;
    List<Number> phoneNumber = new ArrayList<>();

    static{
        userId = 0;
    }

    public void setUserName(String userName){
        if(userName != null){
            this.userName = userName;
        } else {
            throw new NullPointerException();
        }

    }
    public String getUserName(){
        return this.userName;
    }

    public void setPassword(String password){
        if(password != null){
            this.password = password;
        } else {
            throw new NullPointerException();
        }
    }

    public String getPassword() {
        return this.password;
    }

    public User(String userName, String password){
        this.setUserName(userName);
        this.setPassword(password);
    }

    public boolean equals(User u) {
        boolean result = false;
        if (u != null && u instanceof User
                && getUserName() != null && u.getUserName() != null
                && getPassword() != null && u.getPassword() != null) {
            if (getUserName().equals(u.getUserName()) && getPassword().equals(u.getPassword())) {
                result = true;
            } else {
                result = false;
            }
        } else{
            result = false;
        }
        return result;
    }

    public int hashCode(){
        int hashCode = 3;
        hashCode = hashCode*this.getPassword().hashCode()+this.getUserName().hashCode();
        return hashCode;
    }

    public String toString(){
        return userId + " " + this.getUserName() + " " + this.getPassword();// To add Phone
    }


}
