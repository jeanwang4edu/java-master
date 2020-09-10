package study.jeanwang2dev;

public class SharedDigit {

    public static boolean hasSharedDigit(int numOne, int numTwo){
        if( numOne < 10 || numOne > 99 || numTwo < 10 || numTwo > 99 ){
            return false;
        }

        int digit1 = numOne % 10;
        int digit2 = numOne / 10;

        int digit3 = numTwo % 10;
        int digit4 = numTwo / 10;

        return digit1 == digit3 || digit1 == digit4 || digit2 == digit3 || digit2 == digit4;
    }
}
