package study.jeanwang2dev;

public class Main {

    public static void main(String[] args) {
//        Animal animal = new Animal("Animal", 8, 20, 1, 1);
//
//        Dog dog = new Dog("Yorkie", 8, 20, 2, 2, 2, 20, "long silky");
//        dog.eat();
////        dog.walk();
//        dog.run();

//        Outlander outlander = new Outlander(36);
//        outlander.steer(45);
//        outlander.accelerate(30);
//        outlander.accelerate(20);
//        outlander.accelerate(-42);
//        outlander.stop();

        Circle circle = new Circle(3.75);
        System.out.println("circle.radius= " + circle.getRadius());
        System.out.println("circle.area= " + circle.getArea());
        Cylinder cylinder = new Cylinder(5.55, 7.25);
        System.out.println("cylinder.radius= " + cylinder.getRadius());
        System.out.println("cylinder.height= " + cylinder.getHeight());
        System.out.println("cylinder.area= " + cylinder.getArea());
        System.out.println("cylinder.volume= " + cylinder.getVolume());




    }
}
