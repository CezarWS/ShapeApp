package week5StockExchange;

import java.util.*;

public class StockMarket {
    Set<StockUpdate> update = new HashSet<>();

    public StockMarket(Set<StockUpdate> update) {
        this.update = update;
    }

    public void add(StockUpdate stock){
        update.add(stock);

    }
    public Set<StockUpdate> queryUpdates(Date from, Date to,String stockCode){
        Set<StockUpdate> result = new HashSet<>();
        for (StockUpdate su: update) {
           if( su.getCode().equals(stockCode)&& su.getDate().before(to) && su.getDate().after(from)){
               result.add(su);
           }

        }
        return result;

    }

    public double getPriceCode(String code, Date date){
        StockUpdate stock = new StockUpdate();
        long delta = 0;

        for (StockUpdate su :update) {
            if(su.getCode().equals(code)&& su.getDate().before(date)){
               if(date.getTime() - su.getDate().getTime()< delta)
                   stock = su;
                delta = date.getTime() - su.getDate().getTime();
            }
        }return stock.getPrice();
    }


}
