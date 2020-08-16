public class TeenNumberChecker {

    public static boolean hasTeen( int numOne, int numTwo, int numThree ) {

//        if( isTeen(numOne) || isTeen(numTwo) || isTeen(numThree) ){
//            return true;
//        } else {
//            return false;
//        }

        return isTeen(numOne) || isTeen(numTwo) || isTeen(numThree);

    }

    public static boolean isTeen(int para) {
        return ( para >= 13 && para <= 19 );
    }
}
