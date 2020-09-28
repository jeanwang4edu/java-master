package study.jeanwang2dev;

public class Bed {

    private double width;
    private double length;
    private double height;
    private String color;
    private boolean isDrawerOpen;

    public Bed(double width, double length, double height, String color) {
        this.width = width;
        this.length = length;
        this.height = height;
        this.color = color;
        this.isDrawerOpen = false;
    }

    public double getWidth() {
        return width;
    }

    public double getLength() {
        return length;
    }

    public double getHeight() {
        return height;
    }

    public String getColor(){
        return color;
    }

    public boolean isDrawerOpen() {
        return isDrawerOpen;
    }

    public void openDrawer(){
        if( isDrawerOpen ) {
            System.out.println("Drawer under the bed is already open!");
        } else {
            isDrawerOpen = true;
            System.out.println("Open drawer under the bed");
        }

    }

    public void make(){
        System.out.println("Making the bed. ");
    }

}
