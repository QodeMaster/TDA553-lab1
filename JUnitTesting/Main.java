package JUnitTesting;

import java.awt.*;

public class Main {
    public static void main(String[] args) {
        Volvo240 v = new Volvo240();
        Saab95   s = new Saab95();
        Scania   c = new Scania();
        CarTrans t = new CarTrans();

        System.out.println(t.getAngle());
        t.raise();
        System.out.println(t.getAngle());
        t.raise();
        System.out.println(t.getAngle());
        //System.out.println(c.getXCord() + ", " + c.getYCord());
        //System.out.println(v.getNrDoors());
        //System.out.println(s.getNrDoors());
    }
}