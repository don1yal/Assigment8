package PART1;

import java.util.ArrayList;
import java.util.List;

public class Stock {
    private String symbol;
    private float price;
    private List<IInvestor> investors = new ArrayList<>();

    public Stock(String symbol, float price) {
        this.symbol = symbol;
        this.price = price;
    }
    public void attach(IInvestor investor) {
        investors.add(investor);
        System.out.println("Investor " + investor + " attached to " + symbol);
    }
    public void detach(IInvestor investor) {
        investors.remove(investor);
        System.out.println("Investor " + investor + " detached from " + symbol);
    }
    public void notifyInvestors() {
        for (IInvestor investor: investors) {
            investor.update(this);
        }
        System.out.println("Notified all investors of the update for " + symbol);
    }
    public void updatePrice(float price) {
        if (this.price != price) {
            this.price = price;
            notifyInvestors();
            System.out.println("Price updated for " + symbol + ": $" + price);
        }
    }
    public float getPrice() {
        return price;
    }
    public String getSymbol() {
        return symbol;
    }
}
