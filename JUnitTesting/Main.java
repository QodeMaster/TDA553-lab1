package JUnitTesting;

import java.awt.*;
import java.util.ArrayList;

public class Main {
    
    public static void main(String[] args) {
        CarController cc = new CarController();


        cc.cars.add(new Volvo240());
        cc.cars.add(new Saab95());
        cc.cars.get(1).setYCord(100);
        cc.cars.add(new Scania());
        cc.cars.get(2).setYCord(200);

        // Start a new view and send a reference of self
        cc.frame = new CarView("CarSim 1.0", cc);

        // Start the timer
        cc.timer.start();
    }
}