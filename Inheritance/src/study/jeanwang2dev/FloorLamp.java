package study.jeanwang2dev;

import javax.swing.text.Style;

public class FloorLamp {

    private int wattage;
    private String typeOfBulb;
    private Size size;
    private String style;
    private String manufacturer;
    private boolean isOn;

    public FloorLamp(int wattage, String typeOfBulb, Size size, String style, String manufacturer) {
        this.wattage = wattage;
        this.typeOfBulb = typeOfBulb;
        this.size = size;
        this.style = style;
        this.manufacturer = manufacturer;
        this.isOn = false;
    }

    public int getWattage() {
        return wattage;
    }

    public String getTypeOfBulb() {
        return typeOfBulb;
    }

    public Size getSize() {
        return size;
    }

    public String getStyle() {
        return style;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void turnOn(){
        if( isOn ){
            System.out.println("Floor Lamp is already on");
        } else {
            isOn = true;
            System.out.println("Floor Lamp is on");
        }
    }
}
