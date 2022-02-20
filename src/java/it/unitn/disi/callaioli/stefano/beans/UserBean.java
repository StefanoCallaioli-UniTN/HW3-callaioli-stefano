package it.unitn.disi.callaioli.stefano.beans;

import java.io.Serializable;

/**
 *
 * @author StefanoCallaioli
 */

public class UserBean implements Serializable{
    private String username;
    private String password;
    private String address;
    private String cardNumber;

    public UserBean() {
    }

    public UserBean(String username, String password, String address, String cardNumber) {
        this.username = username;
        this.password = password;
        this.address = address;
        this.cardNumber = cardNumber;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getAddress() {
        return address;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }
}
