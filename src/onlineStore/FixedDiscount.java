package onlineStore;

public class FixedDiscount implements Discount {
    private double discount;


    public FixedDiscount(double discount) {

        this.discount = discount;

    }


    @Override
    public double applyDiscount(double price) {
        if (price < discount){
            return 0;
        }

        return price - discount;
    }

    @Override
    public String toString() {
        return "FixedDiscount{" +
                "discount=" + discount +
                '}';
    }
}



