/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ecommerce;


/**
 *
 * @author DELL
 */
public class Product {

    private String productName;
    private String color;
    private String category;
    private int stock;
    private double weight;
    private String description;

    public Product(String productName, String color, String category, int stock, double weight, String description) {
        this.productName = productName;
        this.color = color;
        this.category = category;
        this.stock = stock;
        this.weight = weight;
        this.description = description;
        showInfo();
    }
    
    public boolean stockControl(){
        if(this.stock > 0){
            return true;
        }else  return false;
        
    }
    public void reduceStock(int orderCount){
       this.stock = this.stock - orderCount;
    }

    public String getProductName() {
        return productName;
    }

    public String getColor() {
        return color;
    }

    public String getCategory() {
        return category;
    }

    public int getStock() {
        return stock;
    }

    public double getWeight() {
        return weight;
    }

    public String getDescription() {
        return description;
    }

   

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    
    public void showInfo() {
        System.out.println("Product{" + "Product Name=" + productName + ",\n Color=" 
                + color + ",\n Category=" + category + ",\n Stock=" 
                + stock + ",\n Weight=" + weight + ",\n Description="
                + description + '}'); 
    }
    
    

}
