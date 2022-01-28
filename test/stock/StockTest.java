package stock;

import static org.junit.Assert.assertEquals;


import org.junit.Before;
import org.junit.Test;

/**
 * A JUnit test class for the Stock class
 */

public class StockTest {

  private Stock tesla;

  /**
   * Setup with a new stock instance initialization.
   */
  @Before
  public void setUp() {
    tesla = new Stock("TSLA", "Tesla", 900.0);
    tesla.setCurrentPrice(1000.0);
  }

  /**
   * Test getSymbol.
   */
  @Test
  public void testGetSymbol() {
    String expected = "TSLA";
    assertEquals(expected, tesla.getSymbol());
  }

  /**
   * Test getName.
   */
  @Test
  public void testGetName() {
    String expected = "Tesla";
    assertEquals(expected, tesla.getName());
  }

  /**
   * Test getCostBasis.
   */
  @Test
  public void testGetCostBasis() {
    double expected = 900.0;
    assertEquals(expected, tesla.getCostBasis(), 0.001);
  }

  /**
   * Test getCurrentPrice.
   */
  @Test
  public void testGetCurrentPrice() {
    double expected = 1000.0;
    assertEquals(expected, tesla.getCurrentPrice(), 0.001);
  }

  /**
   * Test setCostBasis.
   */
  @Test
  public void testSetCostBasis() {
    double expected = 900.0;
    assertEquals(expected, tesla.getCostBasis(), 0.001);
  }

  /**
   * Test setCurrentPrice.
   */

  @Test
  public void testSetCurrentPrice() {
    tesla.setCurrentPrice(500.0);
    double expected = 500;
    assertEquals(expected, tesla.getCurrentPrice(), 0.001);
  }

  /**
   * Test getChangePercent.
   */
  @Test
  public void testGetChangePercent() {
    tesla.setCurrentPrice(1000.0);
//      double cost_base = 900.0;
    double expected = -0.111;
    assertEquals(expected, tesla.getChangePercent(), 0.001);
  }

  /**
   * Test toString()
   */
  @Test
  public void testToString() {
    String expected = " Tesla Current Price: $ 1000.00\n Gain/Loss: -0.11";
    assertEquals(expected, tesla.toString());
  }
}