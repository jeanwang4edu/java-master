package study.jeanwang2dev;

public class HealthyBurger extends Hamburger {

    private AdditionalItem itemFive;
    private AdditionalItem itemSix;

    public HealthyBurger(String name, String meat, double price) {
        super("Healthy", "Brown Rye", meat, price);
    }

    @Override
    public void addItem(AdditionalItem item) {
        if(numOfAdditionalItem > 6){
            System.out.println("You've already have 4 additional items on your burger, item not added.");
        } else if( numOfAdditionalItem < 4) {
            super.addItem(item);
        } else {
            numOfAdditionalItem++;
            if(numOfAdditionalItem == 5) {
                itemFive = item;
                System.out.printf("Add %s for an extra %3.2f%n", itemFive.getName(), itemFive.getPrice());
            }
            if(numOfAdditionalItem == 6) {
                itemSix = item;
                System.out.printf("Add %s for an extra %3.2f%n", itemSix.getName(), itemSix.getPrice());
            }
            totalPrice += item.getPrice();
        }
    }

}
