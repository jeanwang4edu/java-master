package study.jeanwang2dev;

public class DeluxeBurger extends Hamburger {

    private AdditionalItem chips;
    private AdditionalItem drinks;

    public DeluxeBurger(String rolltype, String meat, double price, AdditionalItem chips, AdditionalItem drinks) {
        super("Deluxe", rolltype, meat, price);
        this.chips = chips;
        this.drinks = drinks;
        super.addItem(chips);
        super.addItem(drinks);
    }

    @Override
    public void addItem(AdditionalItem item) {
        System.out.println("No additional item can be added to the DeluxeBurger, item not added");
    }

}
