package JUnitTesting;

import java.awt.*;

public class Car implements Movable { 
    private int nrDoors; // Number of doors on the car
    private double enginePower; // Engine power of the car
    private double currentSpeed; // The current speed of the car
    private Color color; // Color of the car
    private String modelName; // The car model name
    private double speedFactor;
    private int direction; // direction of car, 0: up, 1: right, 2: down, 3: left
    private double xCord;
    private double yCord;

    public Car(int nrDoors, double enginePower, double currentSpeed, Color color, String modelName, double speedFactor) {
        this.nrDoors      = nrDoors;
        this.enginePower  = enginePower;
        this.currentSpeed = currentSpeed;
        this.color        = color;
        this.modelName    = modelName;
        this.speedFactor = speedFactor;
        this.direction = 0;
        this.xCord = 10.0;
        this.yCord = 10.0;
    }

    public int getNrDoors(){
        return nrDoors;
    }
    public double getEnginePower(){
        return enginePower;
    }

    public double getCurrentSpeed(){
        return currentSpeed;
    }

    public void setSpeedFactor(double speedF) {
        this.speedFactor = getEnginePower() * speedF;
    }

    public void setCurrentSpeed(double val) {
        if(0 <= val && val <= enginePower) {
            currentSpeed = val;
        }
    }

    public Color getColor(){
        return color;
    }

    public void setColor(Color clr){
	    color = clr;
    }

    public void startEngine(){
	    currentSpeed = 0.1;
    }

    public void stopEngine(){
	    currentSpeed = 0;
    }

    public void incrementSpeed(double amount){
        setCurrentSpeed(Math.min(getCurrentSpeed() + speedFactor * amount, getEnginePower()));
	    //currentSpeed = Math.min(getCurrentSpeed() + speedFactor() * amount,enginePower);
    }

    public void decrementSpeed(double amount){
        setCurrentSpeed(Math.max(getCurrentSpeed() - speedFactor * amount,0));
        // currentSpeed = Math.max(getCurrentSpeed() - speedFactor() * amount,0);
    }

    // TODO fix this method according to lab pm
    public void gas(double amount){
        if(0 <= amount && amount <= 1) {
            incrementSpeed(amount);
        }
    }

    // TODO fix this method according to lab pm
    public void brake(double amount){
        if(0 <= amount && amount <= 1) {
            decrementSpeed(amount);
        }
    }

    @Override
    public void move() {
        switch(direction) {
            case 0:
                yCord -= currentSpeed;
                break;
            case 1:
                xCord += currentSpeed;
            break;
            case 2:
                yCord += currentSpeed;
            break;
            case 3:
                xCord -= currentSpeed;
            break;
            default:
            break;
        }
    }

    public void turnLeft() {
        direction = (direction == 0 ? 3 : direction - 1);
    }

    public void turnRight() {
        direction = (direction + 1) % 4;
    }

    public int getDirection() {
        return direction;
    }

    public double getXCord() {
        return xCord;
    }

    public double getYCord() {
        return yCord;
    }
    public void setXCord(double newXCord) {
        xCord = newXCord;
    }
    public void setYCord(double newYCord) {
        yCord = newYCord;
    }
}