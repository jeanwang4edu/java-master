package study.jeanwang2dev;

/**
 * Write a method named getLargestPrime with one parameter of type in named number
 * if the number is negative or dose not have any prime numbers, the method should return -1 to indicate an invalid value
 * The method should calculate the largest prime factor of a given number and return it
 */
public class LargestPrime {

    public static int getLargestPrime(int number){
        if( number <= 1 ) return -1;

        int divisor = 2;
        while( divisor < number ){
            if( number % divisor != 0 ){
                divisor++;
            } else {
                number /= divisor;
                divisor = 2;
            }
        }

        return number;
    }

}
//public class LargestPrime {
//
//    public static int getLargestPrime(int number) {
//        int testNumber = number;
//
//        if (number <= 1) {
//            return -1;
//        }
//
//        while (testNumber >= 2){
//            boolean isPrime = true;
//            if (number % testNumber == 0){
//                for (int i = 2; i <= (int)Math.sqrt(testNumber); i++){
//                    if (testNumber % i == 0){
//                        isPrime = false;
//                        break;
//                    }
//                }
//                if (isPrime){
//                    return testNumber;
//
//                }
//            }
//
//            testNumber--;
//
//        }
//
//        return -1;
//
//    }
//}
