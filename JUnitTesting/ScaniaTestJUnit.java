package JUnitTesting;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class ScaniaTestJUnit {
    @Test
    public void isCurrentSpeedZero() {
    Scania c = new Scania();
    assertEquals(0, c.getCurrentSpeed(), 0);
  }

  @Test
    public void canAngleBeLowerThanZero() {
    Scania c = new Scania();
    c.lower();
    assertEquals(0, c.getAngle(), 0);
  }
}
