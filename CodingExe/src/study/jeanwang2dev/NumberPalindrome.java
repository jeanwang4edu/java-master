package study.jeanwang2dev;

public class NumberPalindrome {

    public static boolean isPalindrome(int number){
        number = Math.abs(number);
        int reverse = 0;
        int lastDigit;
        int tempNumber= number;

        while( tempNumber > 0 ){
           lastDigit = tempNumber % 10;
           reverse = reverse * 10 + lastDigit;
            System.out.println("tempNumber is " + tempNumber);
           // System.out.println("lastDigit is " + lastDigit );
           tempNumber /= 10;


        }

        System.out.printf("the reverse number of %d is %d%n", number, reverse);
        return number == reverse;
    }
}
