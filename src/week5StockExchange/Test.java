package week5StockExchange;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

public class Test {

    public static void main(String[] args){
        Set<StockUpdate> update = new HashSet<>();
        Date d = new Date();
        d.setTime(System.currentTimeMillis());
        Date d1 = new Date();
        StockUpdate product1= new StockUpdate("code", 12.0, d);

        StockMarket market = new StockMarket(update);
        market.add(new StockUpdate("code", 23.0, d));

    }
}
//git install local
// >>vcs > checkout from version ctrl > link