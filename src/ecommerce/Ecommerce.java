/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ecommerce;

/**
 *
 * @author DELL
 */
public class Ecommerce {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        User u = new User("peace", "mehmet", "alpergun", "01.01.1995",
        "1234", "mehmet@ogr.cbu.edu.tr", "izmir/alsancak", "folkart/izmir");
        System.out.println("");

        Product p = new Product("Iphone 14 plus", "Black",
            "Phone", 50, 0.2, "iphone 14 plus, 6.7 inch");
        System.out.println("");
        
        CreditCard c = new CreditCard("123654789", u, "123", "5/23");
        System.out.println("");

        u.order(p, 1);
        System.out.println("");

        u.addfavourite(p);
        System.out.println("");

        u.orderFromFav(0, 1);
        System.out.println("");

        u.removeFromFav(0);
        

      

    }

}
