package study.jeanwang2dev;

public class NumberToWords {

    public static void numberToWords(int number){
        if( number < 0 ){
            System.out.println("Invalid Value");
        } else {
            int lastDigit;
            int reversed = reverse(number);
//            System.out.println("the reversed is " + reversed);
            int numDigitCount = getDigitCount(number);

            while (numDigitCount != 0) {
                lastDigit = reversed % 10;
                reversed /= 10;
                switch (lastDigit) {
                    case 0:
                        System.out.println("Zero");
                        break;
                    case 1:
                        System.out.println("One");
                        break;
                    case 2:
                        System.out.println("Two");
                        break;
                    case 3:
                        System.out.println("Three");
                        break;
                    case 4:
                        System.out.println("Four");
                        break;
                    case 5:
                        System.out.println("Five");
                        break;
                    case 6:
                        System.out.println("Six");
                        break;
                    case 7:
                        System.out.println("Seven");
                        break;
                    case 8:
                        System.out.println("Eight");
                        break;
                    case 9:
                        System.out.println("Nine");
                        break;

                    default:
                        System.out.println("Invalid Number");
                        break;
                }
                numDigitCount--;
            }
        }

    }

    public static int reverse(int number){
        int reverse = 0, lastDigit;
        //int oriNumber = number;
        while( number != 0 ){
            lastDigit = number % 10;
            reverse = reverse * 10 + lastDigit;
            number /= 10;
        }

        return reverse;
    }

    public static int getDigitCount(int number){
        if(number < 0) return -1;
        if(number == 0) return 1;
        int count = 0;
        while( number != 0){
            number /= 10;
            count++;
        }
        return count;
    }
}
