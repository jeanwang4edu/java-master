package study.jeanwang2dev;

public abstract class Bird extends Animal {

    public Bird(String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.println(getName() + " is pecking");
    }

    @Override
    public void breathe() {
        System.out.println("breathe in and breathe out, repeat");
    }

    public abstract void fly();
}
