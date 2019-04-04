package exercise;

public class ShoppingCart {

    public static void main(String[] args) {
        Item item1, item2;
        item1 = new Item();
        item2 = new Item();

        item1.desc = "Shirt";
        item2.desc = "Pants";
                
        item1 = item2;
        System.out.println("Item1: " + item1.desc);
        System.out.println("Item 2: " + item2.desc);
    }
}
