/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ecommerce;

import java.util.ArrayList;

/**
 *
 * @author DELL
 */
public class User {

    private String username;
    private String name;
    private String surname;
    private String birthday;
    private String password;
    private String email;
    private String homeAddress;
    private String officeAddress;
    private ArrayList<CreditCard> myCards;
    private ArrayList<Product> orderedProducts;
    private ArrayList<Product> favouriteProducts;

    public User(String username, String name, String surname, String birthday, String password, String email, String homeAddress, String officeAddress) {
        this.username = username;
        this.name = name;
        this.surname = surname;
        this.birthday = birthday;
        this.password = password;
        this.email = email;
        this.homeAddress = homeAddress;
        this.officeAddress = officeAddress;
        this.myCards = new ArrayList<CreditCard>();
        this.orderedProducts = new ArrayList<Product>();
        this.favouriteProducts = new ArrayList<Product>();
        showInfo();
    }

    public void order(Product p,int orderCount) {
        Order order = new Order(this, p);
        order.orderProduct(orderCount);
        this.getOrderedProducts().add(p);
        showInfo();
        
    }

    public void addfavourite(Product p) {
        this.getFavouriteProducts().add(p);
        showInfo();

    }
    public void removeFromFav(int i){
        getFavouriteProducts().remove(i);
        showInfo();
    }
    public void orderFromFav(int i, int orderCount){
        Product p = getFavouriteProducts().get(i);
        order(p,orderCount);
        
    }

    public String getUsername() {
        return username;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getBirthday() {
        return birthday;
    }

    public String getPassword() {
        return password;
    }

    public String getEmail() {
        return email;
    }

    public String getHomeAddress() {
        return homeAddress;
    }

    public String getOfficeAddress() {
        return officeAddress;
    }

    public ArrayList<CreditCard> getMyCards() {
        return myCards;
    }

    public ArrayList<Product> getOrderedProducts() {
        return orderedProducts;
    }

    public ArrayList<Product> getFavouriteProducts() {
        return favouriteProducts;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setHomeAddress(String homeAddress) {
        this.homeAddress = homeAddress;
    }

    public void setOfficeAddress(String officeAddress) {
        this.officeAddress = officeAddress;
    }

    
    public void showInfo() {
        System.out.println( "User{" + "Username=" + username + ",\n Name=" + name
                + ",\n Surname=" + surname + ",\n birthday=" + birthday 
                + ",\n Email=" + email + ",\n Home Address=" + homeAddress
                + ",\n Office Address=" + officeAddress + ",\n My Cards Count=" + myCards.size()
                + ",\n Ordered Products Count=" + orderedProducts.size() + ",\n Favourite Products="
                + favouriteProducts.size() + '}');
    }
    

}
