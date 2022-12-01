package JUnitTesting;

import java.awt.*;

public class Saab95 extends Car {

    private boolean turboOn = false;
    
    public Saab95() {
        super(2, 125, 0, Color.red, "Saab95", 0.01);
        stopEngine();
        turboOn = false;
    }
    
    /*public double speedFactor(){
        double turbo = 1;
        if(turboOn) turbo = 1.3;
        return getEnginePower() * 0.01 * turbo;
    }*/

    private void setTurboOn(){
	    turboOn = true;
        setSpeedFactor(0.01 * 1.3);
    }

    private void setTurboOff(){
	    setSpeedFactor(0.01 * 1.0);
    }
}
