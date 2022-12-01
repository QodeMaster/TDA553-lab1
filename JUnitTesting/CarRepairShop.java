package JUnitTesting;

import java.util.ArrayList;

public class CarRepairShop {
    private final int xCord;
    private final int yCord;
    int count;
    private Car[] arr;

    public CarRepairShop(int xCord, int yCord, int maxCapacity) {
        this.xCord = xCord;
        this.yCord = yCord;
        arr = new Car[maxCapacity];
        count = 0;
    }

    private double getDistance(Car car) {
        return Math.sqrt(Math.pow(car.getXCord() - xCord, 2) + Math.pow(car.getYCord() - yCord, 2));
    }

    public void loadCar(Car car) {
        if(count < arr.length && getDistance(car) < 5) {
            count++;
            for(int i = 0; i < arr.length; i++) {
                if(arr[i] == null) {
                    arr[i] = car;
                    break;
                }
            }
        }
    }

    public void unloadCar(int index) {
        if(0 < count && arr[index] != null) {
            arr[index].setXCord(xCord + 5);
            arr[index].setYCord(yCord + 5);
            arr[index] = null;
            count--;
        }
        
    }

}
