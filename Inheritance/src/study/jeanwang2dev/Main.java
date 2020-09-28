package study.jeanwang2dev;

public class Main {

    public static void main(String[] args) {
//        Animal animal = new Animal("Animal", 8, 20, 1, 1);
//
//        Dog dog = new Dog("Yorkie", 8, 20, 2, 2, 2, 20, "long silky");
//        dog.eat();
////        dog.walk();
//        dog.run();

        Outlander outlander = new Outlander(36);
        outlander.steer(45);
        outlander.accelerate(30);
        outlander.accelerate(20);
        outlander.accelerate(-42);
        outlander.stop();

    }
}
