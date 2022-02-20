package it.unitn.disi.callaioli.stefano.beans;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Scanner;
import javax.servlet.ServletContext;

/**
 *
 * @author StefanoCallaioli
 */

public class UserDB implements Serializable{
    private HashMap<String,UserBean> users = new HashMap<>();

    public UserDB() {
    }

    //Popula la HashMap users con utenti ottenuti dal file passato usanto il loro username come key
    public UserDB(ServletContext context, String path) throws FileNotFoundException {

        File file = new File(context.getRealPath(path));
        Scanner sc = new Scanner(file);
        
        String username, password, address, cardNumber;
        while (sc.hasNextLine()){
            username=sc.nextLine();
            sc.nextLine();
            password=sc.nextLine();
            sc.nextLine();
            address=sc.nextLine();
            sc.nextLine();
            cardNumber=sc.nextLine();
            sc.nextLine();
            users.put(username, new UserBean(username,password,address,cardNumber));
        }
        
    }

    public HashMap<String, UserBean> getUsers() {
        return users;
    }

    public void setUsers(HashMap<String, UserBean> users) {
        this.users = users;
    }

}
