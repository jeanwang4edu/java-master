package study.jeanwang2dev;

public class FirstLastDigitSum {

    public static int sumFirstAndLastDigit(int number){
        if( number < 0 ){
            return -1;
        }

        int lastDigit = number % 10;
        while( number >=  10 ){
            number /= 10;
            System.out.println("the number is " + number);
        }
        int firstDigit = number;

        return firstDigit + lastDigit;
    }
}


