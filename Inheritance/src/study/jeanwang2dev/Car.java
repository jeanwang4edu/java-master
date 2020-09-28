package study.jeanwang2dev;

public class Car extends Vehicle {

    private int doors;
    private int wheels;
    private boolean isManual;
    private int gears;
    private int currentGear;

    public Car(String name, int wheels, int doors, boolean isManual, int gears) {
        super(name, wheels);
        this.doors = doors;
        this.wheels = wheels;
        this.isManual = isManual;
        this.gears = gears;
        this.currentGear = 1;
    }

    public void changeGear(int currentGear) {
        this.currentGear = currentGear;
        System.out.printf("Car changed gear to %d%n", this.currentGear);
    }

    public void changeVelocity(int speed, int direction){
        System.out.printf("Car Velocity %d direction at %d%n", speed, direction );
        move(speed, direction);
    }

//    @Override
//    public void stop() {
//        super.stop();
//        this.currentGear = 1;
//    }
}
