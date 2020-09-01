package study.jeanwang2dev;

public class Main {

    public static void main(String[] args) {
        double feet = 8;
        double inches = 0;
	    double centimeters = calcFeetAndInchesToCentimeters(feet, inches);
	    if( centimeters != -1) {
            System.out.printf("%5.2f feet and %5.2f inches equals to %5.4f centimeters%n", feet, inches, centimeters);
        } else {
            System.out.println("invalid parameter");
        }

        inches = 157;
        centimeters = calcFeetAndInchesToCentimeters(inches);
        if( centimeters != -1) {
            System.out.printf("%5.2f inches equals to %5.4f centimeters%n", inches, centimeters);
        } else {
            System.out.println("invalid parameter");
        }
    }

    public static double calcFeetAndInchesToCentimeters(double feet, double inches){
        // validate the parameters
        if(feet < 0 || inches < 0 || inches > 12 ) {
            return -1;
        }
        // calculate the centimeters
        double totalInches = feet * 12d + inches;
        return totalInches * 2.54d;
    }

    public static double calcFeetAndInchesToCentimeters(double inches){
        // validate
        if( inches < 0 ) {
            return -1;
        }
        // calculate feet and inches
        double feet = (int) inches / 12  ;
        double remainder_inches = inches - feet * 12;
        // double remainder_inches = (int) inches % 12;
        System.out.printf("%5.0f feet and %5.0f inches%n", feet, remainder_inches);
        // call the other method and get the right centimeter value
        return calcFeetAndInchesToCentimeters(feet, remainder_inches);

    }



}
