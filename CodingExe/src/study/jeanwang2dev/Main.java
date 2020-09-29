package study.jeanwang2dev;

//import java.util.Scanner;

class Car {

    private String name;
    private boolean engine;
    private int cylinder;
    private int wheels;

    public Car(String name, int cylinder) {
        this.name = name;
        this.cylinder = cylinder;
        this.wheels = 4;
        this.engine = true;
    }

    public String getName() {
        return name;
    }

    public int getCylinder() {
        return cylinder;
    }

    public void startEngine(){
        System.out.println("Car Start Engine");
    }

    public void accelerate(){
        System.out.println("Car accelerates");
    }

    public void brake(){
        System.out.println("Car brake");
    }

}

class Outlander extends Car {

    public Outlander() {
        super("Outlander", 6);
    }

    @Override
    public void startEngine() {
        System.out.println("Outlander Start Engine");
    }

    @Override
    public void accelerate() {
        System.out.println("Outlander accelerates");
    }

    @Override
    public void brake() {
        System.out.println("Outlander brake");
    }
}

class Accord extends Car {

    public Accord() {
        super("Accord", 6);
    }

    @Override
    public void startEngine() {
        System.out.println("Accord Start Engine");
    }

    @Override
    public void accelerate() {
        System.out.println("Accord accelerates");
    }

    @Override
    public void brake() {
        System.out.println("Accord brake");
    }
}

class Mitsubishi extends Car {

    public Mitsubishi() {
        super("Mitsubishi", 6);
    }

    @Override
    public void startEngine() {
        System.out.println("Mitsubishi Start Engine");
    }

    @Override
    public void accelerate() {
        System.out.println("Mitsubishi accelerates");
    }

    @Override
    public void brake() {
        System.out.println("Mitsubishi brake");
    }
}




public class Main {

