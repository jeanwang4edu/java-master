package study.jeanwang2dev;

public class EvenDigitSum {

    public static int getEvenDigitSum(int number){
        if(number < 0) return -1;

        int digit = 0, sum = 0;
        while(number > 0){
            digit = number % 10;
            if( digit % 2 == 0){
                sum += digit;
            }
            number /= 10;
        }
        return sum;
    }
}
