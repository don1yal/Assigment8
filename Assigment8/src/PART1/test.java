package PART1;

public class test {
    public static void main(String[] args) {
        Stock appleStock = new Stock("APPLE", 150.0F);
        Stock googleStock = new Stock("GOOGLE", 2500.0F);


        Investor investor1 = new Investor("Daniyal");
        Investor investor2 = new Investor("Olzhas");

        investor1.investInStock(appleStock);
        investor2.investInStock(appleStock);
        investor2.investInStock(googleStock);

        appleStock.updatePrice(155.0F);
        googleStock.updatePrice(2600.0F);

        investor2.divestFromStock(googleStock);
    }
}
