package tools.jeanwang2dev;

/**
 * Created by jean on 12/7/20.
 */
public class Series {

    public static long nSum(int n) {
//        int i = 0, sum = 0;
//        while( i <= n) {
//            sum += i;
//            i++;
//        }
//        return sum;
        return ( n * ( n + 1 ) ) / 2;
    }

    public static long fibonacci(int n) {
        if( n == 0 ) return 0;
        if( n == 1 ) return 1;
        // when n is bigger than or equal to 2
        long nMinus1 = 1, nMinus2 = 0, fib = 0;
        int counter = 2;
        while( counter <= n ){
            fib = nMinus1 + nMinus2;
            nMinus2 = nMinus1;
            nMinus1 = fib;
            counter++;
        }
        return fib;
    }

    public static   long factorial(int n) {
        if( n == 0 ) return 1;
        int i = 1;
        long result = 1;
        while( i <= n) {
            result *= i;
            i++;
        }
        return result;

    }
}
