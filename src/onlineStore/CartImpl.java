package onlineStore;

import onlineStore.customer.Customer;
import onlineStore.product.Product;

import java.util.ArrayList;
import java.util.List;
//all the focus here

public class CartImpl implements ShopCart{
    private Customer customer;
    private List<Product> items = new ArrayList<Product>();
    private List<Discount> discounts = new ArrayList<Discount>();

    public CartImpl(Customer customer) {
        this.customer = customer;
    }

    @Override
    public void addProduct(Product p) {
        items.add(p);
        }

        public void addDiscount(Discount discount){
            discounts.add(discount);
        }


    @Override
    public void removeProduct(Product p) {
        items.remove(p);
        }

    @Override
    public double computeTotalPrice() {
        double total = 0;

        for (Product prod: items) {
            total += prod.getPrice();

        }
        return total;
    }
    public double computeTotalAfterDiscount(double value){
        for (Discount discount: discounts) {
            value -= discount.applyDiscount(value);

        }
        return  value;
    }

    @Override
    public String toString() {
        return "CartImpl{" +
                "customer=" + customer +
                ", items=" + items +
                ", discounts=" + discounts +
                "grandTotal= " + computeTotalAfterDiscount(computeTotalPrice()) +
                '}';
    }

    @Override
    public void printInvoice() {
        System.out.println(this);



    }


}
