
package JUnitTesting;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class CarTransTestJUnit {
  @Test
  public void testLoad() {
      CarTrans t = new CarTrans();
      Saab95 saab = new Saab95();
      t.loadCar(saab);
      assertEquals(saab, t.getArr().get(0));
  }

  @Test
  public void canAngleBeLowerThanZero() {
    CarTrans t = new CarTrans();
    t.lower();
    assertEquals(0, t.getAngle(), 0);
  }
}