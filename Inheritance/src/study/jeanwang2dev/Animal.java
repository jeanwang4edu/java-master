package study.jeanwang2dev;

public class Animal {

    private String name;
    private int size;
    private int weight;
    private int body;
    private int brain;

    public Animal(String name, int size, int weight, int body, int brain) {
        this.name = name;
        this.size = size;
        this.weight = weight;
        this.body = body;
        this.brain = brain;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getBody() {
        return body;
    }

    public void setBody(int body) {
        this.body = body;
    }

    public int getBrain() {
        return brain;
    }

    public void setBrain(int brain) {
        this.brain = brain;
    }

    public void eat(){
        System.out.println("Animal.eat() got called");
    }

    public void move(int speed ){
        System.out.printf("Animal is moving at speed %d %n", speed);
    }



}
