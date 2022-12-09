package JUnitTesting;

import java.awt.*;

public class Truck extends Car {
    private final int dAngle;
    private int angle;

    public Truck(int nrDoors, int enginePower, int currentSpeed, Color color, String name, int dAngle, String adress) {
        super(nrDoors, enginePower, currentSpeed, color, name, 1.0, adress);
        this.angle = 0;
        this.dAngle = dAngle;
    }

    public int getAngle() {
        return angle;
    }

    public int getdAngle() {
        return dAngle;
    }

    public void raise() {
        if(angle < 70 && getCurrentSpeed() == 0) {
            angle += dAngle;
        }
    }

    public void lower() {
        if(0 < angle) {
            angle -= dAngle;
        }
    }

    public void move() {

        switch(dAngle) {
            case 1:
                if(angle == 0) {
                    super.move();
                }
                break;
            case 70:
                if(angle == 70) {
                    super.move();
                }
                break;
            default:
                break;
        }
    }
}
