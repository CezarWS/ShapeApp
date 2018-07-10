package onlineStore;

import onlineStore.product.Product;


public interface ShopCart {

    void addProduct(Product p);
    void removeProduct(Product p);
    double computeTotalPrice();

//    void getTotalPrice();
    void printInvoice() ;

}
