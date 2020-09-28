package study.jeanwang2dev;

public class Vehicle {

    private String name;
    private int currentVelocity;
    private int currentDirection;

    public Vehicle(String name, int wheels) {
        this.name = name;
        this.currentVelocity = 0;
        this.currentDirection = 0;
    }

    public void move(int velocity, int direction){
        this.currentVelocity = velocity;
        this.currentDirection = direction;
        System.out.printf("Vehicle is moving at %d in direction %d%n", currentVelocity, currentDirection );
    }

    public void steer(int direction){
        this.currentDirection += direction;
        System.out.printf("Vehicle steering at %d degrees%n", currentDirection);
    }

    public String getName() {
        return name;
    }

    public int getCurrentVelocity() {
        return currentVelocity;
    }

    public int getCurrentDirection() {
        return currentDirection;
    }

    public void stop(){
        this.currentVelocity = 0;
        System.out.println("Vehicle stop.");
    }
}
