package study.jeanwang2dev;

import javax.swing.text.AttributeSet;

public class Main {

    public static void main(String[] args) {

        AdditionalItem lettuce = new AdditionalItem("lettuce", 0.5);
        AdditionalItem tomato = new AdditionalItem("tomato", 1.5);
        AdditionalItem carrot = new AdditionalItem("carrot", 1.2);
        AdditionalItem bellPepper = new AdditionalItem("bellPepper", 1.8);
        AdditionalItem hotPepper = new AdditionalItem("hotPepper", 2);
        AdditionalItem pickle = new AdditionalItem("Pickle", 2.5);
        AdditionalItem potatoChips = new AdditionalItem( "PotatoChips", 2.45);
        AdditionalItem cola = new AdditionalItem("Cola", 1.99);

        Hamburger burgerOne = new Hamburger("GreatBurger", "white", "chicken", 3.99);
        burgerOne.addItem(lettuce);
        burgerOne.addItem(bellPepper);
        burgerOne.addItem(carrot);
        burgerOne.addItem(tomato);
        burgerOne.addItem(hotPepper);
        System.out.println( burgerOne.showDetail() );

        HealthyBurger burgerTwo = new HealthyBurger( "HealthyBig", "pork", 4.25);
        burgerTwo.addItem(lettuce);
        burgerTwo.addItem(bellPepper);
        burgerTwo.addItem(carrot);
        burgerTwo.addItem(tomato);
        burgerTwo.addItem(hotPepper);
        burgerTwo.addItem(pickle);
        System.out.println( burgerTwo.showDetail() );

        DeluxeBurger burgerThree = new DeluxeBurger( "white", "Sausage & Bacon", 6, potatoChips, cola );
        burgerThree.addItem(lettuce);
        System.out.println( burgerThree.showDetail() );



    }
}
