package study.jeanwang2dev;

public class Bookshelf {

    private String manufacturer;
    private String model;
    private Size size;
    private double maxLoad;
    private String color;

    public Bookshelf(String manufacturer, String model, Size size, double maxLoad, String color) {
        this.manufacturer = manufacturer;
        this.model = model;
        this.size = size;
        this.maxLoad = maxLoad;
        this.color = color;
    }
}
