package study.jeanwang2dev;

public class Main {

    public static void main(String[] args) {
//        Animal animal = new Animal("Animal", 8, 20, 1, 1);
//
//        Dog dog = new Dog("Yorkie", 8, 20, 2, 2, 2, 20, "long silky");
//        dog.eat();
////        dog.walk();
//        dog.run();

//        Outlander outlander = new Outlander(36);
//        outlander.steer(45);
//        outlander.accelerate(30);
//        outlander.accelerate(20);
//        outlander.accelerate(-42);
//        outlander.stop();

//        Circle circle = new Circle(3.75);
//        System.out.println("circle.radius= " + circle.getRadius());
//        System.out.println("circle.area= " + circle.getArea());
//        Cylinder cylinder = new Cylinder(5.55, 7.25);
//        System.out.println("cylinder.radius= " + cylinder.getRadius());
//        System.out.println("cylinder.height= " + cylinder.getHeight());
//        System.out.println("cylinder.area= " + cylinder.getArea());
//        System.out.println("cylinder.volume= " + cylinder.getVolume());

//        Rectangle rectangle = new Rectangle(5, 10);
//        System.out.println("rectangle.width= " + rectangle.getWidth());
//        System.out.println("rectangle.length= " + rectangle.getLength());
//        System.out.println("rectangle.area= " + rectangle.getArea());
//        Cuboid cuboid = new Cuboid(5, 10, 5);
//        System.out.println("cuboid.width= " + cuboid.getWidth());
//        System.out.println("cuboid.length= " + cuboid.getLength());
//        System.out.println("cuboid.area= " + cuboid.getArea());
//        System.out.println("cuboid.height= " + cuboid.getHeight());
//        System.out.println("cuboid.volume= " + cuboid.getVolume());


//         Bed bed = new Bed(79.5, 75.5, 10, "black");
//         Size lampSize = new Size(20.47, 11.35, 71);
//         FloorLamp lamp = new FloorLamp(100, "Incandescent", lampSize, "modern", "yellow");
//         Size bookshelfSize = new Size( 23.57, 9.5, 70.46);
//         Bookshelf bookshelf = new Bookshelf("Mainstay", "4SCYML", bookshelfSize, 29d, "Gray" );
//         Room myroom = new Room(bed, lamp, bookshelf);
//         System.out.println("My bed's color is " + myroom.getBed().getColor() );
//         myroom.getLamp().turnOn();
//         myroom.makeBed();
//         myroom.getBed().openDrawer();

        Printer printerOne = new Printer();
        printerOne.print(109);
        System.out.printf("printerOne has printed %d pages%n", printerOne.getNumOfPagesPrinted());
        System.out.printf("printerOne has %3.2f percent toner left%n", printerOne.getTonerLevel());
        printerOne.fillUpToner();
        printerOne.print(100);
        System.out.printf("printerOne has printed %d pages%n", printerOne.getNumOfPagesPrinted());
        System.out.printf("printerOne has %3.2f percent toner left%n", printerOne.getTonerLevel());

        Printer printerTwo = new Printer( 90, 13, true);
        printerTwo.print(200);
        System.out.printf("printerTwo has printed %d pages%n", printerTwo.getNumOfPagesPrinted());
        System.out.printf("printerTwo has %3.2f percent toner left%n", printerTwo.getTonerLevel());





    }
}
