import java.awt.*;

public class Car implements Movable { 
    private int nrDoors; // Number of doors on the car
    private double enginePower; // Engine power of the car
    private double currentSpeed; // The current speed of the car
    private Color color; // Color of the car
    private String modelName; // The car model name
    private int direction; // direction of car, 0: up, 1: right, 2: down, 3: left
    private int xCord;
    private int yCord;

    public Car(int nrDoors, double enginePower, double currentSpeed, Color color, String modelName) {
        this.nrDoors      = nrDoors;
        this.enginePower  = enginePower;
        this.currentSpeed = currentSpeed;
        this.color        = color;
        this.modelName    = modelName;
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

    public void setCurrentSpeed(double val) {
        currentSpeed = val;
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
        direction = (direction - 1) % 4;
    }

    public void turnRight() {
        direction = (direction + 1) % 4;
    }
}