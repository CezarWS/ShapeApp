package onlineStore.store;

import onlineStore.Discount;
import onlineStore.product.Product;

import java.util.List;
//se trimit in discount si acolo se calculeaza

public class Store  {
    private List<Product> catalog;
    private List<Discount> discounts;


    public List<Discount> getDiscounts() {
        return discounts;
    }

    public void setDiscounts(List<Discount> discounts) {
        this.discounts = discounts;
    }

    public Store(List<Product> catalog){

        this.catalog = catalog;

    }

    public List<Product> getCatalog() {
        return catalog;
    }

    public List<Product> setCatalog(List<Product> catalog) {
        this.catalog = catalog;
        return catalog;
    }

}
