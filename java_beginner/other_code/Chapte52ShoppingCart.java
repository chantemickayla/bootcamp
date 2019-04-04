/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapte5.pkg2shoppingcart;

/**
 *
 * @author Chante
 */
public class Chapte52ShoppingCart {

    public static void main(String[] args) {
        
        String[] items = {"Milkshake","Chocolate","Sweets","Movies"};
        String custName = "Mary Smith";
        String message = custName + " wants to purchase a several items.";
        
        message = custName + " wants to purchase "+items.length+" items.";
        System.out.println(message);
        
         System.out.println(items[0]);
    }
    
}
