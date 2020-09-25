package study.jeanwang2dev;

public class Main {

    public static void main(String[] args) {
        Animal animal = new Animal("Animal", 8, 20, 1, 1);

        Dog dog = new Dog("Yorkie", 8, 20, 2, 2, 2, 20, "long silky");
        dog.eat();
//        dog.walk();
        dog.run();
    }
}
