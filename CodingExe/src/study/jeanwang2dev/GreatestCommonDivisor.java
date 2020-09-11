package study.jeanwang2dev;

public class GreatestCommonDivisor {

    public static int getGreatestCommonDivisor(int first, int second){
        if( first < 10 || second < 10 ){
            return -1;
        }
        // int gcd = 1;
        // running a for loop from 1 to the smaller number
//        for(int i = 1; i<= first && i<= second; i++){
//            if( first % i == 0 && second % i == 0 ){
//                gcd = i;
//            }
//        }
        // use Euclid's Algorithm to find GCD
        while( first != second ){
            if( first > second ){
                first -= second;
            } else{
                second -= first;
            }
        }
        return first;

    }
}
