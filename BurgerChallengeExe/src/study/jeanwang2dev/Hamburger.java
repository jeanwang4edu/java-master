package study.jeanwang2dev;

public class Hamburger {

    private String name;
    private String rolltype;
    private String meat;
    protected double price;

    protected double totalPrice;
    protected int numOfAdditionalItem = 0;
    protected AdditionalItem itemOne;
    protected AdditionalItem itemTwo;
    protected AdditionalItem itemThree;
    protected AdditionalItem itemFour;
    protected String detail = "";


    public Hamburger(String name, String rolltype, String meat, double price) {
        this.name = name;
        this.rolltype = rolltype;
        this.meat = meat;
        this.price = price;
        this.totalPrice = price;
        System.out.printf("Hamburger: %s on breadroll %s got %s has base price of %3.2f%n", this.name, this.rolltype, this.meat, this.price);
    }

    public double getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

    public void addItem(AdditionalItem item){
        if(numOfAdditionalItem < 4) {
            numOfAdditionalItem++;
            switch (numOfAdditionalItem) {
                case 1:
                    itemOne = item;
                    totalPrice += itemOne.getPrice();
                    System.out.printf("Add %s for an extra %3.2f%n", itemOne.getName(), itemOne.getPrice());
                    break;
                case 2:
                    itemTwo = item;
                    totalPrice += itemTwo.getPrice();
                    System.out.printf("Add %s for an extra %3.2f%n", itemTwo.getName(), itemTwo.getPrice());
                    break;
                case 3:
                    itemThree = item;
                    totalPrice += itemThree.getPrice();
                    System.out.printf("Add %s for an extra %3.2f%n", itemThree.getName(), itemThree.getPrice());
                    break;
                case 4:
                    itemFour = item;
                    totalPrice += itemFour.getPrice();
                    System.out.printf("Add %s for an extra %3.2f%n", itemFour.getName(), itemFour.getPrice());
                    break;
            } // end switch
        } else {
            System.out.println("You've already have 4 additional items on your burger, item not added.");
        }
    }

    public String showDetail(){
        detail += String.format("hamburger %s has base price of %5.2f and total price with additional items is %5.2f%n", getName(), getPrice(), totalPrice);
        return detail;


    }
}
