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
public class Order {

    private User user;
    private Product product;
    private ArrayList<CreditCard> cards;

    public Order(User user, Product product) {
        this.user = user;
        this.product = product;
        this.cards = user.getMyCards();
        
    }

    public void orderProduct(int orderCount) {
        if (this.product.stockControl()) {
            this.product.reduceStock(orderCount);
            showInfo();

        } else {
            System.out.println("Product is not in the stock");
        }

    }

    public User getUser() {
        return user;
    }

    public Product getProduct() {
        return product;
    }

    public ArrayList<CreditCard> getCards() {
        return cards;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    
    public void showInfo() {
         System.out.println("Order{" + "User=" + user.getUsername() + ", Product=" + product.getProductName() + '}');
    }
    

}
