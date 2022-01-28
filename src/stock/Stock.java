package stock;

/**
 * Class that calculate stock prices gain or loss Will have attributes for symbol, name, costBasis,
 * currentPrice
 */
public class Stock {

  private String symbol;
  private String name;
  private double costBasis;
  private double currentPrice;

  /**
   * Constructor of Employee Class that initialize with these params below.
   *
   * @param symbol    the stock symbol
   * @param name      the name of the stock
   * @param costBasis the cost of purchasing the stock
   */
  public Stock(String symbol, String name, double costBasis) {
    this.symbol = symbol;
    this.name = name;
    this.costBasis = costBasis;
  }

  /**
   * Return the stock symbol
   *
   * @return the stock symbol
   */


  public String getSymbol() {
    return symbol;
  }

  /**
   * Return the stock name
   *
   * @return the stock name
   */

  public String getName() {
    return name;
  }

  /**
   * Return the stock cost basis
   *
   * @return the stock cost basis
   */

  public double getCostBasis() {
    return costBasis;
  }

  /**
   * Return the stock current price
   *
   * @return the stock current price
   */

  public double getCurrentPrice() {
    return currentPrice;
  }

  /**
   * Set the stock cost basis
   *
   * @param costBasis the stock cost
   */

  public void setCostBasis(double costBasis) {
    this.costBasis = costBasis;
  }

  /**
   * Set the current stock price
   *
   * @param currentPrice the current stock price
   */
  public void setCurrentPrice(double currentPrice) {
    this.currentPrice = currentPrice;
  }

  /**
   * Calculate and return the fractional change in the stock price
   *
   * @return the change in fractional price of the stock
   */

  public double getChangePercent() {
    return ((this.costBasis - this.currentPrice) / this.costBasis);
  }

  /**
   * Print out a string format of the instance of stock class
   *
   * @return a string with the current price and gains or loss
   */
  public String toString() {
    return String.format(" %s Current Price: $ %.2f\n Gain/Loss: %.2f",
        this.name, this.currentPrice, this.getChangePercent());
  }

}


