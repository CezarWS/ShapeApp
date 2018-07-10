package onlineStore;

public class PercentageDiscount implements Discount {
    private  double percentage;

    public PercentageDiscount(double percentage){
        this.percentage = percentage;
    }


    @Override
    public double applyDiscount(double price) {


        if (percentage > 100)
            return 0;

        double discount = (price * percentage)/100;
        return price - discount;
    }

    @Override
    public String toString() {
        return "PercentageDiscount{" +
                "percentage=" + percentage +
                '}';
    }
}
