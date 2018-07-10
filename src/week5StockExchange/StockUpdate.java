package week5StockExchange;

import java.util.Date;
import java.util.Objects;

public class StockUpdate {
    private String code;
    private double price;
    private Date date;

    public StockUpdate(String code, double price, Date date) {
        this.code = code;
        this.price = price;
        this.date = date;
    }

    public StockUpdate() {

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        StockUpdate that = (StockUpdate) o;
        return Double.compare(that.price, price) == 0 &&
                Objects.equals(code, that.code) &&
                Objects.equals(date, that.date);
    }
//    //Compara data unui produs
//        @Override
//        public int compareTo(Object o){
//        if(this.date.compareTo(StockUpdate))
//        }

    @Override
    public int hashCode() {
        return Objects.hash(code,price,date);
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "StockUpdate{" +
                "code='" + code + '\'' +
                ", price=" + price +
                ", date=" + date +
                '}';
    }
}
