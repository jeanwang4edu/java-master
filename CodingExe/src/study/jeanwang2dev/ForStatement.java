package study.jeanwang2dev;

public class ForStatement {

    public static void testPrime(){

        int[] testNumbs = { 28, 89, 345, 76, 1235, 3461, 123, 11, 83};
        int count = 0;
        for (int testNum : testNumbs) {
            if (isPrime(testNum)) {
                count++;
                System.out.printf("%d is a prime number.%n", testNum);
                if (count == 3) {
                    System.out.println("Exiting for loop!");
                    break;
                }
            }

        }

    }

    public static boolean isPrime(int n){
        if( n == 1){
            return false;
        }

        for(int i=2; i<= (int)Math.sqrt(n); i++){
            //System.out.println("here: " + i);
            if( n % i == 0){
                return false;
            }
        }

        return true;
    }
}
