package PART1;

import java.util.ArrayList;
import java.util.List;

public class Investor implements IInvestor {
    private String name;
    private List<Stock> stocks = new ArrayList<>();

    public Investor(String name) {
        this.name = name;
        System.out.println("Investor " + name + " created");
    }
    public void update(Stock stock) {
        System.out.println(name + " update for " + stock.getSymbol() + ": $" + stock.getPrice());
    }
    public void investInStock(Stock stock) {
        stocks.add(stock);
        stock.attach(this);
        System.out.println(name + " invested in " + stock.getSymbol());
    }
    public void divestFromStock(Stock stock) {
        stocks.remove(stock);
        stock.detach(this);
        System.out.println(name + " divested from " + stock.getSymbol());
    }

    @Override
    public String toString() {
        return name;
    }
}
