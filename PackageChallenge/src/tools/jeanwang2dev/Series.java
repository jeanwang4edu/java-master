package tools.jeanwang2dev;

/**
 * Created by jean on 12/7/20.
 */
public class Series {

    public int nSum(int n) {
        int i = 0, sum = 0;
        while( i <= n) {
            sum += i;
            i++;
        }
        return sum;
    }

    public long fibonacci(int n) {
        if( n == 0 ) return 0;
        if( n == 1 ) return 1;
        // when n is bigger than or equal to 2
        int num0  = 0, num1 = 1, counter = 2, num2 = 0;
        while( counter <= n ){
            num2 = num0 + num1;
            num0 = num1;
            num1 = num2;
            counter++;
        }
        return num2;
    }

    public long factorial(int n) {
        int i = 1, result = 1;
        while( i <= n) {
            result *= i;
            i++;
        }
        return result;

    }
}
