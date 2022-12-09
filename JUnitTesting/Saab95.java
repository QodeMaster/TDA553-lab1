package JUnitTesting;

import java.awt.*;

public class Saab95 extends Car {

    private boolean turboOn = false;
    
    public Saab95() {
        super(2, 125, 0, Color.red, "Saab95", 1.0, "Saab95.jpg");
        stopEngine();
        turboOn = false;
    }
    
    /*public double speedFactor(){
        double turbo = 1;
        if(turboOn) turbo = 1.3;
        return getEnginePower() * 0.01 * turbo;
    }*/

    public void setTurboOn(){
	    turboOn = true;
        setSpeedFactor(0.01 * 1.3);
    }

    public void setTurboOff(){
	    setSpeedFactor(0.01 * 1.0);
    }
}
