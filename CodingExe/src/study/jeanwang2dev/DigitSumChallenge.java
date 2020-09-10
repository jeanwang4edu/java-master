package study.jeanwang2dev;

public class DigitSumChallenge {

    public static int sumDigits(int number){
        if( number < 10 ){
            return -1;
        }

        int sum = 0;
        while( number > 0){
            // extract the lest-significant digit
            sum += number % 10;
            System.out.println("digit is " + number % 10);
            // drop the least-significant digit
            number = number / 10;
        }

        System.out.println("Sum = " + sum);
        return sum;
    }
}
