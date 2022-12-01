package JUnitTesting;

import java.awt.*;
import java.util.ArrayList;

public class CarTrans extends Truck {
    private ArrayList<Car> arr;

    public CarTrans(){
        super(2, 180, 0, Color.blue, "CarTrans", 70);
        arr = new ArrayList<>();
    }

    public ArrayList<Car> getArr(){
        return arr;

    }

    private double getDistance(Car car) {
        return Math.sqrt(Math.pow(car.getXCord() - this.getXCord(), 2) + Math.pow(car.getYCord() - this.getYCord(), 2));
    }

    public void loadCar(Car car) {
        if(getAngle() == 0 && (getDistance(car) < 5)) {
            arr.add(car);
        }
    }
    public void unloadCar(Car car) {
        if(getAngle() == 0) {
            arr.remove(car);
            car.setXCord(this.getXCord()+5);
            car.setYCord(this.getYCord()+5);
        }
    }

}
