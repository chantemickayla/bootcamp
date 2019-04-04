package exercise;

public class NewClassForMainMethod {

    public static void main(String[] args) {
        Customer c1 = new Customer();
        Customer c2 = new Customer();

        c1.age = 40;
        c2.name = "Johnny";

        c1.displayCustomer();
        c2.displayCustomer();
    }
}
