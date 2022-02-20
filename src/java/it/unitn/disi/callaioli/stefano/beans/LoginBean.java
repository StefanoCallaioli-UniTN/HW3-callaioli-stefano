package it.unitn.disi.callaioli.stefano.beans;

import java.io.IOException;
import java.io.Serializable;
import javax.servlet.ServletContext;

/**
 *
 * @author StefanoCallaioli
 */

public class LoginBean implements Serializable {
    private String username;
    private String password;

    public LoginBean() {
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    //Autorizza l'accesso se Username e Password sono presenti nel "Database" (Coppia di valori nella HashMap userDB)
    public boolean auth(ServletContext context) throws IOException{
        UserDB userDB = (UserDB)context.getAttribute("userDB");
        UserBean user=userDB.getUsers().get(this.username);
        if(user != null){
            if(user.getPassword().equals(this.password)){
                return true;
            }
        }
        return false;
    }
    

}
