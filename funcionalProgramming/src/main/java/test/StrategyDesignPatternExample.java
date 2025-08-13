package test;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class StrategyDesignPatternExample {

    public static void main(String[] args) {

        List<Stock> lista = new ArrayList<>();
        lista.add(new Stock("APPLE", 10, 700));
        lista.add(new Stock("Glo", 14, 130));
        lista.add(new Stock("ZUM", 43, 110));
        lista.add(new Stock("Kai", 67, 150));
        lista.add(new Stock("leis", 45, 170));

        //StockFilters.bySymbol(lista, "ZUM").forEach(System.out :: println);

        System.out.println("--------------------");

        //StockFilters.byPriceAbove(lista, 20).forEach(System.out :: println);
        StockFilters.filter(lista, stock -> stock.getSymbol().equals("ZUM") || stock.getPrice()>30).forEach(System.out :: println);


    }

}

class StockFilters {
    public static List<Stock> bySymbol(List<Stock> list, String symbol){
        List<Stock> filteredData =  new ArrayList<>();
        for(Stock stock: list ){
            if(stock.getSymbol().equals(symbol)) filteredData.add(stock);
        }
        return filteredData;
    }

    public static List<Stock> byPriceAbove(List<Stock> list, double price){
        List<Stock> filteredData = new ArrayList<>();
        for(Stock stock: list){
            if(stock.getPrice() > price) filteredData.add(stock);
        }
        return filteredData;
    }

    public static List<Stock> filter(List<Stock> list, Predicate<Stock> p){

        List<Stock> filteredData = new ArrayList<>();
        for (Stock stock: list) {
            if(p.test(stock)) filteredData.add(stock);
        }
        return filteredData;
    }
}


class Stock {
    private String symbol;
    private double price;
    private double units;

    public Stock(String symbol, double price, double units) {
        this.symbol = symbol;
        this.price = price;
        this.units = units;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getUnits() {
        return units;
    }

    public void setUnits(double units) {
        this.units = units;
    }

    @Override
    public String toString() {
        return "Stock{" +
                "symbol='" + symbol + '\'' +
                ", price=" + price +
                ", units=" + units +
                '}';
    }
}
