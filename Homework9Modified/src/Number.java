/**
 * Created by Susanna.Aghlamazyan on 8/29/2016.
 */
public class Number {
    private String phoneNumber;
    private PhoneType num;

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    Number(String number){
        this.phoneNumber=number;
    }

}
