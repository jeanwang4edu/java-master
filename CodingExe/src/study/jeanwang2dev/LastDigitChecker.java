package study.jeanwang2dev;

public class LastDigitChecker {

    public static boolean hasSameLastDigit(int numA, int numB, int numC){
        // verify
        if( !( isValid(numA) && isValid(numB) && isValid(numC) ) ){
            return false;
        }
        // return true if at least two of the numbers share the same rightmost digit
        // num % 10 to get the last digit
        int lastDigitOfNumA = numA % 10;
        int lastDigitOfNumB = numB % 10;
        int lastDigitOfNumC = numC % 10;
        // System.out.println("lA: " + lastDigitOfNumA + " lB:" + lastDigitOfNumB + " lC:" + lastDigitOfNumC);

        return ( lastDigitOfNumA == lastDigitOfNumB || lastDigitOfNumA == lastDigitOfNumC || lastDigitOfNumB == lastDigitOfNumC );
    }

    public static boolean isValid(int number){
        return (number >= 10 && number <= 1000);
    }
}
