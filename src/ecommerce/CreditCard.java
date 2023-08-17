/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ecommerce;

/**
 *
 * @author DELL
 */
public class CreditCard {

    private String cardNumber;
    private User owner;
    private String securityNumber;
    private String expirationDate;

    public CreditCard(String cardNumber, User owner, String securityNumber, String expirationDate) {
        this.cardNumber = cardNumber;
        this.owner = owner;
        this.securityNumber = securityNumber;
        this.expirationDate = expirationDate;
        showInfo();
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public User getOwner() {
        return owner;
    }

    public String getSecurityNumber() {
        return securityNumber;
    }

    public String getExpirationDate() {
        return expirationDate;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public void setOwner(User owner) {
        this.owner = owner;
    }

    public void setSecurityNumber(String securityNumber) {
        this.securityNumber = securityNumber;
    }

    public void setExpirationDate(String expirationDate) {
        this.expirationDate = expirationDate;
    }

    
    public void showInfo() {
        System.out.println("CreditCard{" + "Card Number=" + cardNumber + ",\n Owner="
                + owner + ",\n Security Number=" + securityNumber
                + ",\n Expiration Date=" + expirationDate + '}');
    }

}
