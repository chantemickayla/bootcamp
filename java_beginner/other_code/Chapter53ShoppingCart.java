/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter5.pkg3shoppingcart;

/**
 *
 * @author Chante
 */
public class Chapter53ShoppingCart {
    
    public static void main(String[] args) {
        String custName = "Mary Smith";
        String message;
                
        double price = 21.99;
        int quantity = 2;
        double tax = 1.04;
        
        String items[];
        items = new String[4];
        items[0] = "Milkshake";
        items[1] = "Chocolate";
        items[2] = "Sweets";
        items[3] = "Movies";
        
         message = custName + " wants to purchase "+items.length+" items.";
        System.out.println(message);
        
          System.out.println("Items purchased: ");
          
          for (String item : items ){
           System.out.print(item + ", ");
        }
    }
    
}