    public static void main(String[] args) {

        Car car = new Car("Base car",8);
        car.startEngine();
        car.accelerate();
        car.brake();

        Outlander outlander = new Outlander();
        outlander.startEngine();
        outlander.accelerate();
        outlander.brake();

        Accord accord = new Accord();
        accord.startEngine();
        accord.accelerate();
        accord.brake();
//        ComplexNumber one = new ComplexNumber(1.0, 1.0);
//        ComplexNumber number = new ComplexNumber(2.5, -1.5);
//        one.add(1,1);
//        System.out.println("one.real= " + one.getReal());
//        System.out.println("one.imaginary= " + one.getImaginary());
//        one.subtract(number);
//        System.out.println("one.real= " + one.getReal());
//        System.out.println("one.imaginary= " + one.getImaginary());
//        number.subtract(one);
//        System.out.println("number.real= " + number.getReal());
//        System.out.println("number.imaginary= " + number.getImaginary());
//        Point first = new Point(6,5);
//        Point second = new Point(3,1);
//        System.out.println("distance(0,0)= " + first.distance() );
//        System.out.println("distance(second)= " + first.distance(second));
//        System.out.println("distance(2,2)= " + first.distance(2,2));
//        Point point = new Point();
//        System.out.println("distance()= " + point.distance());
//          Wall wall = new Wall(1.125,-1.0);
//          System.out.println("area= " + wall.getArea());
//
//          wall.setHeight(-1.5);
//          System.out.println("width= " + wall.getWidth());
//          System.out.println("height= " + wall.getHeight());
//          System.out.println("area= " + wall.getArea());

//          VipCustomer customer = new VipCustomer();
//          System.out.println( "customer: " + customer.getName() + " has credit limit: " + customer.getCredit_limit() + " and its email is: " + customer.getEmail_address() );
//          VipCustomer customer1 = new VipCustomer("Kate", 230.78, "kate@email.com");
//          System.out.println( "customer1: " + customer1.getName() + " has credit limit: " + customer1.getCredit_limit() + " and its email is: " + customer1.getEmail_address() );
//          VipCustomer customer2 = new VipCustomer(440.89d);
//          System.out.println( "customer2: " + customer2.getName() + " has credit limit: " + customer2.getCredit_limit() + " and its email is: " + customer2.getEmail_address() );

//          Account accOne = new Account();
//          accOne.setNumber("001");
//          accOne.setBalance(120);
//          accOne.setCustomerName("Kate Smith");
//          accOne.setCustomerEmailAddress("kate@abc.com");
//          accOne.setCustomerPhoneNumber("(734)222-3465");
//          accOne.withdraw(300);
//          accOne.withdraw(10);
//          accOne.deposit(200);
//          System.out.printf("account number %s, customer name %s and the balance is %5.2f ", accOne.getNumber(), accOne.getCustomerName(), accOne.getBalance());

//          Person person = new Person();
//          person.setFirstName("");
//          person.setLastName("");
//          person.setAge(10);
//          System.out.println("fullName= " + person.getFullName());
//          System.out.println("teen= " + person.isTeen());
//          person.setFirstName("John");
//          person.setAge(18);
//          System.out.println("fullName= " + person.getFullName());
//          System.out.println("teen= " + person.isTeen());
//          person.setLastName("Smith");
//          System.out.println("fullName= " + person.getFullName());

//        SimpleCalculator calculator= new SimpleCalculator();
//        calculator.setFirstNumber(5.0);
//        calculator.setSecondNumber(4);
//        System.out.println("add= " + calculator.getAdditionResult());
//        System.out.println("subtract= " + calculator.getSubtractionResult());
//        calculator.setFirstNumber(5.25);
//        calculator.setSecondNumber(0);
//        System.out.println("multiply= " + calculator.getMultiplicationResult());
//        System.out.println("divide=" + calculator.getDivisionResult());
//        System.out.println(AreaCalculator.area(5.0));
//        System.out.println(AreaCalculator.area(-1));
//        System.out.println(AreaCalculator.area(5.0, 4.0));
//        System.out.println(AreaCalculator.area(-1.0, 4.0));

//        MinutesToYearsDaysCalculator.printYearsAndDays(525600);
//        MinutesToYearsDaysCalculator.printYearsAndDays(1051200);
//        MinutesToYearsDaysCalculator.printYearsAndDays(561600);

//        IntEqualityPrinter.printEqual(1,1,1);
//        IntEqualityPrinter.printEqual(1,1,2);
//        IntEqualityPrinter.printEqual(-1,-1,-1);
//        IntEqualityPrinter.printEqual(1,2,3);

//        System.out.println( PlayingCat.isCatPlaying(true, 10)) ;
//        System.out.println(PlayingCat.isCatPlaying( false, 36));
//        System.out.println(PlayingCat.isCatPlaying( false, 35));

//        NumberInWord.printNumberInWord(-1);
//        NumberInWord.printNumberInWord(1);
//        NumberInWord.printNumberInWord(2);
//        NumberInWord.printNumberInWord(3);
//        NumberInWord.printNumberInWord(4);
//        NumberInWord.printNumberInWord(5);
//        NumberInWord.printNumberInWord(6);
//        NumberInWord.printNumberInWord(8);
//        NumberInWord.printNumberInWord(9);

//        System.out.println( NumberOfDaysInMonth.isLeapYear(-1600) );
//        System.out.println( NumberOfDaysInMonth.isLeapYear(1600) );
//        System.out.println( NumberOfDaysInMonth.isLeapYear(2017) );
//        System.out.println( NumberOfDaysInMonth.isLeapYear(2000) );

//        System.out.println( NumberOfDaysInMonth.getDaysInMonth(1, 2020));
//        System.out.println( NumberOfDaysInMonth.getDaysInMonth(2, 2020));
//        System.out.println( NumberOfDaysInMonth.getDaysInMonth(2, 2018));
//        System.out.println( NumberOfDaysInMonth.getDaysInMonth(-1, 2020));

//        System.out.println( ForStatement.isPrime(179) );
//        MathDemo.sqrt();
//        ForStatement.testPrime();

//        Sum3and5Challenge.challengeResult();

//        System.out.println( SumOddRange.sumOdd(100,1000) );
//        System.out.println( DigitSumChallenge.sumDigits(1569) );
//        System.out.println( DigitSumChallenge.sumDigits(-1569) );
//        System.out.println( DigitSumChallenge.sumDigits(9) );

//        System.out.println(NumberPalindrome.isPalindrome(-12860533));
//        System.out.println( FirstLastDigitSum.sumFirstAndLastDigit(245769) );

//        System.out.println(EvenDigitSum.getEvenDigitSum(123456789));
//        System.out.println(EvenDigitSum.getEvenDigitSum(252));
//        System.out.println(EvenDigitSum.getEvenDigitSum(-22));

//        System.out.println(SharedDigit.hasSharedDigit(12, 23));
//        System.out.println(SharedDigit.hasSharedDigit(9, 99));
//        System.out.println(SharedDigit.hasSharedDigit(15, 55));

//        System.out.println( LastDigitChecker.hasSameLastDigit(41,22, 71));
//        System.out.println( LastDigitChecker.hasSameLastDigit(23,32, 42));
//        System.out.println( LastDigitChecker.hasSameLastDigit(9,99,999));
//        System.out.println( LastDigitChecker.isValid(1051));

//        System.out.println(GreatestCommonDivisor.getGreatestCommonDivisor(25,15));
//        System.out.println(GreatestCommonDivisor.getGreatestCommonDivisor(12,30));
//        System.out.println(GreatestCommonDivisor.getGreatestCommonDivisor(9,18));
//        System.out.println(GreatestCommonDivisor.getGreatestCommonDivisor(81,153));

//        FactorPrinter.printFactors(6);
//        System.out.println( PerfectNumber.isPerfectNumber( 6 ));
//        System.out.println( PerfectNumber.isPerfectNumber( 28));
//        System.out.println( PerfectNumber.isPerfectNumber( 5 ));
//        System.out.println( PerfectNumber.isPerfectNumber( -1 ));

//        NumberToWords.numberToWords(-1007);

//        System.out.println("***********");
//        System.out.println(NumberToWords.reverse(0));
//
//        System.out.println("***********");
//        System.out.println(NumberToWords.getDigitCount(-12));
//
//        System.out.println("***********");
//        NumberToWords.numberToWords(0);
//
//        System.out.println("***********");
//        NumberToWords.numberToWords(1010);
//
//        System.out.println("***********");
//        NumberToWords.numberToWords(2000);
//
//        System.out.println("***********");
//        NumberToWords.numberToWords(-12);
//        System.out.println( FlourPacker.canPack(1, 0, 4));
//        System.out.println( FlourPacker.canPack(1, 0, 5));
//        System.out.println( FlourPacker.canPack(0, 5, 4));

//        System.out.println(LargestPrime.getLargestPrime(7));
//        System.out.println(LargestPrime.getLargestPrime(30));
//        System.out.println(LargestPrime.getLargestPrime(0));
//        System.out.println(LargestPrime.getLargestPrime(45));
//        System.out.println(LargestPrime.getLargestPrime(-1));
//        System.out.println(LargestPrime.getLargestPrime(217));

//        DiagonalStar.printSquareStar(7);

//        ReadingUserInputChallenge.readTenNums();
//        MinAndMaxInputChallenge.getMinAndMax();
//        InputCalculator.inputThenPrintSumAndAverage();
//        System.out.println(PaintJob.getBucketCount(-3.4,2.1, 1.5, 2));
//        System.out.println(PaintJob.getBucketCount(2.75,3.25, 2.5, 1));
//        System.out.println(PaintJob.getBucketCount(3.4, 2.1, 1.5));
//        System.out.println(PaintJob.getBucketCount(7.25, 4.3, 2.35));
//        System.out.println(PaintJob.getBucketCount( 3.4, 1.5));
//        System.out.println(PaintJob.getBucketCount( 3.26, 0.75));
    }
}
