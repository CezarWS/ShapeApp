package onlineStore;

import onlineStore.customer.Customer;
import onlineStore.product.Product;

import java.util.ArrayList;
import java.util.List;


public class Test {
    public static void main(String args[]){
        List<Product> products = new ArrayList<Product>();
        Product disc1 = new Product(1, "Training", "clothing", 250, "black");
        products.add(disc1);
        Product disc2 = new Product(2, "Shoes", "Treking", 450, "blue");
        products.add(disc2);
        Product disc3 = new Product(3, "T-shirt", "Casual", 60, "white");
        products.add(disc3);
        Address address = new Address("Str", "Romania", 123);
        Customer man = new Customer("Ion","Popescu",123466, address);
        Discount discFix = new FixedDiscount(450);
        Discount discPercentage = new PercentageDiscount(100);
        CartImpl cart = new CartImpl(man);
        cart.addProduct(disc1);
        cart.addProduct(disc2);
        cart.addProduct(disc3);
        cart.addDiscount(discFix);
        cart.addDiscount(discPercentage);
        cart.printInvoice();





    }
}
