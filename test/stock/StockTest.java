package stock;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

/**
 * A JUnit test class for the Stock class.
 */
public class StockTest {

  private Stock tesla;
  private Stock micro;

  /**
   * Setup with a new stock instance initialization.
   */
  @Before
  public void setUp() {
    tesla = new Stock("TSLA", "Tesla", 900.0);
    tesla.setCurrentPrice(1000.0);
    micro = new Stock("MSFT", "Microsoft", 6234.56343);
    micro.setCurrentPrice(2344.234);

  }

  /**
   * Test getSymbol.
   */
  @Test
  public void testGetSymbol() {
    String expected = "TSLA";
    assertEquals(expected, tesla.getSymbol());

    String expected2 = "MSFT";
    assertEquals(expected2, micro.getSymbol());
  }

  /**
   * Test getName.
   */
  @Test
  public void testGetName() {
    String expected = "Tesla";
    assertEquals(expected, tesla.getName());

    String expected2 = "Microsoft";
    assertEquals(expected2, micro.getName());
  }

  /**
   * Test getCostBasis.
   */
  @Test
  public void testGetCostBasis() {
    double expected = 900.0;
    assertEquals(expected, tesla.getCostBasis(), 0.001);

    double expected2 = 6234.56343;
    assertEquals(expected2, micro.getCostBasis(), 0.001);
  }

  /**
   * Test getCurrentPrice.
   */
  @Test
  public void testGetCurrentPrice() {
    double expected = 1000.0;
    assertEquals(expected, tesla.getCurrentPrice(), 0.001);

    double expected2 = 2344.234;
    assertEquals(expected2, micro.getCurrentPrice(), 0.001);
  }

  /**
   * Test setCostBasis.
   */
  @Test
  public void testSetCostBasis() {
    tesla.setCostBasis(500.0);
    double expected = 500.0;
    assertEquals(expected, tesla.getCostBasis(), 0.001);

    micro.setCostBasis(3495.23);
    double expected2 = 3495.23;
    assertEquals(expected2, micro.getCostBasis(), 0.001);
  }

  /**
   * Test setCurrentPrice.
   */

  @Test
  public void testSetCurrentPrice() {
    tesla.setCurrentPrice(500.0);
    double expected = 500;
    assertEquals(expected, tesla.getCurrentPrice(), 0.001);

    micro.setCurrentPrice(3450.67);
    double expected2 = 3450.67;
    assertEquals(expected2, micro.getCurrentPrice(), 0.001);
  }

  /**
   * Test getChangePercent.
   */
  @Test
  public void testGetChangePercent() {
    double expected = 0.111;
    assertEquals(expected, tesla.getChangePercent(), 0.001);

    double expected2 =-0.624;
    assertEquals(expected2, micro.getChangePercent(), 0.001);
  }

  /**
   * Test toString.
   */
  @Test
  public void testToString() {
    String expected = " Tesla Current Price: $ 1000.00\n Gain/Loss: 11.10%";
    assertEquals(expected, tesla.toString());

    String expected2 = " Microsoft Current Price: $ 2344.23\n Gain/Loss: -62.40%";
    assertEquals(expected2, micro.toString());
  }
}