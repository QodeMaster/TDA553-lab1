package JUnitTesting;

import static org.junit.Assert.assertEquals;
import org.junit.Test;


public class VolvoTestJUnit {

  @Test
  public void doesDirectionWork() {
    Volvo240 volvo = new Volvo240();
    volvo.turnLeft();
    assertEquals(3.0, volvo.getDirection(), 0);
  }

  @Test
  public void turnRightAllTheWay() {
    Volvo240 volvo = new Volvo240();
    volvo.turnRight();
    volvo.turnRight();
    volvo.turnRight();
    volvo.turnRight();
    assertEquals(0, volvo.getDirection(), 0);
  }

  @Test
  public void moveUpTwoSteps() {
    Volvo240 volvo = new Volvo240();
    volvo.startEngine();
    volvo.move();
    volvo.move();
    assertEquals(9.8, volvo.getYCord(), 0);
  }

  @Test
  public void testGas() {
    Volvo240 volvo = new Volvo240();
    volvo.gas(10);
    assertEquals(0, volvo.getCurrentSpeed(), 0);
  }
}
