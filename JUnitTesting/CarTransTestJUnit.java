package JUnitTesting;
import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class CarTransTestJUnit {
    

    public class ScaniaTestJUnit {
  /*      @Test
        public void testLoad() {
            CarTrans t = new CarTrans();
            Saab95 saab = new Saab95();
            t.loadCar(saab);
            assertEquals(saab, t.getArr().get(0));
        }*/
    
      @Test
        public void canAngleBeLowerThanZero() {
        Scania c = new Scania();
        c.lower();
        assertEquals(0, c.getAngle(), 0);
      }
    }
}
