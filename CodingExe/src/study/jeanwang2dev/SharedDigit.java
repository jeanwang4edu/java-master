package study.jeanwang2dev;

public class SharedDigit {

    public static boolean hasSharedDigit(int numOne, int numTwo){
        if( numOne < 10 || numOne > 99 || numTwo < 10 || numTwo > 99 ){
            return false;
        }

        int digit1 = numOne % 10;
        int digit2 = numOne / 10;

        int digitA = numTwo % 10;
        int digitB = numTwo / 10;

        return digit1 == digitA || digit1 == digitB || digit2 == digitA || digit2 == digitB;
    }
}
