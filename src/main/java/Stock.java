public class Stock extends Product{
    String exchange;
    String ticker;

    public Stock(String productId,String exchange, String ticker) {
        this.productId =productId;
        this.exchange = exchange;
        this.ticker = ticker;
        this.getPrice(exchange, ticker);
    }


}
